package com.demo.tdd.services;

public class EchoServiceImpl implements EchoService {
	@Override
	public String echo(String s) {
		return s;
	}
}
