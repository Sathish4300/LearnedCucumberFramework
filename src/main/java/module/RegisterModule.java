package module;

import org.openqa.selenium.By;

import baseDriver.DriverSetUp;

public class RegisterModule {
	DriverSetUp context;
	public RegisterModule(DriverSetUp context) {
		this.context=context;
	}
	
	
	By firstName = By.xpath("//input[@id='customer.firstName']");
	By lastName = By.xpath("//input[@id='customer.lastName']");
	By Address = By.xpath("//input[@id='customer.address.street']");
	By city = By.xpath("//input[@id='customer.address.city']");
	By state = By.xpath("//input[@id='customer.address.state']");
	By zip = By.xpath("//input[@id='customer.address.zipCode']");
	By phone = By.xpath("//input[@id='customer.phoneNumber']");
	By ssn = By.xpath("//input[@id='customer.ssn']");
	By userName = By.xpath("//input[@id='customer.username']");
	By password = By.xpath("//input[@id='customer.password']");
	By confirm = By.xpath("//input[@id='repeatedPassword']");
	By reg = By.xpath("(//input[@class='button'])[2]");
	By successful = By.xpath("//p[text()='Your account was created successfully. You are now logged in.']");
	By error = By.xpath("//span[text()='First name is required.']");
	By error2 = By.xpath("//span[text()='Passwords did not match.']");
	By sameUser = By.xpath("//span[@id='customer.username.errors']");
	
	public void enterFirstName(String name) {
		context.driver.findElement(firstName).sendKeys(name);
	}
	public void enterLastName(String name) {
		context.driver.findElement(lastName).sendKeys(name);
	}
	public void enterAddress(String name) {
		context.driver.findElement(Address).sendKeys(name);
	}
	public void enterCity(String name) {
		context.driver.findElement(city).sendKeys(name);
	}
	public void enterState(String name) {
		context.driver.findElement(state).sendKeys(name);
	}
	public void enterZip(String name) {
		context.driver.findElement(zip).sendKeys(name);
	}
	public void enterPhone(String name) {
		context.driver.findElement(phone).sendKeys(name);
	}
	public void enterSSN(String name) {
		context.driver.findElement(ssn).sendKeys(name);
	}
	public void enterUserName(String name) {
		context.driver.findElement(userName).sendKeys(name);
	}
	public void enterPassword(String name) {
		context.driver.findElement(password).sendKeys(name);
	}
	public void enterConfirmPassword(String name) {
		context.driver.findElement(confirm).sendKeys(name);
	}
	public void clickReg() {
		context.driver.findElement(reg).click();
	}
	public String successfulMessage() {
		return context.driver.findElement(successful).getText();
	}
	
	public String errorMessage() {
		return context.driver.findElement(error).getText();
	}
	
	public String error2() {
		return context.driver.findElement(error2).getText();
	}
	
	public String sameUserRegError() {
		return context.driver.findElement(sameUser).getText();
	}
}
