package in.sujal.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.InitBinder;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;

import in.sujal.binding.Student;
import in.sujal.service.StudentService;

@Controller
public class StudentController {
	
//	@Autowired
//	private StudentService service;
//	
//	
//	@GetMapping("/")
//	public String loadIndexPage(Model model) {
//		return "index";
//	}
//	
//	@InitBinder //whenever request comes to any method that should call the init Binder
//	private void init(Model model) {
//		model.addAttribute("student", new Student());
//		model.addAttribute("courses", service.getCouses());
//		model.addAttribute("prefTimings",service.getTimings());
//	}
//	
//	@PostMapping("/save")
//	public String saveStudent(Student s,Model model) {
//		model.addAttribute("msg","Data Saved.....");
//		return "index";
//	}
	


	    @Autowired
	    private StudentService service;

	    @GetMapping("/")
	    public String loadIndexPage(Model model) {

	        model.addAttribute("student", new Student());
	        model.addAttribute("courses", service.getCouses());

	        return "index";
	    }

	    @PostMapping("/save")
	    public String saveStudent(Student s, Model model) {

	        System.out.println("=== SAVED DATA ===");
	        System.out.println(s);

	        model.addAttribute("msg", "Data Saved.....");

	        model.addAttribute("student", new Student());      // reset object
	        model.addAttribute("courses", service.getCouses()); // rebind dropdown

	        return "index";
	    }
	

	
}
