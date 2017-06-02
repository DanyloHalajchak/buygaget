package ua.com.buygadget.controller;

import com.sun.tracing.dtrace.ModuleAttributes;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

import ua.com.buygadget.entity.Brend;
import ua.com.buygadget.entity.Color;
import ua.com.buygadget.service.BrandService;
import ua.com.buygadget.service.ColorService;

@Controller
public class ColorController {

	@Autowired
	ColorService colorService;
	@GetMapping("/color")
	public String addCategory(Model model){
		model.addAttribute("colors", colorService.getAll());
		model.addAttribute("color",new Color());
		return "views-admin-color";
		
	}
	@PostMapping("/color")
	public String addCategory(@ModelAttribute Color color){
		colorService.save(color);
		return "redirect:/color";
	}
	@GetMapping("/deletcolor/id={id}")
	public String deletColor(@PathVariable int id){
		
		colorService.delet(id);
		
		return "redirect:/color";
	}
	
}
