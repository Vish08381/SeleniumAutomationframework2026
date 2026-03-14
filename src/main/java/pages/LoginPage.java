package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import utils.Log;

public class LoginPage {

	
	private WebDriver driver;
	
	@FindBy(id="Email")
	WebElement userNameTextBox;
	
	@FindBy(id="Password")
	WebElement passwordTextBox;
	
	@FindBy(xpath="//*[@id=\\\"main\\\"]/div/section/div/div[2]/div[1]/div/form/div[3]/button")
	WebElement loginButton ; 
	
	
//	private By userNameTextBox = By.id("Email"); // - By → A Selenium class that defines a strategy for locating elements
//	private By passwordTextBox = By.id("Password");
//	private By loginButton = By.xpath("//*[@id=\"main\"]/div/section/div/div[2]/div[1]/div/form/div[3]/button");
	
	public  LoginPage(WebDriver driver)
	{
		PageFactory.initElements(driver, this);
		this.driver = driver;
	}
	
	public void enterUserName(String userName)
	{
		userNameTextBox.clear();
		userNameTextBox.sendKeys(userName);
//		driver.findElement(userNameTextBox).clear();
//		driver.findElement(userNameTextBox).sendKeys(userName);;
	}
	
	public void enterPassword(String password)
	{
		passwordTextBox.clear();
		passwordTextBox.sendKeys(password);
//		driver.findElement(passwordTextBox).clear();
//		driver.findElement(passwordTextBox).sendKeys(password);;
	}
	
	public void clickLogin()
	{
		Log.info("Clicking login button..");
		loginButton.click();
//		driver.findElement(loginButton).click();
	}
}
