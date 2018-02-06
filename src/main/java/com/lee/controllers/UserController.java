package com.lee.controllers;

import com.lee.bean.ErrorCodes;
import com.lee.bean.ResponseBean;
import com.lee.bean.UserBean;
import com.lee.exception.ServiceException;
import com.lee.mapper.UserMapper;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import org.apache.commons.codec.digest.DigestUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

/**
 * Created by lcx on 2018/1/19 10:47.
 */

@RestController
@RequestMapping("user")
@Api("user service")
public class UserController {

	@Autowired
	private UserMapper userMapper;

	@RequestMapping(value = "/id",method = RequestMethod.POST)
	@ApiOperation(value = "get user by id")
	public UserBean getUser(@RequestParam(name = "id") int id) {
		return userMapper.getUserById(id);
	}

	@RequestMapping(value = "/login",method = RequestMethod.POST)
	@ApiOperation(value = "login")
	public ResponseBean login(@RequestParam(name = "id") int id,@RequestParam(name = "password") String password) {
		ResponseBean responseBean = null;
		UserBean userBean = userMapper.getUserById(id);
		if (userBean.getPassword().equals(DigestUtils.md5Hex(password))) {
			throw ServiceException.newInstance(ErrorCodes.USER_NOT_FOUND_ERROR);
		} else {

		}
		return responseBean;
	}

	@RequestMapping(value = "/lists",method = RequestMethod.GET)
	@ApiOperation(value = "get user list")
	public List<UserBean> getUserList() {
		return userMapper.getUserList();
	}

}
