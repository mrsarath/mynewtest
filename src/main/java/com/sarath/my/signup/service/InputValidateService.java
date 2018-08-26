package com.sarath.my.signup.service;

import com.sarath.my.signup.domain.InputValidateResponseVO;
import com.sarath.my.signup.domain.InputValidateVO;


public interface InputValidateService {

	InputValidateResponseVO doValidate(InputValidateVO request);
	
	

}
