package com.bos.apollo.signup.domain;

import org.springframework.stereotype.Component;

@Component
public class InputValidateVO {
	
	//@NotNull("firstName cannot be Empty!")
	String firstName;
	
	//@NotNull("firstName cannot be Empty!")
	String lastName;
	
	//@NotNull("firstName cannot be Empty!")
	String dob;
	
	//@NotNull("firstName cannot be Empty!")
	String mobile;
	
	//@NotNull("firstName cannot be Empty!")
	String bookingCentre;
	
	//@NotNull("firstName cannot be Empty!")
	String email;
	
	//@NotNull("firstName cannot be Empty!")
	String documentId;
	
	//@NotNull("firstName cannot be Empty!")
	String accountNo;
	
	

	public InputValidateVO() {
		super();
		// TODO Auto-generated constructor stub
	}

	public InputValidateVO(String firstName, String lastName, String dob, String mobile, String bookingCentre,
			String email, String documentId, String accountNo) {
		super();
		this.firstName = firstName;
		this.lastName = lastName;
		this.dob = dob;
		this.mobile = mobile;
		this.bookingCentre = bookingCentre;
		this.email = email;
		this.documentId = documentId;
		this.accountNo = accountNo;
	}

	public String getFirstName() {
		return firstName;
	}

	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}

	public String getLastName() {
		return lastName;
	}

	public void setLastName(String lastName) {
		this.lastName = lastName;
	}

	public String getDob() {
		return dob;
	}

	public void setDob(String dob) {
		this.dob = dob;
	}

	public String getMobile() {
		return mobile;
	}

	public void setMobile(String mobile) {
		this.mobile = mobile;
	}

	public String getBookingCentre() {
		return bookingCentre;
	}

	public void setBookingCentre(String bookingCentre) {
		this.bookingCentre = bookingCentre;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getDocumentId() {
		return documentId;
	}

	public void setDocumentId(String documentId) {
		this.documentId = documentId;
	}

	public String getAccountNo() {
		return accountNo;
	}

	public void setAccountNo(String accountNo) {
		this.accountNo = accountNo;
	}
	

}
