package technicalblog.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import technicalblog.model.User;
import technicalblog.service.PostService;
import technicalblog.service.UserService;

@Controller
public class UserController {

    @Autowired
    private PostService postService;

    @Autowired
    private UserService userService;

    @RequestMapping("users/login")
    public String login(){
        return "users/login";
    }

    @RequestMapping("users/registration")
    public String registration(){
        return "users/registration";
    }


    @RequestMapping(value = "users/login", method = RequestMethod.POST)
    public String loginUser(User user){
        if(userService.login(user)) {
            return "redirect:/posts";
        }
        else {
            return "users/login";
        }

    }

    @RequestMapping(value = "users/Logout")
    public String logout(Model model){
        model.addAttribute("posts",postService.getAllPost());
        return "index";
    }


    @RequestMapping(value = "users/registration", method = RequestMethod.POST)
    public String registrationUser(){
        return "users/login";
    }

}
