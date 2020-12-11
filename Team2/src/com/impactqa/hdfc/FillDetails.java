package com.impactqa.hdfc;

import java.io.File;
import java.io.FileInputStream;

import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.Test;

public class FillDetails {
	
	public static Select select;
	
	public static void Operations(WebDriver driver) throws Exception {

		File file = new File("C:\\Users\\IQA\\Desktop\\selenium\\team excel\\fillDetails.xlsx");
		FileInputStream fileInputStream = new FileInputStream(file);
		Workbook workbook = new XSSFWorkbook(fileInputStream);
		Sheet sheet = workbook.getSheetAt(0);

		int numberOfRows = sheet.getPhysicalNumberOfRows();

		

		for (int i = 1; i < numberOfRows; i++) {

			// Select the title from the drop down
			select = new Select(Xpath.title(driver));
			select.selectByVisibleText(sheet.getRow(i).getCell(0).getStringCellValue());
			Thread.sleep(5000);
			// Enter the lastName of the applicant
			Xpath.lastname(driver).clear();
			Thread.sleep(2000);
			Xpath.lastname(driver).sendKeys(sheet.getRow(i).getCell(2).getStringCellValue());
			Thread.sleep(5000);
			// select the gender
			if (sheet.getRow(i).getCell(3).getStringCellValue() == "M") {
				Xpath.genderM(driver).click();
			} else {
				Xpath.genderF(driver).click();
			}

			// Enter the address in first
			Xpath.adress1(driver).sendKeys(sheet.getRow(i).getCell(5).getStringCellValue());
			Thread.sleep(5000);
			// Enter the address in Second
			Xpath.adress2(driver).sendKeys(sheet.getRow(i).getCell(6).getStringCellValue());
			Thread.sleep(5000);
			// Enter the address in Third
			Xpath.adress3(driver).sendKeys(sheet.getRow(i).getCell(7).getStringCellValue());
			Thread.sleep(5000);
			// Enter the Nominee name
			Xpath.nominee(driver).sendKeys(sheet.getRow(i).getCell(8).getStringCellValue());
			Thread.sleep(5000);
			// Select the RelationShip
			select = new Select(Xpath.relationtofnominee(driver));
			select.selectByVisibleText(sheet.getRow(i).getCell(9).getStringCellValue());
			Thread.sleep(5000);
			// Select the Height
			select = new Select(Xpath.height(driver));
			select.selectByVisibleText(sheet.getRow(i).getCell(10).getStringCellValue());
			Thread.sleep(5000);
			// Enter the Weight
			Xpath.weight(driver).sendKeys(sheet.getRow(i).getCell(11).getStringCellValue());
			Thread.sleep(5000);
			// Enter the BMI
			Xpath.BMI(driver).sendKeys(sheet.getRow(i).getCell(12).getStringCellValue());

			// Select that Any Pre Existing Disease?
			if (sheet.getRow(i).getCell(13).getStringCellValue() == "No") {
				Xpath.anydiseaseNO(driver).click();
			} else {
				Xpath.anydiseaseYes(driver).click();
			}

			Thread.sleep(5000);
			Xpath.back(driver).click();

		}

	}

}
