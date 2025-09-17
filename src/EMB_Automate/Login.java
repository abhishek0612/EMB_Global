package EMB_Automate;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.Test;

public class Login {
	@Test

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
      WebDriver  driver = new ChromeDriver();
        
      //Login
        driver.get("https://qa-takehome.dtxplus.com/");
        driver.manage().window().maximize();
        driver.findElement(By.id("username")).sendKeys("dtxplus");
        driver.findElement(By.id("password")).sendKeys("dtxplus");
        driver.findElement(By.xpath("//button[@type='submit']")).click();
        
        
           
        
        //Logout 
       // driver.findElement(By.xpath("//button[@id='logout']")).click();
         
	}

}
