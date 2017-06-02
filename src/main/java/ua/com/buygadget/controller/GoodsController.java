package ua.com.buygadget.controller;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;

import org.springframework.web.bind.WebDataBinder;
import org.springframework.web.bind.annotation.*;

import ua.com.buygadget.editors.BrendEditor;
import ua.com.buygadget.editors.CategoryEditor;
import ua.com.buygadget.editors.ColorEditor;
import ua.com.buygadget.entity.Brend;
import ua.com.buygadget.entity.Category;
import ua.com.buygadget.entity.Color;
import ua.com.buygadget.entity.Goods;
import ua.com.buygadget.service.BrandService;
import ua.com.buygadget.service.CategoryService;
import ua.com.buygadget.service.ColorService;
import ua.com.buygadget.service.GoodsService;
import ua.com.buygadget.validation.goods.GoodsExeption;
import ua.com.buygadget.validation.goods.GoodsValidationMessage;
import ua.com.buygadget.validation.user.UserExeption;

@Controller
public class GoodsController {

	@Autowired 
	GoodsService goodsService;
	@Autowired
	BrandService brandService;
	@Autowired 
	ColorService colorService;
	@Autowired
	CategoryService categoryService;

	@InitBinder
	public void init(WebDataBinder binder){
		binder.registerCustomEditor(Color.class,new ColorEditor());
		binder.registerCustomEditor(Category.class,new CategoryEditor());
		binder.registerCustomEditor(Brend.class,new BrendEditor());

	}

	@GetMapping("/addgoods")
	public String addGoods(Model model){
		model.addAttribute("goods", goodsService.getAll());
		model.addAttribute("brends", brandService.getAll());
		model.addAttribute("colors", colorService.getAll());
		model.addAttribute("categorys", categoryService.getAll());
		model.addAttribute("oneGoods",new Goods());
		return "views-admin-addgoods";
	}

	@PostMapping("/addgoods")
	public String addGoods(@ModelAttribute Goods goods, Model model) throws UserExeption {

//		Goods goods = new Goods(GoodsName, GoodsPrice, GoodsAmoust);
//		System.out.println(brend);
//        System.out.println(goods.getColor().getClorName());
		try {
			goodsService.save(goods);
		} catch (GoodsExeption e) {
			if(e.getMessage().equals(GoodsValidationMessage.AMOUST_MOUST_BE_NUMBER)){
				System.out.println(e.getMessage());
				System.out.println(e.getMessage());
				System.out.println(e.getMessage());
				model.addAttribute("AmoustExeption",e.getMessage());
				return "views-admin-addgoods";
			}


		}
		return "redirect:/addgoods";
	}
	@GetMapping("/deletgoods/id={id}")
	public String deletGoods(@PathVariable int id){
		System.out.println(id);
		goodsService.delet(id);
		return "redirect:/addgoods";
	}
	@GetMapping("/updateGoods/id={id}")
	public String updateGoods(Model model,@PathVariable int id){

        Goods goods = goodsService.getForId(id);
        System.out.println(goods.getName());
        model.addAttribute("goods",goods);
		return "views-admin-updateGoods";
	}
	@PostMapping("/updateGoods/id={id}")
	public String updateGoods(@RequestParam String GoodsName,@RequestParam int GoodsAmoust, @RequestParam int GoodsPrice,@PathVariable int id){
		Goods goods = new Goods(GoodsName, GoodsPrice, GoodsAmoust);
        goods.setId(id);
		goodsService.update(goods);
		return "redirect:/addgoods";
	}
	
	

	
	
	
	
	
	
	
	
	
	
	
	
	
//	@GetMapping("/updateGoods/id={id}")
//	public String update(Model model, @PathVariable int id){
//		
//		
//		
//		model.addAttribute("goods", goodsService.getForId(id));
////		goodsService.update(goods);
//		return "updateGoods";
//	}
//	@PostMapping("/updateGoods/id={id}")
//	public String saveUpdate(@RequestParam String GoodsName,@RequestParam int GoodsAmoust, @RequestParam int GoodsPrice,  @PathVariable  int id){
//		Goods goods = new Goods(GoodsName, GoodsPrice, GoodsAmoust);
//		goods.setId(id);
//		goodsService.update(goods);
//		return "redirect:/addgoods";
//		
//	}
}
