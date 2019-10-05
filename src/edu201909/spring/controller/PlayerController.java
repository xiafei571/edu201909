package edu201909.spring.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

import edu201909.day2.UserInfo;
import edu201909.spring.service.PlayerService;

@Controller
@RequestMapping("/player")
public class PlayerController {

	@Autowired
	private PlayerService playerService; 
	
	@RequestMapping(value = "/index", method = RequestMethod.GET)
	public String getUsers(ModelMap modelMap) {
		modelMap.put("list", playerService.getUsers());
		//jsp/index.jsp
		return "index";
	}
	
	@RequestMapping("/json")
	@ResponseBody
	public List<UserInfo> getUsersJson(ModelMap modelMap){
		//返回json
		return playerService.getUsers();
	}
}
