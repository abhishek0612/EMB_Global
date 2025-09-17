package EMB_Automate;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.Test;

public class Add_Patient {
	@Test

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		WebDriver driver = new ChromeDriver();
		//Add patient 
        driver.findElement(By.xpath("//button[@id='add-patient-btn']")).click();
        driver.findElement(By.xpath("//input[@placeholder='MRN']")).sendKeys("8833202");
        driver.findElement(By.xpath("//input[@placeholder='First Name']")).sendKeys("Abhi1");
        driver.findElement(By.xpath("//input[@placeholder='Last Name']")).sendKeys("James");
        driver.findElement(By.cssSelector("input[placeholder='Phone Number']")).sendKeys("9847382373");
        
       driver.findElement(By.xpath("//select[@id='language']")).click();
       Thread.sleep(2000);
       WebElement timezoneDropdown = driver.findElement(By.id("timezone"));
       Select select = new Select(timezoneDropdown);
       select.selectByVisibleText("PST");
       
      
       WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));

        driver.findElement(By.xpath("//button[@type='submit' and text()='Submit']")).click();     

	}

}
