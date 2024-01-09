package com.testcases;

import org.openqa.selenium.WebElement;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import com.base.TestBase;
import com.pom.SignUpFunctionality;

public class SignUpTest extends TestBase{
	
	SignUpFunctionality suf;
	
	public SignUpTest () {
		super();
		
	}

	@BeforeMethod
	
	public void signupvalid () {
		initialization();
		suf = new SignUpFunctionality();
						
	}
	
	@Test
	public void VerfiySignupvalid () throws Throwable {
		suf.VerfiySignupvalid();
		String url = driver.getCurrentUrl();
				
	}
}
