package OurGlue;

import java.util.concurrent.TimeUnit;


import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class StepDefinition 
{
	WebDriver driver;
	@Given("launch chrome browser")
	public void launch_chrome_browser() {
		
		 System.setProperty("webdriver.chrome.driver","C:\\chromedriver_win32\\chromedriver.exe");
			driver =new ChromeDriver();    // driver=111222
			driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);	
			driver.manage().window().maximize() ;	
			
	    
	}
	@Then("Open application URL {string}")
	public void open_application_url(String TestURL) {
		
		driver.get(TestURL);
	    
	}
	@Given("User enters Username as {string} and Password as {string}")
	public void user_enters_username_as_and_password_as(String UserName1, String PassWord1) {
		
		driver.findElement(By.xpath("//input[@name='username']")).sendKeys(UserName1);
		driver.findElement(By.xpath("//input[@placeholder='Password']")).sendKeys(PassWord1);
		driver.findElement(By.xpath("//button[@type='submit']")).click();

	}
	@Then("go to Skills Page")
	public void go_to_skills_page() {
		
		driver.findElement(By.xpath("(//a[@class='oxd-main-menu-item'])[1]")).click();
		driver.findElement(By.xpath("//span[text()='Qualifications ']")).click();
		driver.findElement(By.xpath("//a[text()='Skills']")).click();
		
		
	 
	}
	@When("create Skill record as Skill Name as {string} and Skill Description as {string}")
	public void create_skill_record_as_skill_name_as_and_skill_description_as(String SkillName1, String SkillDescr1) {
		
	    
		
		driver.findElement(By.xpath("//button[text()=' Add ']")).click();
		driver.findElement(By.xpath("(//input[@class='oxd-input oxd-input--active'])[2]")).sendKeys(SkillName1);
		driver.findElement(By.xpath("//textarea[ @placeholder='Type description here']")).sendKeys(SkillDescr1);
		driver.findElement(By.xpath("//button[text()=' Save ']")).click();
	}
	@Then("close browser")
	public void close_browser() {
		
		driver.close();
	 
	}


}