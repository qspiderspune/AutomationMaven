package com.actitime.generics;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;

import com.actitime.pom.EnterTimeTrack;
import com.actitime.pom.LoginPage;

public class BaseClass {
	static {
		System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
		System.setProperty("webdriver.gecko.driver", "./drivers/geckodriver.exe");
	}
public WebDriver driver;
public FileLib f=new FileLib();


@BeforeClass
public void launchBrowser() throws Exception {
	String BrowserName = f.getPropertyData("browser");
		if(BrowserName.equals("chrome")) {
		driver=new ChromeDriver();
		}
	else if(BrowserName.equals("firefox")) {
	//	driver=new FirefoxDriver();
		}
}
@AfterClass
public void closeBrowser() throws Exception {
	Thread.sleep(2000);
	driver.close();
}
@BeforeMethod
public void login() throws Exception {
	String URL = f.getPropertyData("url");
	String UserName = f.getPropertyData("username");
	String PassWord=f.getPropertyData("password");
	driver.get(URL);
	LoginPage l=new LoginPage(driver);
	l.setUser(UserName, PassWord);
}
public void waitForPageToLoad() {
	driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
}
@AfterMethod
public void logout() throws InterruptedException {
Thread.sleep(3000);
EnterTimeTrack e=new EnterTimeTrack(driver);
e.logoutClick();

}
}
