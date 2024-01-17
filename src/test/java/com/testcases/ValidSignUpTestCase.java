package com.testcases;

import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import com.base.TestBase;

public class ValidSignUpTestCase extends TestBase{
	 ValidSignUpTestCase vst;
	public ValidSignUpTestCase() {
		super();
	}
	@BeforeMethod
	
	public void setup() {
		initialization();
		vst = new ValidSignUpTestCase();
					
	}
	@Test
	
	public void VerifyValidSignUp() {
		vst.VerifyValidSignUp();
		
	}
	
	
}

