package sampleProgram;

import java.time.Duration;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.Test;

public class TekesScr {

	public static void main(String[] args) {
	     System.setProperty("webdriver.chrome.driver", "C:\\suraj Practice\\chromedriver_win32\\chromedriver.exe");  
         
         // Instantiate a ChromeDriver class.     
    WebDriver driver=new ChromeDriver();  
      
       // Launch Website  
    driver.navigate().to("http://www.facebook.com");  
		
		//WebDriverWait wait =new WebDriverWait(driver,30);
		
		//WebDriverWait wait= new WebDriverWait(driver, Duration.ofSeconds(120,0));
	//	wait.until(ExpectedConditions.visibilityOfAllElementsLocatedBy(By.xpath("afwegr")));
		
//driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));


WebDriverWait wait=new WebDriverWait(driver, Duration.ofSeconds(120,0));
Alert alt=wait.until(ExpectedConditions.alertIsPresent());
//alt.authenticateUsing(new user And Password(**username****password**));


@Test(group=(smoke)){		
	public void m1() {
		
	}	
}

JavascriptExcutor js=JavascriptExcutor(driver);
js.ExecuteScript("document.getElementBy("login").Value=textwithout sendkeys"); 		
;
 @Test(enabled=False) {
		
 }
 
 WebElement ele=driver.findElement(By.xpath("awfaeg"));
 
 WebElement ele=driver.findElement(By.xpath("awfaeg")).isDisplayed();
 WebElement ele=driver.findElement(By.xpath("awfaeg")).isSelected();
 WebElement ele=driver.findElement(By.xpath("awfaeg")).isEnabled();
 
 Actions act=new Actions(driver);
 WebElement ele=driver.findElement(By.xpath("awfaeg"));
 act.moveToElement(ele).click().Perform();
 
 Actions act= new Actions(driver);
 act.moveToElement(ele).click();
 
 
 
 
 
 
 
 
 
 
 
 
 


 
 
 
 
 
 

		
		
		
		
		
		
	}
}
