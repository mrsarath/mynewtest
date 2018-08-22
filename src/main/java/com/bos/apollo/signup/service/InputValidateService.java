package com.bos.apollo.signup.service;

import com.bos.apollo.signup.domain.InputValidateResponseVO;
import com.bos.apollo.signup.domain.InputValidateVO;


public interface InputValidateService {

	InputValidateResponseVO doValidate(InputValidateVO request);
	
	

}
