package ua.com.buygadget.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import ua.com.buygadget.entity.Goods;
import ua.com.buygadget.entity.Post;
import ua.com.buygadget.service.PostService;

@Controller
public class IndexController {
@Autowired
PostService postService;
	@GetMapping("/")
//	@RequestMapping(value="/a",method=RequestMethod.GET)
	public String index(){
		
		return "views-index-index";
		
	}
	
}
