package com.bank.app.userfront.controller;

import com.bank.app.userfront.domain.User;
import com.bank.app.userfront.service.UserService;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

/**
 * Created by Bhaskar on 3/3/2017.
 */
@Controller
public class HomeController {


    @RequestMapping("/")
    public String home() {
        return "redirect:/index";
    }

    @RequestMapping("/index")
    public String index() {
        return "index";
    }

    @RequestMapping(value = "/signup", method = RequestMethod.GET)
    public String signup(Model model){
        User user = new User();

        model.addAttribute("user", user);

        return "signup";
    }

}
