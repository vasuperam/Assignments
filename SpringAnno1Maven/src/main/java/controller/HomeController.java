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
@RequestMapping(value="/calculator")
public class HomeController {
	
	@RequestMapping(value="/home")
	String home( Model model){
		System.out.print("home");
		model.addAttribute("results","Helo");
		return "home";
	}
	
	@RequestMapping(value="/add/{value1}/{value2}")
	String add(@PathVariable("value1") int value1, @PathVariable("value2") int value2, Model model){
		System.out.print("add");
		model.addAttribute("results",value1+value2);
		return "home";
	}
	
	
	@RequestMapping(value="/sub/{value1}/{value2}")
	String sub(@PathVariable("value1") int value1, @PathVariable("value2") int value2, Model model){
		System.out.print("sub");
		model.addAttribute("results",value1-value2);
		return "home";
	}
	
	@GetMapping(value="/mul")
	String mul(@RequestParam("value1") int value1, @RequestParam("value2") int value2, Model model){
		System.out.print("mul");
		model.addAttribute("results",value1*value2);
		return "home";
	}
	
	@GetMapping(value="/calculate/{value1}")
	String calculate(@PathVariable int value1, @MatrixVariable String value2, Model model) {
		
		model.addAttribute("results",0);
			//@MatrixVariable("value2") int value2, @MatrixVariable("operation") String operation){
		//System.out.print("operation -->"+operation);
		//model.addAttribute("results",value1*value2);
		return "home";
	}
	
	@PostMapping(value="/post")
	String calculate(@ModelAttribute("student") Student student, Model model) {
		
		System.out.print(student);
		model.addAttribute("results",student);
			//@MatrixVariable("value2") int value2, @MatrixVariable("operation") String operation){
		//System.out.print("operation -->"+operation);
		//model.addAttribute("results",value1*value2);
		return "home";
	}

}
