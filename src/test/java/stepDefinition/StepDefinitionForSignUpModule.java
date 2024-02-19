package stepDefinition;

import org.testng.Assert;

import baseDriver.DriverSetUp;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import module.LoginModule;
import module.RegisterModule;

public class StepDefinitionForSignUpModule {
	
	DriverSetUp context;
	public StepDefinitionForSignUpModule(DriverSetUp context) {
		this.context=context;
	}
	
	@Given("User enter the landing page and then click register button")
	public void userEnterTheLandingPageAndThenClickRegisterButton() {
	   LoginModule loginPage = new LoginModule(context);
	   loginPage.reg();
	}
	@When("User enter the all details like {string},{string},{string},{string},{string},{string},{string},{string},{string},{string},{string}")
	public void userEnterTheAllDetailsLike(String string, String string2, String string3, String string4, String string5, String string6, String string7, String string8, String string9, String string10, String string11) {
	   RegisterModule regPage = new RegisterModule(context);
	   regPage.enterFirstName(string);
	   regPage.enterLastName(string2);
	   regPage.enterAddress(string3);
	   regPage.enterCity(string4);
	   regPage.enterState(string5);
	   regPage.enterZip(string6);
	   regPage.enterPhone(string7);
	   regPage.enterSSN(string8);
	   regPage.enterUserName(string9);
	   regPage.enterPassword(string10);
	   regPage.enterConfirmPassword(string11);
	}
	@Then("User click the register button and its shows successfully message")
	public void userClickTheRegisterButtonAndItsShowsSuccessfullyMessage() {
		   RegisterModule regPage = new RegisterModule(context);
		   regPage.clickReg();
		   String successfulMessage = regPage.successfulMessage();
		   System.out.println(successfulMessage);
		   String text = "Your account was created successfully. You are now logged in.";
		   Assert.assertEquals(successfulMessage, text);
	}


}
