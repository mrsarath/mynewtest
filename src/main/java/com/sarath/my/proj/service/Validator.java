package com.sarath.my.proj.service;

import java.util.concurrent.atomic.AtomicInteger;

public class Validator {
	
	static final int VALIDATE_FAIL_LEVEL_NAME = 1;
	static final int VALIDATE_FAIL_LEVEL_DOB = 2;
	static final int VALIDATE_FAIL_LEVEL_DOCID = 3;
	static final int VALIDATE_FAIL_LEVEL_ACCOUNT = 4;
	static final int VALIDATE_FAIL_LEVEL_MOBILE = 5;
	static final int VALIDATE_FAIL_LEVEL_EMAIL = 6;
	
	
	
	public static void main(String[] str) {
		
		Validator validator = new Validator();
		
		validator.validate();
	}
	
	public void setValidateLevel(AtomicInteger dataValidateLevel, int level) {		
		
		if (level>dataValidateLevel.get())
			dataValidateLevel.set(level);
	}
	
	public void validate() {
		
		AtomicInteger dataValidateLevel = new AtomicInteger(0);
		
		if (1==1) {
			setValidateLevel(dataValidateLevel, VALIDATE_FAIL_LEVEL_NAME);
		}
		
		if (2==2) {
			setValidateLevel(dataValidateLevel, VALIDATE_FAIL_LEVEL_DOB);
		}
		
		setValidateLevel(dataValidateLevel, VALIDATE_FAIL_LEVEL_NAME);
		
		setValidateLevel(dataValidateLevel, VALIDATE_FAIL_LEVEL_DOCID);
		
		setValidateLevel(dataValidateLevel, VALIDATE_FAIL_LEVEL_DOB);
		
		System.out.println("FINISEHD: level - " + dataValidateLevel);
		
		boolean dobFound = true;
		boolean mobileFound = true;
		boolean emailFound = true;
		
		if (dobFound || mobileFound || emailFound) {
			
			switch (dataValidateLevel.get()) {
			  case VALIDATE_FAIL_LEVEL_NAME:
				  System.out.println("name not match");
				  break;
			  case VALIDATE_FAIL_LEVEL_DOB:
				  System.out.println("dob not match");
				  break;
			  case VALIDATE_FAIL_LEVEL_DOCID:
				  System.out.println("legalDoc not match");
				  break;
			  case VALIDATE_FAIL_LEVEL_ACCOUNT:
				  System.out.println("Account not match");
				  break;
			  case VALIDATE_FAIL_LEVEL_MOBILE:
				  System.out.println("mobile not match");
				  break;
			  case VALIDATE_FAIL_LEVEL_EMAIL:
				  System.out.println("email not match");
				  break;
			  default:
				  System.out.println("name not match");
				  
			}
			
		}
			
	}

}
