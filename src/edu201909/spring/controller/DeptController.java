package edu201909.spring.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

import edu201909.spring.domain.DeptInfo;
import edu201909.spring.service.DeptService;

@Controller
@RequestMapping("/dept")
public class DeptController {

	@Autowired
	private DeptService deptService;

	@RequestMapping(value = "/list", method = RequestMethod.GET)
	@ResponseBody
	public List<DeptInfo> getDeptList() {
		return deptService.getDeptList();
	}

	@RequestMapping(value = "/index", method = RequestMethod.GET)
	public String getDeptIndex(ModelMap modelMap) {
		List<DeptInfo> list = deptService.getDeptList();
		modelMap.put("list", list);
		return "dept";
	}

	@RequestMapping(value = "/add", method = RequestMethod.GET)
	public String addDept(ModelMap modelMap) {
		modelMap.put("deptInfo", new DeptInfo());
		return "add_dept";
	}

	@RequestMapping(value = "/add", method = RequestMethod.POST)
	public String addDept(ModelMap modelMap, @ModelAttribute DeptInfo deptInfo) {
		// TODO 把数据插入数据库
		System.out.println(deptInfo);
		return "redirect:/dept/index";
	}
}
