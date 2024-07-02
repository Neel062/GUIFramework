package com.comcast.cem.admintest;

import org.testng.annotations.Test;

import com.comcast.crm.generic.basetest.AdminBaseClass;
import com.comcast.crm.objectrepositoryutility.Admin1_Add_Doctor_Page;
import com.comcast.crm.objectrepositoryutility.Admin1_Dashboard_Page;
import com.comcast.crm.objectrepositoryutility.Admin1_Doctor_Specialization_Page;

public class Doctor_Test extends AdminBaseClass {
	
	@Test
	
	public void addDoctor() throws Throwable {
		
		Admin1_Dashboard_Page adp=new Admin1_Dashboard_Page(driver);
		adp.getDoctordropdown().click();
		
		Admin1_Add_Doctor_Page aadp=new Admin1_Add_Doctor_Page(driver);
		
		String doctorName = eLib.getDataFromExcel("Admin1", 1, 3);
		String doctorspecialization = eLib.getDataFromExcel("Admin1", 1, 2);
		String doctoraddress = eLib.getDataFromExcel("Admin1", 1, 4);
		String doctorfees = eLib.getDataFromExcel("Admin1", 1, 5);
		String doctorph_no = eLib.getDataFromExcel("Admin1", 1, 6);
		String doctoremail = eLib.getDataFromExcel("Admin1", 1, 7);
		String doctorpassword = eLib.getDataFromExcel("Admin1", 1, 8);
		String doctorcpassword = eLib.getDataFromExcel("Admin1", 1, 9);
		
		aadp.addDoctor(null, null, null, null, null, null, null, null);
		
		Admin1_Doctor_Specialization_Page adsp= new Admin1_Doctor_Specialization_Page(driver);
	}

}
