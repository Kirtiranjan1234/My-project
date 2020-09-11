package com.actitime.test;

import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.testng.Assert;
import org.testng.annotations.Test;

import com.actitime.generics.BaseClass;
import com.actitime.pom.HomePage;
import com.actitime.pom.TaskListPage;

public class CreateCustomer extends BaseClass {
	@Test
	public void testCreateCustomer() throws InterruptedException, EncryptedDocumentException, IOException {
	 String customername = f.getExcelValue("CreateAccount", 1, 0);
	 String customerDescp = f.getExcelValue("CreateAccount", 1, 1);
	 HomePage h=new HomePage(driver);
	 h.clickTaskTab();
	 TaskListPage t=new TaskListPage(driver);
	 t.getAddNewBtn().click();
	 t.getNewCustomerMenu().click();
	 t.getEnterNewCustomertbx().sendKeys(customername);
	 t.getEnterCustomerdescriptionTbx().sendKeys(customerDescp);
	 t.getProjectDropDown().click();
	 t.getOurCompanyMenu().click();
	 t.getCreateCustomerBtn().click();
	 Thread.sleep(7000);//we have explict wait here
	 String ActualText = t.getActualCustomerCreated().getText(); 
	 Assert.assertEquals(ActualText, customername);
	}
	}
