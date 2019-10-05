package edu201909.spring.controller;

import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

import edu201909.MathUnit;
import edu201909.spring.service.DemoService;

@Controller
@RequestMapping("/demo")
public class DemoController {
	
	@Autowired
	private DemoService demoService;

	@RequestMapping(value = "/ten2binary", method = RequestMethod.GET)
	public String ten2binaryIndex(ModelMap modelMap) {
		return "demo";
	}
	
	@RequestMapping(value = "/ten2binary", method = RequestMethod.POST)
	public String ten2binaryProcess(ModelMap modelMap, Integer ten_number) {
		modelMap.put("ten_number", ten_number);
		modelMap.put("binary_number", MathUnit.ten2Binary(ten_number));
		return "demo";
	}
	
	//RESETFUL接口
	@RequestMapping(value = "/ten2binary/json", method = RequestMethod.POST)
	@ResponseBody
	public Map<String, Integer> ten2binaryJson(Integer ten_number) {
		return demoService.ten2binary(ten_number);
	}
}
