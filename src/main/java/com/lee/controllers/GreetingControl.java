package com.lee.controllers;

import com.lee.bean.Greeting;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import org.springframework.web.bind.annotation.*;


/**
 * Created by lcx on 2018/1/23 17:08.
 */
@RestController
@Api("greeting")
public class GreetingControl {
	@RequestMapping(value = "/greeting",method = RequestMethod.POST)
	@ApiOperation(value = "hello")
	public Greeting greeting(@RequestParam String name) {
		Greeting greeting = new Greeting(1,name);
		return greeting;
	}
}
