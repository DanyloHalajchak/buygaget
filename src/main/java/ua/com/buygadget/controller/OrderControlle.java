package ua.com.buygadget.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import ua.com.buygadget.entity.Goods;
import ua.com.buygadget.service.GoodsService;
import ua.com.buygadget.service.OrderService;

/**
 * Created by user on 24.05.2017.
 */
@Controller
public class OrderControlle {

    @Autowired
    private OrderService orderService;
    @Autowired
    private GoodsService goodsService;

    @GetMapping
    public String order(Model model){
        model.addAttribute("Orders",orderService.getAll());
        model.addAttribute("Goods",goodsService.getAll());
        return "views-admin-order";
    }

}
