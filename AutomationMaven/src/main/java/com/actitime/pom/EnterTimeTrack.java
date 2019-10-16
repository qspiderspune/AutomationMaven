package com.actitime.pom;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class EnterTimeTrack {
	@FindBy(linkText="Logout")
	private WebElement logoutLink;
	
	@FindBy(xpath="//div[contains(text(),' Help')]")
	private WebElement helpLink;
	@FindBy(linkText="About your actiTIME")
	private WebElement actittimelink;
	@FindBy(xpath="//span[(text()='actiTIME 2017.3')]")
	private WebElement version;
	@FindBy(xpath="//img[@id='aboutPopupCloseButtonId']")
	private WebElement closeButton;
	@FindBy(xpath="//div[text()='TASKS']")
	private WebElement taskMenu;
	public EnterTimeTrack(WebDriver driver) {
		PageFactory.initElements(driver, this);
	}
	public void logoutClick() {
		logoutLink.click();
	}
	public void closeButtonClick() throws InterruptedException {
		Thread.sleep(2000);
		closeButton.click();
	}
	public void helpLinkClick() throws InterruptedException {
		Thread.sleep(2000);
		helpLink.click();
	}
	public void actittimelinkClick() throws InterruptedException {
		Thread.sleep(2000);
		actittimelink.click();
	}
	public String getVersion() throws InterruptedException {
		Thread.sleep(1000);
	return	version.getText();
	}
	
	public void openTaskMenuClick() throws InterruptedException {
		Thread.sleep(2000);
		taskMenu.click();
	}
	
}
