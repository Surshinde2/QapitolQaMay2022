package sampleProgram;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class browser_Open {
	   public static void main(String[] args) throws InterruptedException {  
		      
           // System Property for Chrome Driver   
        System.setProperty("webdriver.chrome.driver", "C:\\suraj Practice\\chromedriver_win32\\chromedriver.exe");  
          
             // Instantiate a ChromeDriver class.     
        WebDriver driver=new ChromeDriver();  
          
           // Launch Website  
        driver.navigate().to("http://www.facebook.com");  
       driver.findElement(By.xpath("//input[@id='email']"));
       
       driver.findElement(By.xpath("//input[@id='email']")).sendKeys("s60940@gmail.com");
       
      driver.findElement(By.xpath("//input[@type='password']")).sendKeys("sarkarraj");
     
       
       WebElement Login = driver.findElement(By.xpath("//button[@name='login']"));
       Login.click();
     //  driver.findElement(By.partialLinkText("Log In"));
       
       
       
       
       
       
       
       
       
       
       
    }  
  
}  

