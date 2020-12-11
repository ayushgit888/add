package com.impactqa.hdfc;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class Xpath 
{static WebElement element=null;
	public static WebElement range(WebDriver driver)
	{
		
		element=driver.findElement(By.xpath("//*[@id='Owner-Type-Label']"));
	
		return element;
		
	}
	public static WebElement valueofrange(WebDriver driver)
	{
		
		element=driver.findElement(By.xpath("//*[text()='Upto 5 Lakhs']"));
	
		return element;
		
	}
	
	public static WebElement submitbutton(WebDriver driver)
	{
		element=driver.findElement(By.xpath("//*[@id='SubmitButton']"));
		
		return element;
		
	}
	public static WebElement plantype(WebDriver driver)
	{
		element=driver.findElement(By.xpath("//*[@id='ContentPlaceHolder1_rblFloater_0']"));
		
		return element;
		
	}
	
	public static WebElement proposer(WebDriver driver)
	{
		element=driver.findElement(By.xpath("//*[@id='ContentPlaceHolder1_rblProposer_1']"));
		
		return element;
		
	}
	public static WebElement date(WebDriver driver)
	{
		element=driver.findElement(By.xpath("//*[@id='ContentPlaceHolder1_ucA1DOB_txtDOB']"));
		
		return element;
		
	}
	public static WebElement name(WebDriver driver)
	{
		element=driver.findElement(By.xpath("//*[@id='ContentPlaceHolder1_txtName']"));
		
		return element;
		
	}
	public static WebElement mobile(WebDriver driver)
	{
		element=driver.findElement(By.xpath("//*[@id='ContentPlaceHolder1_txtMob']"));
		
		return element;
		
	}
	
	public static WebElement email(WebDriver driver)
	{
		element=driver.findElement(By.xpath("//*[@id='ContentPlaceHolder1_txtemail']"));
		
		return element;
		
	}
	
	public static WebElement pincode(WebDriver driver)
	{
		element=driver.findElement(By.xpath("//*[@id='ContentPlaceHolder1_txtPinCode']"));
		
		return element;
		
	}
	
	public static WebElement disclaimercheck(WebDriver driver)
	{
		element=driver.findElement(By.xpath("//*[@id='chkTRAIDisclaimer']"));
		
		return element;
		
	}
	public static WebElement disclaimeruncheck(WebDriver driver)
	{
		element=driver.findElement(By.xpath("//*[@id='chkWhatsAppDisclaimer']"));
		
		return element;
		
	}
	public static WebElement calculatepremium(WebDriver driver)
	{
		element=driver.findElement(By.xpath("//*[@id='ContentPlaceHolder1_btnCalcPrem']	"));
		
		return element;
		
	}
	public static WebElement proceedpremium(WebDriver driver)
	{
		element=driver.findElement(By.xpath("//*[@id='ContentPlaceHolder1_btnBuy']"));
		
		return element;
		
	}
	public static WebElement title(WebDriver driver)
	{
		element=driver.findElement(By.xpath("//*[@id='ContentPlaceHolder1_ddlTitle']"));
		
		return element;
		
	}
	
	public static WebElement lastname(WebDriver driver)
	{
		element=driver.findElement(By.xpath("//*[@id='ContentPlaceHolder1_txtLastName']"));
		
		return element;
		
	}
	public static WebElement gender(WebDriver driver)
	{
		element=driver.findElement(By.xpath("//*[@id='ContentPlaceHolder1_rbGender_0']"));
		
		return element;
		
	}
	public static WebElement adress1(WebDriver driver)
	{
		element=driver.findElement(By.xpath("//*[@id='ContentPlaceHolder1_txtadd1']"));
		
		return element;
		
	}
	public static  WebElement adress2(WebDriver driver)
	{
		element=driver.findElement(By.xpath("//*[@id='ContentPlaceHolder1_txtadd2']"));
		
		return element;
		
	}
	public static WebElement adress3(WebDriver driver)
	{
		element=driver.findElement(By.xpath("//*[@id='ContentPlaceHolder1_txtadd3']"));
		
		return element;
		
	}
	public static WebElement height(WebDriver driver)
	{
		element=driver.findElement(By.xpath("//*[@id='ContentPlaceHolder1_uchealthInsuredDetails_GVInsDetails_ddlHeightDetails_0']"));
		
		return element;
		
	}
	public static WebElement relationtofnominee(WebDriver driver)
	{
		element=driver.findElement(By.xpath("//*[@id='ContentPlaceHolder1_uchealthInsuredDetails_GVInsDetails_ddlNRel_0']"));
		
		return element;
		
	}
	public static WebElement nominee(WebDriver driver)
	{
		element=driver.findElement(By.xpath("//*[@id='ContentPlaceHolder1_uchealthInsuredDetails_GVInsDetails_txtNominee_0']"));
		
		return element;
		
	}
	public static WebElement anydisease(WebDriver driver)
	{
		element=driver.findElement(By.xpath("//*[@id='ContentPlaceHolder1_uchealthInsuredDetails_GVInsDetails_pedNo_0']"));
		
		return element;
		
	}
	
	public  static WebElement back(WebDriver driver)
	{
		element=driver.findElement(By.xpath("//*[@id='ContentPlaceHolder1_btnBack']"));
		
		return element;
		
	}
	public static WebElement anydiseaseYes(WebDriver driver) {
		element = driver
				.findElement(By.xpath("//*[@id='ContentPlaceHolder1_uchealthInsuredDetails_GVInsDetails_pedYes_0']"));
	
		return element;

	}
	public static WebElement genderM(WebDriver driver) {
		element = driver.findElement(By.id("ContentPlaceHolder1_rbGender_0"));
		return element;

	}

	public static WebElement genderF(WebDriver driver) {
		element = driver.findElement(By.id("ContentPlaceHolder1_rbGender_1"));
		return element;
	}

	public static WebElement weight(WebDriver driver) {
		element = driver.findElement(By.id("ContentPlaceHolder1_uchealthInsuredDetails_GVInsDetails_txtWeight_0"));
		
		return element;
	}

	public static WebElement BMI(WebDriver driver) {
		element = driver.findElement(By.id("ContentPlaceHolder1_uchealthInsuredDetails_GVInsDetails_txtbmi_0"));
		
		return element;
	}
	public static WebElement anydiseaseNO(WebDriver driver) {
		element = driver
				.findElement(By.xpath("//*[@id='ContentPlaceHolder1_uchealthInsuredDetails_GVInsDetails_pedNo_0']"));
		
		return element;
	
	}
}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	


