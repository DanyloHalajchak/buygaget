package ua.com.buygadget.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

import ua.com.buygadget.entity.Category;
import ua.com.buygadget.service.CategoryService;

@Controller
public class CategoryController {
	@Autowired
	CategoryService categoryService;
	@GetMapping("/category")
	public String addCategory(Model model){
		model.addAttribute("categorys", categoryService.getAll());
		model.addAttribute("category",new Category());
		return "views-admin-category";
		
	}
	@PostMapping("/category")
	public String addCategory(@ModelAttribute Category category){
		categoryService.save(category);
		return "redirect:/category";
	}
	
	@GetMapping("/deletcategory/id={id}")
	public String deletBrend(@PathVariable int id){
		
		categoryService.delet(id);
		
		return "redirect:/category";
	}
	
}
