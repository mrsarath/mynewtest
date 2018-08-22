package com.bos.apollo.signup.service;

import org.springframework.stereotype.Service;

import com.bos.apollo.signup.domain.CRMDataVO;
import com.bos.apollo.signup.domain.InputValidateResponseVO;
import com.bos.apollo.signup.domain.InputValidateVO;

@Service
public class InputValidateServiceImpl implements InputValidateService {

	@Override
	public InputValidateResponseVO doValidate(InputValidateVO request) {
		InputValidateResponseVO response = new InputValidateResponseVO();
		
		//call crm service
		//insert into crm table
		
		//compare with user input
		CRMDataVO crmDataVO = new CRMDataVO();
		
		boolean valid = validateInputData(crmDataVO, request, response);
		
		if (!valid)
			return response;
		
		//insert to draft?
		
		//generate otp sms				
	
		return response;
	}

	private boolean validateInputData(CRMDataVO crmDataVO, InputValidateVO request, InputValidateResponseVO response) {
		if (crmDataVO!=null) {
			response.setResult("ERROR");
			return false;
	    } else if (!crmDataVO.getFirstName().equalsIgnoreCase(request.getFirstName())) {
			response.setResult("ERROR_FIRSTNAME_NOTMATCH");
			return false;
		}
		
		return true;
	}
	
	

}
