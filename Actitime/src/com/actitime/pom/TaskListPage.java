package com.actitime.pom;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class TaskListPage {
	@FindBy(xpath="//div[text()='Add New']")
	private WebElement AddNewBtn;

	@FindBy(xpath="//div[text()='+ New Customer']")
	private WebElement NewCustomerMenu;


	@FindBy(xpath="(//input[@placeholder='Enter Customer Name'])[2]")
	private WebElement EnterNewCustomertbx;

	@FindBy(xpath="//textarea[@placeholder='Enter Customer Description']")
	private WebElement EnterCustomerdescriptionTbx;

	@FindBy(xpath="(//div[text()='- Select Customer -'])[1]")
	private WebElement ProjectDropDown;

	@FindBy(xpath="//div[@class='itemRow cpItemRow ' and text()='Our company']")
	private WebElement OurCompanyMenu;

	@FindBy(xpath="//div[text()='Create Customer']")
	private WebElement CreateCustomerBtn;

	public WebElement getActualCustomerCreated() {
	 return ActualCustomerCreated;
	}

	@FindBy(xpath="//div[@class='title' and @title]")
	private WebElement ActualCustomerCreated;

	public TaskListPage(WebDriver driver) {
	 PageFactory.initElements(driver, this);
	}

	public WebElement getAddNewBtn() {
	 return AddNewBtn;
	}
	public WebElement getNewCustomerMenu() {
		 return NewCustomerMenu;
		}

		public WebElement getEnterNewCustomertbx() {
		 return EnterNewCustomertbx;
		}

		public WebElement getEnterCustomerdescriptionTbx() {
		 return EnterCustomerdescriptionTbx;
		}

		public WebElement getProjectDropDown() {
		 return ProjectDropDown;
		}

		public WebElement getOurCompanyMenu() {
		 return OurCompanyMenu;
		}

		public WebElement getCreateCustomerBtn() {
		 return CreateCustomerBtn;
		}
		}
