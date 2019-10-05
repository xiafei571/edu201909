package edu201909.spring.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import edu201909.spring.domain.DeptInfo;
import edu201909.spring.model.mapper.DeptMapper;
import edu201909.spring.service.DeptService;

@Service
public class DeptServiceImpl implements DeptService {
	
	@Autowired
	private DeptMapper deptMapper;

	@Override
	public List<DeptInfo> getDeptList() {
		return deptMapper.getDeptList();
	}

}
