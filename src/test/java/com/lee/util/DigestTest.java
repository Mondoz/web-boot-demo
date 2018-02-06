package com.lee.util;

import org.apache.commons.codec.digest.DigestUtils;
import org.junit.Test;

/**
 * Created by lcx on 2018/2/6 17:05.
 */
public class DigestTest {

	@Test
	public void md5() {
		System.out.println(DigestUtils.md5Hex("123"));
	}
}
