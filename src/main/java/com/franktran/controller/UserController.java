package com.franktran.controller;

import com.franktran.model.User;
import com.franktran.service.UserService;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.SessionAttributes;

import javax.servlet.http.HttpServletRequest;

@Controller
@SessionAttributes("username")
public class UserController {

    private final UserService userService;

    public UserController(UserService userService) {
        this.userService = userService;
    }

    @GetMapping("/")
    public String userForm(HttpServletRequest request,Model model) {
        model.addAttribute("username", request.getUserPrincipal().getName());
        model.addAttribute("users", userService.list());
        return "users";
    }

    @ModelAttribute("user")
    public User formBackingObject() {
        return new User();
    }

    @PostMapping("/addUser")
    public String saveUser(@ModelAttribute("user") User user,
                           BindingResult result, Model model) {

        if (result.hasErrors()) {
            model.addAttribute("users", userService.list());
            return "users";
        }

        userService.save(user);
        return "redirect:/";
    }

    @PostMapping("/editUser")
    public String editUser(@ModelAttribute("user") User user,
                           BindingResult result, Model model) {

        if (result.hasErrors()) {
            model.addAttribute("users", userService.list());
            return "users";
        }

        userService.save(user);
        return "redirect:/";
    }

    @GetMapping("/next")
    public String next(Model model) {
        String username = (String) model.getAttribute("username");
        System.out.println(username);
        return "redirect:/";
    }
}
