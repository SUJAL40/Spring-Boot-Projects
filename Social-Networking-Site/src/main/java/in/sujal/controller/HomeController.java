package in.sujal.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

import in.sujal.repo.PostRepo;

@Controller
public class HomeController {
	@Autowired
    private PostRepo postRepo;

    @GetMapping("/")
    public String home(Model model) {
        model.addAttribute("posts", postRepo.findAll());
        return "home";
    }
}
