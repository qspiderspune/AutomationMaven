package com.actitime.test;

import org.testng.annotations.Test;

import com.actitime.generics.BaseClass;
import com.actitime.pom.ActiveCustomerProjectPage;
import com.actitime.pom.EnterTimeTrack;
import com.actitime.pom.OpenTasksPage;


public class CreateCustomer extends BaseClass{
@Test
public void testCreateCustomer() throws Exception {
	String custName = f.getExcelData("CreateUser", 1, 2);
	EnterTimeTrack e=new EnterTimeTrack(driver);
	e.openTaskMenuClick();
	OpenTasksPage o=new OpenTasksPage(driver);
	o.projectCustomerTabClick();
	ActiveCustomerProjectPage a=new ActiveCustomerProjectPage(driver);
	a.createCustomerBtnClick();
	a.enterCustomerTextBox(custName);
	a.CreateCustomerPopBtnClick();
	Thread.sleep(2000);
}
}
