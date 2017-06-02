package ua.com.buygadget.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;

import ua.com.buygadget.entity.User;
import ua.com.buygadget.service.UsersService;
import ua.com.buygadget.validation.goods.GoodsExeption;
import ua.com.buygadget.validation.user.UserExeption;
import ua.com.buygadget.validation.user.UserValidationMessage;

@Controller
public class UserControlle {

	@Autowired
	UsersService userService;
	
	@GetMapping("/registration")
	public String registration(Model model){
		model.addAttribute("users", userService.getAll());
		model.addAttribute("user",new User());
		return "views-user-registration";
	}
	
	@PostMapping("/registration")
	public String save(@ModelAttribute User user,Model model) throws GoodsExeption {

		try {
			userService.save(user);
		} catch (UserExeption e) {
			if(e.getMessage().equals(UserValidationMessage.NAME_IS_EMPTY)){
				model.addAttribute("NameExeption",e.getMessage());
			}else if(e.getMessage().equals(UserValidationMessage.SENAME_IS_EMPTY)) {
				model.addAttribute("SeNameExeption", e.getMessage());
			}else if(e.getMessage().equals(UserValidationMessage.AGE_IS_EMPTY)){
				model.addAttribute("AgeExeption",e.getMessage());
			}else if(e.getMessage().equals(UserValidationMessage.LOGIN_IS_EMPTY)){
				model.addAttribute("LoginExeption",e.getMessage());
			}else if(e.getMessage().equals(UserValidationMessage.EMAIL_IS_EMPTY) || e.getMessage().equals(UserValidationMessage.WRONG_EMAIL)){
				model.addAttribute("EmailExeption",e.getMessage());
			}else if(e.getMessage().equals(UserValidationMessage.PASSWORD_LEIGHT) || e.getMessage().equals(UserValidationMessage.PASSWORD_REPEATE) || e.getMessage().equals(UserValidationMessage.PASSWORD_IS_EMPTY)){
				model.addAttribute("PsswordExeption",e.getMessage());
			}


			return "views-user-registration";
		}
		return "redirect:/registration";
	}
	
	
}
