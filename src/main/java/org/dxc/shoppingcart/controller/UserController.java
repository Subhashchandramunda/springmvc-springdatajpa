package org.dxc.shoppingcart.controller;

import org.dxc.shoppingcart.entity.User;
import org.dxc.shoppingcart.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.ui.ModelMap;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class UserController {

	
	@Autowired
	private UserService userService;
	
	@RequestMapping("/")
	public String showIndexPage(Model model) {
		
		return "index";	
		
	} 
	@RequestMapping("/addregister")
	public String showRegisteDetailsPage(Model model) {
		model.addAttribute(new User());
		return "register"; 
	}
	@RequestMapping("/newregisteration")
	public String addRegister(@ModelAttribute("user")User user,
			BindingResult result,Model model) {
		
		if(result.hasErrors()){
			
		      return "register";
		}else  {
		      userService.addRegister(user);
		      model.addAttribute("username");
		      model.addAttribute("password");
		      model.addAttribute("firstName");
		      model.addAttribute("lastName");
		      model.addAttribute("email");
		      model.addAttribute("mobileNo");
		      
		return "success";
	 }	
		
	}

	@RequestMapping("/addlogin")
	public String showAddLoginDetailsPage(@ModelAttribute("user")User user) {
		
		return "login"; 
	}
	
	@PostMapping("/addnewlogin")
	public String addLogin(@ModelAttribute("user")User user,BindingResult result,Model model){
		
		if(result.hasErrors()){
			
		      return "login";
		}else  {
		      userService.addLogin(user);
		      model.addAttribute(user.getUserName());
		      model.addAttribute(user.getPassword());
		     
		return "login successfully";
       }	
	}
	
	
	
}
