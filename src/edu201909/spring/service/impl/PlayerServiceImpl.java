package edu201909.spring.service.impl;

import java.util.List;

import org.springframework.stereotype.Service;

import com.google.common.collect.Lists;

import edu201909.day2.UserInfo;
import edu201909.spring.service.PlayerService;

@Service
public class PlayerServiceImpl implements PlayerService {

	@Override
	public List<UserInfo> getUsers() {
		UserInfo u1 = new UserInfo(1001, "Mark", 33);
		UserInfo u2 = new UserInfo(1002, "Jager", 45);
		UserInfo u3 = new UserInfo(1003, "Hibana", 28);
		return Lists.newArrayList(u1, u2, u3);
	}

}
