package org.test;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class Cucu {
	static WebDriver driver;
	@Given("User in Guru telecom page and click the submit button")

public void user_in_Guru_telecom_page_and_click_the_submit_button() {
   
	System.setProperty("webdriver.chrome.driver", "C:\\Users\\Welcome\\Downloads\\eclipse-java-oxygen-3a-win32\\eclipse\\GunaTestNG Project\\Cc\\Driversss\\chromedriver.exe");
	driver=new ChromeDriver();
	driver.get("http://demo.guru99.com/telecom/");
	driver.findElement(By.xpath("(//a[text()='Add Customer'])[1]")).click();
}

@When("User Enters the details and click submit button {string},{string},{string},{string},{string}")
public void user_Enters_the_details_and_click_submit_button(String string, String string2, String string3, String string4, String string5) {
	driver.findElement(By.xpath("//label[text()='Done']")).click();
	driver.findElement(By.xpath("//input[@id='fname']")).sendKeys(string);
	driver.findElement(By.xpath("//input[@id='lname']")).sendKeys(string2);
	driver.findElement(By.xpath("//input[@id='email']")).sendKeys(string3);
	driver.findElement(By.xpath("//textarea[@id='message']")).sendKeys(string4);
	driver.findElement(By.xpath("//input[@id='telephoneno']")).sendKeys(string5);
	driver.findElement(By.xpath("//input[@value='Submit']")).click();

}

@Then("User verify customer id is displayed")
public void user_verify_customer_id_is_displayed() {
WebElement r = driver.findElement(By.xpath("//b[text()='Please Note Down Your CustomerID']"));
String rt = r.getText();
if (rt.equals("Please Note Down Your CustomerID")) {
	System.out.println("success");
	
}
else {
	System.out.println("fail");
}
}


}
