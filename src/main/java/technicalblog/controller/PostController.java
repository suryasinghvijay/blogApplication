package technicalblog.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import technicalblog.service.PostService;

@Controller
public class PostController {

    @Autowired
    private PostService postService;

    @RequestMapping("/posts")
    public String getUserPost(Model model){
        model.addAttribute("posts", postService.getPost());
        return "post";
    }
    @RequestMapping("/createPost")
    public String createNewPost(){
        return "newPost";
    }
}
