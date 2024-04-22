package selenium1;

import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Windowshandling {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub

		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Lenovo\\Downloads\\chromedriver-win64\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.facebook.com/");
		driver.manage().window().maximize();
		
		WebElement insta=driver.findElement(By.xpath("//a[@title='Take a look at Instagram']"));
	    insta.click();

	    String parentID= driver.getWindowHandle();  
        System.out.println("ParentID"+parentID);
        Set<String>  childID=driver.getWindowHandles();
        for(String ch:childID)
        {	
        if(!(parentID.equals(ch)))
        		 {	  
          driver.switchTo().window(ch);
        		 }	
        } 	

      	WebElement phonenumber =driver.findElement(By.xpath("//input[@name='username']"));       
        
		phonenumber.sendKeys("9304716588");
		

        Thread.sleep(2000);
		
		
		
		
		
		
		
		
		
		
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	}

}
