package ua.com.buygadget.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.WebDataBinder;
import org.springframework.web.bind.annotation.*;

import ua.com.buygadget.editors.GoodsEditor;

import ua.com.buygadget.editors.PostEditor;
import ua.com.buygadget.editors.TagsEditor;
import ua.com.buygadget.entity.Goods;
import ua.com.buygadget.entity.Post;
import ua.com.buygadget.entity.Tag;
import ua.com.buygadget.service.GoodsService;
import ua.com.buygadget.service.PostService;
import ua.com.buygadget.service.TagService;

@Controller
public class PostController {

	@Autowired
	private PostService postService;
	@Autowired
	private TagService tagService;
	@Autowired
	private GoodsService goodsService;
	//Using @ModelAtribute
	@InitBinder
	public void init(WebDataBinder binder){
		binder.registerCustomEditor(Tag.class,new TagsEditor());
//		binder.registerCustomEditor(Post.class,new PostEditor());
		binder.registerCustomEditor(Goods.class,new GoodsEditor());

	}


	@GetMapping("/post")
	public String addPost(Model model){
		
		model.addAttribute("posts", postService.finAllPostWithGoodsAndTags());
		model.addAttribute("tags", tagService.getAll());
		model.addAttribute("goods",goodsService.getAll());

		model.addAttribute("post",new Post());// using @ModelAtribute
		return "views-admin-post";
	}
	@PostMapping("/post")
	public String addPost(@ModelAttribute Post post){
		//Using @RequestParam
// @RequestParam String title, @RequestParam String text,@RequestParam List<Integer> tags,@RequestParam List<Integer> goods
//		postService.save(new Post(title, text),tags,goods);
		//Using @ModelAtribute
		postService.save(post);
		
		return "redirect:/post";
	}
	@GetMapping("/deletpost/id={id}")
			public String deletpost(@PathVariable int id){
		
		postService.delet(id);
		
		return "redirect:/post";
	}
	
}
