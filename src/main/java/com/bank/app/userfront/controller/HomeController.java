package com.bank.app.userfront.controller;

import com.bank.app.userfront.domain.User;
import com.bank.app.userfront.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
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

    @Autowired
    private UserService userService;

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

    @RequestMapping(value = "/signup", method = RequestMethod.POST)
    public String registerUser(@ModelAttribute("user") User user, Model model){
        if(userService.checkUserExists(user.getUsername(),user.getEmail())){
            if(userService.checkUsernameExists(user.getUsername())){
                model.addAttribute("emailExists",true);
            }
            if(userService.checkEmailExists(user.getEmail())){
                model.addAttribute("usernameExists",true);
            }
            return "signup";
        }
        else{
            userService.saveUser(user);
            return "redirect:/";
        }
    }

}
