package com.actitime.pom;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class OpenTasksPage {
	@FindBy(xpath="//a[text()='Projects & Customers']")
	private WebElement ProjectCustomerTab;
	
	public OpenTasksPage(WebDriver driver) {
		PageFactory.initElements(driver, this);
	}
	public void projectCustomerTabClick() throws InterruptedException {
		Thread.sleep(2000);
		ProjectCustomerTab.click();
	}
}
