package controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.MatrixVariable;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
@RequestMapping(value="/api")
public class StudentController {
	
	@PostMapping(value="/post")
	String calculate(@ModelAttribute("student") Student student, Model model) {
		
		System.out.print(student);
		model.addAttribute("results",student);
			//@MatrixVariable("value2") int value2, @MatrixVariable("operation") String operation){
		//System.out.print("operation -->"+operation);
		//model.addAttribute("results",value1*value2);
		return "student";
	}

}
