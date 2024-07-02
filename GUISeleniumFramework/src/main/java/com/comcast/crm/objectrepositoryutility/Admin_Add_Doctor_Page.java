package com.comcast.crm.objectrepositoryutility;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.comcast.crm.generic.webdriverutility.WebDriverUtility;

/**
 *  @author Nithish
*This page contains Add Doctor elements
*/
public class Admin_Add_Doctor_Page extends WebDriverUtility {
	
	public Admin_Add_Doctor_Page(WebDriver driver) {
		PageFactory.initElements(driver, this);
	}
	
	@FindBy(name = "Doctorspecialization")
	private WebElement Doctorspecializationdropdown;
	
	@FindBy(name = "docname")
	private WebElement DoctornameTxt;
	
	@FindBy(name = "clinicaddress")
	private WebElement DoctorclinicadressTxt;
	
	@FindBy(name = "doccontact")
	private WebElement DoctorcontactTxt;
	
	@FindBy(name = "docemail")
	private WebElement DoctoremailTxt;
	
	@FindBy(name = "npass")
	private WebElement DoctorpwdTxt;
	
	@FindBy(name = "cfpass")
	private WebElement DoctorcfpwdTxt;
	
	@FindBy(name = "submit")
	private WebElement DoctorSubmitBtn;

	public WebElement getDoctorspecializationdropdown() {
		return Doctorspecializationdropdown;
	}

	public WebElement getDoctornameTxt() {
		return DoctornameTxt;
	}

	public WebElement getDoctorclinicadressTxt() {
		return DoctorclinicadressTxt;
	}

	public WebElement getDoctorcontactTxt() {
		return DoctorcontactTxt;
	}

	public WebElement getDoctoremailTxt() {
		return DoctoremailTxt;
	}

	public WebElement getDoctorpwdTxt() {
		return DoctorpwdTxt;
	}

	public WebElement getDoctorcfpwdTxt() {
		return DoctorcfpwdTxt;
	}

	public WebElement getDoctorSubmitBtn() {
		return DoctorSubmitBtn;
	}
	
	public void SpecializationDropdown(WebElement element,String text ) {
		select(Doctorspecializationdropdown, text);
		
	}
}
