package com.lee.control;

import com.lee.bean.UserBean;
import com.lee.service.UserMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

/**
 * Created by lcx on 2018/1/19 10:47.
 */

@RestController
public class UserController {

	@Autowired
	private UserMapper userMapper;

	@RequestMapping("/id")
	public UserBean getUser(@RequestParam(name = "id") int id) {
		UserBean userBean = userMapper.getUserById(id);
		return userBean;
	}

	@RequestMapping("/lists")
	public List<UserBean> getUserList() {
		List<UserBean> userList = userMapper.getUserList();
		return userList;
	}

}
