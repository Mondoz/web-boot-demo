package com.lee;

import com.lee.mapper.Business;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

/**
 * Created by lcx on 2018/2/6 12:40.
 */
@SpringBootTest
@RunWith(SpringRunner.class)
public class MyAppTest {
	@Autowired
	private Business business;

	@Test
	public void invoke() {
		business.calculateSomething();
	}
}
