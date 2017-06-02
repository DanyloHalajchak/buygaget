package ua.com.buygadget.controller;



import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;


import ua.com.buygadget.entity.Color;
import ua.com.buygadget.entity.Tag;
import ua.com.buygadget.service.ColorService;
import ua.com.buygadget.service.TagService;

@Controller
public class TagController {

	@Autowired
	private TagService tagService;
	@GetMapping("/tag")
	public String addCategory(Model model){
		model.addAttribute("tags", tagService.getAll());
		model.addAttribute("tag",new Tag());
		return "views-admin-tag";
		
	}
	@PostMapping("/tag")
	public String addCategory(@ModelAttribute Tag tag){
		
		tagService.save(tag);
		return "redirect:/tag";
	}
	@GetMapping("/delettag/id={id}")
	public String deletColor(@PathVariable int id){
		
		tagService.delet(id);
		
		return "redirect:/tag";
	}
	
}
