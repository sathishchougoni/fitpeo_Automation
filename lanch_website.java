package Lanch_website;

import java.time.Duration;
import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;


public class lanch_website {
    private WebDriver driver;
    
	public static String url = "https://www.fitpeo.com/"; 
	 
	
	
	
@Test
    public void FitPeoAutomation() throws InterruptedException {
	System.setProperty("webdriver.chrome.driver", "chromedriver.exe");
        driver = new ChromeDriver();
        
       
       driver.manage().deleteAllCookies();
       driver.manage().window().maximize();
       driver.manage().timeouts().implicitlyWait(20,TimeUnit.SECONDS );
       driver.get(url);
       driver.findElement(By.linkText("Revenue Calculator")).click();
       WebElement inputBox = driver.findElement(By.id(":r0:"));
       int desiredValue = 830;
       inputBox.clear();
       inputBox.sendKeys(String.valueOf(desiredValue));
       List<WebElement> checkbox = driver.findElements(By.xpath("//input[@type='checkbox']"));
      for(WebElement Element:checkbox)
      {
    	 Element.click();
    	 
    	  
      }
           
       
       driver.close();
       

       
       
    
   
     
       
    
   
       
     

}}
