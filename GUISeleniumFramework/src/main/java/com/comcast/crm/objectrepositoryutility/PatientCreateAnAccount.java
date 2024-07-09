package com.comcast.crm.objectrepositoryutility;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class PatientCreateAnAccount {

	public PatientCreateAnAccount(WebDriver driver) {
		PageFactory.initElements(driver, this);
	}
	@FindBy(xpath = "//input[@name='full_name']")
	private WebElement FullNameTxt;
	
	@FindBy(xpath = "//label[@for='rg-male']")
	private WebElement MaleRadioBtn;
	
	@FindBy(xpath = "//label[@for='rg-female']")
	private WebElement FemaleRadioBtn;
	
	public WebElement getMaleRadioBtn() {
		return MaleRadioBtn;
	}
	@FindBy(xpath = "//input[@name='address']")
	private WebElement AddressTxt;
	
	@FindBy(xpath = "//input[@name='city']")
	private WebElement cityTxt;
	
	@FindBy(xpath = "//input[@name='email']")
	private WebElement emailTxt;
	
	@FindBy(xpath = "//input[@name='password']")
	private WebElement passwordTxt;
	
	@FindBy(xpath = "//input[@name='password_again']")
	private WebElement PwdAgainTxt;
	
	@FindBy(xpath = "//input[@name='submit']")
	private WebElement SubmitBtn;

	public WebElement getFullNameTxt() {
		return FullNameTxt;
	}

	public WebElement getAddressTxt() {
		return AddressTxt;
	}

	public WebElement getCityTxt() {
		return cityTxt;
	}

	public WebElement getEmailTxt() {
		return emailTxt;
	}

	public WebElement getPasswordTxt() {
		return passwordTxt;
	}

	public WebElement getPwdAgainTxt() {
		return PwdAgainTxt;
	}

	public WebElement getSubmitBtn() {
		return SubmitBtn;
	}
	/**
	 * BusinessLogic for creating patient account
	 * 
	 * @param fullNameTxt
	 * @param address
	 * @param city
	 * @param email
	 * @param password
	 * @param confirmPassword
	 */
	public void addPatientUserM(String fullNameTxt,String address, String city, String email, String password, String confirmPassword) {
		FullNameTxt.sendKeys(fullNameTxt);
		AddressTxt.sendKeys(address);
		cityTxt.sendKeys(city);
		MaleRadioBtn.click();
		emailTxt.sendKeys(email);
		passwordTxt.sendKeys(password);
		PwdAgainTxt.sendKeys(confirmPassword);
		SubmitBtn.click();
	}
	
	public void addPatientUserF(String fullNameTxt,String address, String city, String email, String password, String confirmPassword) {
		FullNameTxt.sendKeys(fullNameTxt);
		AddressTxt.sendKeys(address);
		cityTxt.sendKeys(city);
		FemaleRadioBtn.click();
		emailTxt.sendKeys(email);
		passwordTxt.sendKeys(password);
		PwdAgainTxt.sendKeys(confirmPassword);
		SubmitBtn.click();
	}
}
