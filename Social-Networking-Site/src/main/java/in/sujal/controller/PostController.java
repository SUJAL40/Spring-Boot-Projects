package in.sujal.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;
import in.sujal.model.Post;
import in.sujal.repo.PostRepo;

import java.time.LocalDateTime;

@Controller
public class PostController {

    @Autowired
    private PostRepo postRepo;

    @PostMapping("/post/create")
    public String createPost(@RequestParam String content) {
        Post p = new Post();
        p.setContent(content);
        p.setCreatedAt(LocalDateTime.now());
        postRepo.save(p);
        return "redirect:/";
    }
}