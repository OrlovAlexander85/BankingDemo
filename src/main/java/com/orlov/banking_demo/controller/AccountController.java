package com.orlov.banking_demo.controller;

import com.orlov.banking_demo.object.UserDTO;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;

@Controller
public class AccountController {

    private static final Logger log = LoggerFactory.getLogger(AccountController.class);

    @GetMapping("/register")
    public String register(@ModelAttribute UserDTO userDTO, Model model) {
        model.addAttribute("userDTO", userDTO);
        return "register";
    }

    @PostMapping("register")
    public void save(UserDTO userDTO) {
        log.info(">> userDTO : {}", userDTO.toString());
    }
}
