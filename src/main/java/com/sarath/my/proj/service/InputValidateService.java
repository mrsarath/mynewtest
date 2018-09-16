package com.sarath.my.proj.service;

import com.sarath.my.proj.domain.InputValidateResponseVO;
import com.sarath.my.proj.domain.InputValidateVO;


public interface InputValidateService {

	InputValidateResponseVO doValidate(InputValidateVO request);
	
	

}
