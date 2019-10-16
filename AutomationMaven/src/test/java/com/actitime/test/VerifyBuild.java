package com.actitime.test;



import org.testng.Assert;
import org.testng.annotations.Test;

import com.actitime.generics.BaseClass;
import com.actitime.pom.EnterTimeTrack;


public class VerifyBuild extends BaseClass{
	@Test
	public void test() throws Exception {
	String ExpectedVersion = f.getExcelData("VerifyBuild", 1, 2);
	EnterTimeTrack e=new EnterTimeTrack(driver);
	e.helpLinkClick();
	e.actittimelinkClick();
	String ActualVersion = e.getVersion();
	e.closeButtonClick();
	Assert.assertEquals(ActualVersion, ExpectedVersion);
}
}
