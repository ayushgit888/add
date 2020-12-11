package com.impactqa.hdfc;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.util.concurrent.TimeUnit;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class initialization {
	static WebDriver driver = null;

	@BeforeClass
	public static void initial() throws Exception {
//  loading the chrome driver and navigating to hdfcergo site
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\IQA\\Desktop\\selenium\\chromedriver.exe");
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.navigate().to("https://www.hdfcergo.com/health-insurance");
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		Xpath.range(driver).click();
		Xpath.valueofrange(driver).click();
		Xpath.submitbutton(driver).click();
		Thread.sleep(4000);
		
	}

	@Test(priority = 1)
	public void firstpage() throws Exception {
		Thread.sleep(5000);
		Calculatepremium.data(driver);
		Thread.sleep(5000);

	}

	@Test(priority = 2)
	public void secondpage() throws Exception {
		Thread.sleep(5000);
		FillDetails.Operations(driver);
		Thread.sleep(5000);
	}

	@AfterClass
	public void close() {
		driver.close();
	}
}
