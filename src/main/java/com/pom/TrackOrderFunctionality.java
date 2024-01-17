package com.pom;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.base.TestBase;
import com.utils.utils;

public class TrackOrderFunctionality extends TestBase {
	
	@FindBy (xpath = "//div[@class='navbar-tool-icon-box bg-secondary']//div[@class='navbar-tool-icon-box bg-secondary']")
	WebElement ProfileButton;
	
	@FindBy (xpath = "//a[normalize-space()='Sign in']")
	WebElement SignInButton;
	
	@FindBy (xpath = "//input[@id='si-email']")
	WebElement UserName;
	
	@FindBy (xpath = "//input[@id='si-password']")
	WebElement Password;
	
	@FindBy (xpath = "//button[normalize-space()='Sign in']")
	WebElement LoginButton;
	
	@FindBy (xpath = "//img[@alt='Oneplus']")
	WebElement ProductSelection;
	
	@FindBy (xpath = "//div[contains(@class,'row')]//div[1]//div[1]//div[1]//div[1]//div[2]//a[1]//img[1]")
	WebElement ItemSelection;
	
	@FindBy (xpath = "//span[normalize-space()='Buy now']")
	WebElement BuyNowButton;
	
	@FindBy (xpath = "//select[@class='form-control']")
	WebElement ShippingMethod;
	
	
	@FindBy (xpath = "//a[@class='btn btn--primary pull-right']")
	WebElement Checkout;
	
	@FindBy (xpath = "//input[@id='same_as_shipping_address']")
	WebElement SameShippingAddress;
	
	@FindBy (xpath = "//span[normalize-space()='Proceed payment']")
	WebElement PaymentMethod;
	
	@FindBy (xpath = "//form[@class='needs-validation']//img[@class='__mt-n-10']")
	WebElement COD_Button;
	
	@FindBy (xpath ="//a[@class='btn btn-secondary pull-right']")
	WebElement CheckOrder;
	
	@FindBy (xpath = "//tbody/tr[1]/td[5]/div[1]/a[1]/i[1]") 
	WebElement OrderVeiw;
	
	@FindBy (xpath = "//a[@type='button'][normalize-space()='Track Order']")
	WebElement TrackOrderButton;
	
	@FindBy (xpath = "//a[@class='btn btn--primary btn-sm mt-2 mb-2']")
	WebElement VeiwOrderDetailsButton;
		
	public TrackOrderFunctionality () {
		PageFactory.initElements(driver, this);
	}

	public void VerifyTrackOrder() throws Throwable {
		
		Thread.sleep(2000);
		ProfileButton.click();
		
		Thread.sleep(2000);
		SignInButton.click();
		
		Thread.sleep(2000);
		UserName.sendKeys(prop.getProperty("username"));
		
		Thread.sleep(2000);
		Password.sendKeys(prop.getProperty("password"));
		
		Thread.sleep(2000);
		LoginButton.click();
		
//		Thread.sleep(2000);
//		utils.scroll();
		
		Thread.sleep(2000);
		ProductSelection.click();
		
		Thread.sleep(2000);
		ItemSelection.click();
		
		Thread.sleep(2000);
		BuyNowButton.click();
		
		Thread.sleep(2000);
		ShippingMethod.click();

		Thread.sleep(2000);
		utils.Dropdown1(ShippingMethod, 2);

		Thread.sleep(2000);
		Checkout.click();
		
		Thread.sleep(2000);
		SameShippingAddress.click();
		
		Thread.sleep(2000);
		PaymentMethod.click();
		
		Thread.sleep(2000);
		COD_Button.click();
		
		Thread.sleep(2000);
		CheckOrder.click();
		
		Thread.sleep(2000);
		OrderVeiw.click();
		
		Thread.sleep(2000);
		TrackOrderButton.click();
		
		Thread.sleep(2000);
		VeiwOrderDetailsButton.click();
		
	}
}
