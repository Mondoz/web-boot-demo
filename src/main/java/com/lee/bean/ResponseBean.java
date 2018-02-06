package com.lee.bean;

import java.util.List;

/**
 * Created by lcx on 2018/2/6 16:49.
 */
public class ResponseBean<T> {
	private int code;
	private T data;
	private String msg;

	public String getMsg() {
		return msg;
	}

	public void setMsg(String msg) {
		this.msg = msg;
	}

	public ResponseBean(int code, T data,String msg) {
		this.code = code;
		this.data = data;
		this.msg = msg;
	}

	public int getCode() {
		return code;
	}

	public void setCode(int code) {
		this.code = code;
	}

	public T getData() {
		return data;
	}

	public void setData(T data) {
		this.data = data;
	}
}
