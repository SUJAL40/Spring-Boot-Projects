package in.sujal.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;

import in.sujal.binding.Student;
import in.sujal.service.StudentService;

@Controller
public class StudentController {

    @Autowired
    private StudentService service;

    // Load common data for every request
    @ModelAttribute
    public void loadFormData(Model model) {
        model.addAttribute("courses", service.getCouses());
        model.addAttribute("prefTimings", service.getTimings());
    }

    @GetMapping("/")
    public String loadIndexPage(Model model) {
        model.addAttribute("student", new Student());
        return "index";
    }

    @PostMapping("/save")
    public String handleSubmit(Student s, Model model) {

        boolean isSaved = service.saveStudent(s);

        if (isSaved) {
            model.addAttribute("msg", "Data Saved Successfully...");
        } else {
            model.addAttribute("msg", "Failed to Save Data!");
        }

        model.addAttribute("student", new Student()); // reset form

        return "index";
    }
}
