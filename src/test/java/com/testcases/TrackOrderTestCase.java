package com.testcases;

import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import com.base.TestBase;
import com.pom.TrackOrderFunctionality;

public class TrackOrderTestCase extends TestBase{
	
	TrackOrderFunctionality tof;
	
	public TrackOrderTestCase() {
		super();
		
	}

	@BeforeMethod
	
	public void setup() {
		initialization();
		tof = new TrackOrderFunctionality();
		
	}
	
	@Test
	
	public void TrackorderValidation() throws Throwable {
		tof.VerifyTrackOrder();
	}
}
