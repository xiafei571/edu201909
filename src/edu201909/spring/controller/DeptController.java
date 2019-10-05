package edu201909.spring.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
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
}
