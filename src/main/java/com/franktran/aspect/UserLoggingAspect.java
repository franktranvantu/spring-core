package com.franktran.aspect;

import com.franktran.model.User;
import com.franktran.service.UserService;
import org.apache.log4j.Logger;
import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.annotation.After;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.aspectj.lang.annotation.Pointcut;
import org.aspectj.lang.reflect.MethodSignature;
import org.springframework.context.annotation.EnableAspectJAutoProxy;
import org.springframework.stereotype.Component;

@Component
@Aspect
@EnableAspectJAutoProxy
public class UserLoggingAspect {

    private static final Logger LOGGER = Logger.getLogger(UserService.class);

    @Pointcut("execution(* com.franktran.service.UserService.*(..))")
    public void cutAllMethods() {}

    @Before("cutAllMethods()")
    public void beforeAdvice(JoinPoint joinPoint) {
        String methodName = getMethodName(joinPoint);
        switch (methodName) {
            case "list":
                LOGGER.info("Going to get all users");
                break;
            case "save":
                Object[] args = joinPoint.getArgs();
                User user = (User) args[0];
                LOGGER.info(String.format("Going to create user: %s", user));
        }
    }

    @After("cutAllMethods()")
    public void afterAdvice(JoinPoint joinPoint) {
        String methodName = getMethodName(joinPoint);
        switch (methodName) {
            case "list":
                LOGGER.info("After get all users");
                break;
            case "save":
                LOGGER.info("Created user successful!");
                break;
        }
    }

    private String getMethodName(JoinPoint joinPoint) {
        MethodSignature methodSignature = (MethodSignature) joinPoint.getSignature();
        return methodSignature.getName();
    }
}
