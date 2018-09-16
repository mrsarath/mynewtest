package com.sarath.my.transaction.impl;

import org.springframework.stereotype.Service;

import com.sarath.my.transaction.TransactionBo;

@Service
public class TransactionBoImpl implements TransactionBo {

	public String save() {

		return "Jersey + Spring example";

	}

}