package com.franktran.mvc.controller;

import com.franktran.mvc.model.User;
import com.franktran.mvc.service.UserService;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;

@Controller
public class UserController {

    private final UserService userService;

    public UserController(UserService userService) {
        this.userService = userService;
    }

    @GetMapping("/")
    public String userForm(Model model) {
        model.addAttribute("users", userService.list());
        return "mvc/users";
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
            return "mvc/users";
        }

        userService.save(user);
        return "redirect:/";
    }

    @PostMapping("/editUser")
    public String editUser(@ModelAttribute("user") User user,
                           BindingResult result, Model model) {

        if (result.hasErrors()) {
            model.addAttribute("users", userService.list());
            return "mvc/users";
        }

        userService.save(user);
        return "redirect:/";
    }
}
