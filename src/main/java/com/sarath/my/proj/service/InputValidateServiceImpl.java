package com.sarath.my.proj.service;

import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

import org.apache.commons.lang3.StringUtils;
import org.springframework.stereotype.Service;

import com.sarath.my.proj.domain.CRMDataVO;
import com.sarath.my.proj.domain.InputValidateResponseVO;
import com.sarath.my.proj.domain.InputValidateVO;

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

	private boolean validateInputData(CRMDataVO crmVO, InputValidateVO request, InputValidateResponseVO response) {
		if (crmVO!=null) {
			response.setResult("ERROR");
			return false;
	    }
		
		int errorLevel=0;
		String errorMsg;
		
		//mandatory check
		
		if (StringUtils.isBlank(crmVO.getRm_id())) {
			errorMsg = "RM_ID cannot be blank";
			errorLevel=2;
		} else if (StringUtils.isBlank(crmVO.getCountry())) {
			errorMsg = "Country cannot be blank";
			errorLevel=2;
		} else if (StringUtils.isBlank(crmVO.getCountry())) {
			errorMsg = "Country cannot be blank";
			errorLevel=2;
		}
		
		String entitledAccount="23434,Main Holder;34324,Not Main holder;";
		
		//get valid entitled accounts
		splitEntitledAccounts(entitledAccount);	
		
		
		//length check
		if (crmVO.getFirstName().length()<2 || crmVO.getFirstName().length()>100) {
			errorMsg = "firstName length not in limit.";
			errorLevel=2;
		}
		if (crmVO.getLastName().length()>100) {
			errorMsg = "lastName length not in limit.";
			errorLevel=2;
		}
		if (crmVO.getPreferredName().length()>100) {
			errorMsg = "preferredName length not in limit.";
			errorLevel=2;
		}
		
		//valid characters check		
		if (!crmVO.getMobileNumber().matches("[0-9]+")) {
			errorMsg = "mobileNumber not valid.";
			errorLevel=2;
		}
		
		//if (StringUtils.isNotBlank(crmVO.getEmail())) {
			String emailRegex = "^([_a-zA-Z0-9-]+(\\.[_a-zA-Z0-9-]+)*@[a-zA-Z0-9-]+(\\.[a-zA-Z0-9-]+)*(\\.[a-zA-Z]{1,6}))?$";
	       				
		    Matcher m = Pattern.compile(emailRegex).matcher(crmVO.getEmail());

		    if (!m.find()) {			
			   errorMsg = "Email not valid.";
			   errorLevel=2;
		    }
		//}
		    
		//spl chars remove
		crmVO.setFirstName(crmVO.getFirstName().replaceAll("[^a-zA-Z0-9]",""));
			
		return true;
	}
	
	Map<String, String> splitEntitledAccounts(String entitimentAccount) {
		Map<String, String> resultAccounts=new HashMap<>();
		
		List<String> userRoleTypes = Arrays.asList("Main Holder","Not Main Holder");
		
		List<String> fullAcctStrList = Arrays.asList(StringUtils.split(entitimentAccount, ";"));
		
		for (String acct:fullAcctStrList) {
			List<String> acctList = Arrays.asList(StringUtils.split(acct, ","));
			
			if (acctList.size()>1)
				if (userRoleTypes.contains(acctList.get(0)))
					resultAccounts.put(acctList.get(0), acctList.get(1));
		}
		
		return resultAccounts;
	}

}
