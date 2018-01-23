package com.lee.control;

import com.lee.bean.Greeting;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

/**
 * Created by lcx on 2018/1/23 17:08.
 */
@RestController
public class GreetingControl {
	@RequestMapping(value = "/greeting",method = RequestMethod.GET)
	public Greeting greeting(@RequestParam(value="name", defaultValue="World") String name) {
		Greeting greeting = new Greeting(1,name);
		return greeting;
	}
}
