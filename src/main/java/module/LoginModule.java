package module;

import org.openqa.selenium.By;

import baseDriver.DriverSetUp;

public class LoginModule {
	DriverSetUp context;
	public LoginModule(DriverSetUp context) {
		this.context=context;
	}
	
	public void userName(String name) {
		 context.driver.findElement(By.xpath("//input[@name='username']")).sendKeys(name);
	}
	
	public void password(String name) {
		 context.driver.findElement(By.xpath("//input[@name='password']")).sendKeys(name);
	}
	
	public void login() {
		context.driver.findElement(By.xpath("//input[@class='button']")).click();
	}
	
	public void forgotPass() {
		context.driver.findElement(By.xpath("//a[text()='Forgot login info?']")).click();
	}
	
	public void reg() {
		context.driver.findElement(By.xpath("//a[text()='Register']")).click();
	}
	
	
	
	
	

}
