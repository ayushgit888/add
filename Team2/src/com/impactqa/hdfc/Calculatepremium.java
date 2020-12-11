package com.impactqa.hdfc;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.util.concurrent.TimeUnit;

import org.apache.commons.collections4.functors.SwitchTransformer;
import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class Calculatepremium {
	
	static JavascriptExecutor js = null;

	

	public static void data(WebDriver driver ) throws Exception {

		File file = new File("C:\\Users\\IQA\\Desktop\\selenium\\team excel\\aniketdata.xlsx");
		FileInputStream fis = new FileInputStream(file);
		@SuppressWarnings("resource")
		XSSFWorkbook wb = new XSSFWorkbook(fis);
		Sheet sheet = wb.getSheetAt(4);

		int rows = sheet.getLastRowNum();

		Thread.sleep(2000);
		//selecting planttype for individual
		Xpath.plantype(driver).click();
		Thread.sleep(2000);
//selecting proposer 
		Xpath.proposer(driver).click();

		Thread.sleep(2000);
		Xpath.date(driver).sendKeys("14/11/1990");
		for (int i = 1; i <= rows; i++) {

		
//taking data from excel sheet for name ,mobile,email and pincode
			Xpath.name(driver).sendKeys(sheet.getRow(i).getCell(0).getStringCellValue());
			Xpath.mobile(driver).sendKeys(sheet.getRow(i).getCell(1).getStringCellValue());
			Xpath.email(driver).sendKeys(sheet.getRow(i).getCell(2).getStringCellValue());
			Xpath.pincode(driver).sendKeys(sheet.getRow(i).getCell(3).getStringCellValue());

		}
//click on disclaimer check
		Xpath.disclaimercheck(driver).click();
		Thread.sleep(2000);
		//click on uncheck whatsaap disclaimer
		Xpath.disclaimeruncheck(driver).click();
		Thread.sleep(2000);
		//click on calculatepremium button
		Xpath.calculatepremium(driver).click();
		Thread.sleep(5000);

		js = (JavascriptExecutor) driver;

		js.executeScript("window.scrollTo(0,document.body.scrollHeight)");
// click on proceed button
		Xpath.proceedpremium(driver).click();

	}
}
