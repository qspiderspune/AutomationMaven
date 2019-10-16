package com.actitime.pom;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.actitime.generics.FileLib;

public class ActiveCustomerProjectPage {
	

	@FindBy(xpath="//span[text()='Create Customer' and @unselectable='on']")
	private WebElement CreateCustomerBtn;
	@FindBy(xpath="//input[@placeholder='Enter Customer Name']")
	private WebElement EnterCustomerTextBox;
	@FindBy(xpath="//span[text()='Create Customer' and @class='buttonTitle']")
	private WebElement CreateCustomerPopBtn;
	public ActiveCustomerProjectPage(WebDriver driver) {
		PageFactory.initElements(driver, this);
	}
	public void createCustomerBtnClick() throws InterruptedException {
		Thread.sleep(2000);
		CreateCustomerBtn.click();
	}
	public void enterCustomerTextBox(String custName) throws Exception {
		
		
		Thread.sleep(2000);
		EnterCustomerTextBox.sendKeys(custName);
	}
	public void CreateCustomerPopBtnClick() throws InterruptedException {
		Thread.sleep(2000);
		CreateCustomerPopBtn.click();
	}
}
