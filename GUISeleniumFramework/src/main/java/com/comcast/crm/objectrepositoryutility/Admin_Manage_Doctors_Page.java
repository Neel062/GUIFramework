package com.comcast.crm.objectrepositoryutility;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
/**
 * 
 * @author Nithish
 *This page contains Admin_Manage_Doctors elements
 */

public class Admin_Manage_Doctors_Page {
	

	public Admin_Manage_Doctors_Page(WebDriver driver) {
		PageFactory.initElements(driver, this);
	}
	
	
	

}
