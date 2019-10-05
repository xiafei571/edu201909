package edu201909.spring.service.impl;

import java.util.Map;

import org.springframework.stereotype.Service;

import com.google.common.collect.Maps;

import edu201909.spring.service.DemoService;

@Service
public class DemoServiceImpl implements DemoService {

	@Override
	public Map<String, Integer> ten2binary(Integer n) {
		Map<String, Integer> result = Maps.newHashMap();
		result.put("ten_number", n);
		
		StringBuilder sb = new StringBuilder();
		while (n != 0) {
			sb.append(n % 2);
			n = n / 2;
		}
		result.put("binary_number", Integer.parseInt(sb.reverse().toString()));
	
		return result;
	}

}
