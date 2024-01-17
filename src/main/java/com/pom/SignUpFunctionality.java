package com.pom;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.base.TestBase;

public class SignUpFunctionality extends TestBase {

	@FindBy (xpath="//input[@name='f_name']")
	WebElement FirstName;
	
	@FindBy (xpath ="//input[@name='l_name']")
	WebElement LastName;
	
	@FindBy (xpath = "//input[@name='email']")
	WebElement EmailId;
	
	@FindBy (xpath = "//input[@name='phone']")
	WebElement PhoneNumber;
	
	@FindBy (xpath = "//body/div[@class='container py-4 py-lg-5 my-4 __inline-7']/div[@class='row justify-content-center']/div[@class='col-md-8']/div[@class='card border-0 box-shadow']/div[@class='card-body']/form[@id='form-id']/div[@class='row']/div[5]/div[1]/div[1]/input[1]")
	WebElement Password;
	
	@FindBy (xpath = "//body/div[@class='container py-4 py-lg-5 my-4 __inline-7']/div[@class='row justify-content-center']/div[@class='col-md-8']/div[@class='card border-0 box-shadow']/div[@class='card-body']/form[@id='form-id']/div[@class='row']/div[6]/div[1]/div[1]/input[1]")
	WebElement ConfirmPassword;
	
	@FindBy (xpath = "//input[@id='inputCheckd']")
	WebElement IAgree;
	
	@FindBy (xpath = "//button[@id='sign-up']")
	WebElement SignUp;
	
	
	public SignUpFunctionality() {
//		WebDriver driver = null;
		PageFactory.initElements(driver, this);
		
	}
	
	public void VerfiySignupvalid () throws Throwable 	{
		
		Thread.sleep(2000);
		FirstName.sendKeys();
		
		Thread.sleep(2000);
		LastName.sendKeys();
		
		Thread.sleep(2000);
		EmailId.sendKeys();
		
		Thread.sleep(2000);
		PhoneNumber.sendKeys();
		
		Thread.sleep(2000);
		Password.sendKeys();
		
		Thread.sleep(2000);
		ConfirmPassword.sendKeys();
		
		Thread.sleep(2000);
		IAgree.click();
		
		Thread.sleep(2000);
		SignUp.clear();
		
		Thread.sleep(2000);
		driver.navigate().back();
		
		Thread.sleep(2000);
		FirstName.sendKeys();
		
		Thread.sleep(2000);
		LastName.sendKeys();
		
		Thread.sleep(2000);
		EmailId.sendKeys();
		
		Thread.sleep(2000);
		PhoneNumber.sendKeys();
		
		Thread.sleep(2000);
		Password.sendKeys();
		
		Thread.sleep(2000);
		ConfirmPassword.sendKeys();
		
		Thread.sleep(2000);
		IAgree.click();
		
		Thread.sleep(2000);
		SignUp.click();
					
	}
	
		
}
