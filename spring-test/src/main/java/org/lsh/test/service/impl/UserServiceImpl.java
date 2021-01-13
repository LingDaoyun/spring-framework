package org.lsh.test.service.impl;

import org.lsh.test.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;

public class UserServiceImpl implements UserService {

	@Autowired
	private JdbcTemplate jdbcTemplate;

	@Override
	public int insert(String name) {
		String sql = "insert into user_test(name) values('"+name+"')";
		int i = jdbcTemplate.update(sql);
		if(i != 0 ){
			throw new RuntimeException("this is test tx");
		}
		return 0;
	}
}
