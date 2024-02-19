package module;

import org.openqa.selenium.By;

import baseDriver.DriverSetUp;

public class DashboardPage {
	DriverSetUp context;
	public DashboardPage(DriverSetUp context) {
		this.context=context;
		
	}
	
	public void aboutUs() {
		context.driver.findElement(By.xpath("(//a[text()='About Us'])[1]")).click();
	}
	
	public void service() {
		context.driver.findElement(By.xpath("(//a[text()='Services'])[1]")).click();
	}
	
	public void product() {
		context.driver.findElement(By.xpath("(//a[text()='Products'])[1]")).click();
	}
	
	public void location() {
		context.driver.findElement(By.xpath("(//a[text()='Locations'])[1]")).click();
	}
	
	public void adminPage() {
		context.driver.findElement(By.xpath("//a[text()='Admin Page']")).click();
	}
	

}
