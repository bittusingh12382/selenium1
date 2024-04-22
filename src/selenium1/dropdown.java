package selenium1;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class dropdown {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Lenovo\\Downloads\\chromedriver-win64\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://uncodemy.com/");
	    Actions a = new Actions(driver);
	    WebElement ca= driver.findElement(By.xpath("//span[@id='categoriesBtn']"));
	    a.moveToElement(ca).perform();
	    Thread.sleep(2000);
	    WebElement st= driver.findElement(By.xpath("//a[@href='#'][normalize-space()='Software Testing']"));
 		a.moveToElement(st).perform();
	    WebElement MA= driver.findElement(By.xpath("//a[normalize-space()='Manual Testing']	"));
 		MA.click();
 		WebElement AT= driver.findElement(By.xpath("//a[normalize-space()='Automation Testing']"));		
	    AT.click();	
	    WebElement IT= driver.findElement(By.xpath("//a[normalize-space()='ISTQB Training']"));
	    IT.click();
	    WebElement MS= driver.findElement(By.xpath("//a[normalize-space()='Manual + Selenium']")); 		
	    MS.click();
	    Thread.sleep(1000);
	    WebElement CT= driver.findElement(By.xpath("//a[normalize-space()='Cloud Tools']"));
	    a.moveToElement(CT).perform();
	  
	    
	    
	    
	    
	    
	    
	    
	    
	    
	    
	    
	    
	    
	}

	private static void Actions() {
		// TODO Auto-generated method stub
		
	}

	private static Actions driver() {
		// TODO Auto-generated method stub
		return null;
	}
	
	
	

}
