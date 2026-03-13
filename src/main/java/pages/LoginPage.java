package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class LoginPage {

	
	private WebDriver driver;
	private By userNameTextBox = By.id("Email"); // - By → A Selenium class that defines a strategy for locating elements
	private By passwordTextBox = By.id("Password");
	private By loginButton = By.xpath("//*[@id=\"main\"]/div/section/div/div[2]/div[1]/div/form/div[3]/button");
	
	public  LoginPage(WebDriver driver)
	{
		this.driver = driver;
	}
	
	public void enterUserName(String userName)
	{
		driver.findElement(userNameTextBox).clear();
		driver.findElement(userNameTextBox).sendKeys(userName);;
	}
	
	public void enterPassword(String password)
	{
		driver.findElement(passwordTextBox).clear();
		driver.findElement(passwordTextBox).sendKeys(password);;
	}
	
	public void clickLogin()
	{
		driver.findElement(loginButton).click();
	}
}
