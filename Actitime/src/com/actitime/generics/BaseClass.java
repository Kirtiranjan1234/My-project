package com.actitime.generics;

import java.io.IOException;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeTest;

import com.actitime.pom.HomePage;
import com.actitime.pom.LoginPage;

public class BaseClass {
	static {
		 System.setProperty("webdriver.chrome.driver", "./driver/chromedriver.exe");
		}
		public WebDriver driver;
		public FileLib f=new FileLib();
		@BeforeTest
		public void openBrowser() throws IOException {
		String URL = f.getPropertyValue("url");
		 driver=new ChromeDriver();
		 driver.manage().window().maximize();
		 driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		 driver.get(URL);
		}
		@AfterTest
		public void closeBrowser() {
		 driver.close();
		}

		@BeforeMethod
		public void login() throws IOException {
		 String un = f.getPropertyValue("username");
		 String pw = f.getPropertyValue("password");
		 LoginPage l=new LoginPage(driver);
		 l.setLogin(un, pw);
		}
		@AfterMethod
		public void logout() {
		 HomePage h=new HomePage(driver);
		 h.setLogout();
		 
		}
		}
