package ua.com.buygadget.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

import ua.com.buygadget.entity.Brend;
import ua.com.buygadget.entity.Category;
import ua.com.buygadget.service.BrandService;
import ua.com.buygadget.service.CategoryService;
@Controller
public class BrendController {

	@Autowired
	private BrandService brandService;
	@GetMapping("/brend")
	public String addCategory(Model model){
		model.addAttribute("brends", brandService.getAll());
		model.addAttribute("brend",new Brend());
		return "views-admin-brend";
		
	}
	@PostMapping("/brend")
	public String addCategory(@ModelAttribute Brend brend){
		brandService.save(brend);
		return "redirect:/brend";
	}
	@GetMapping("/deletbrend/id={id}")
	public String deletBrend(@PathVariable int id){
		
		brandService.delet(id);
		
		return "redirect:/brend";
	}
	
}
