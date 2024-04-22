package selenium1;

import java.io.File;
import java.io.IOException;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class screenshotdemo {

	

	public static void main(String[] args) throws InterruptedException, IOException {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Lenovo\\Downloads\\chromedriver-win64\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
		
	 //   File src =ts.getScreenshotAs(OutputType.FILE);
		Thread.sleep(2000);
		
	    	
	    WebElement un= driver.findElement(By.xpath("//input[@name=\"username\"]"));
	    un.sendKeys("admin");
	    WebElement pd= driver.findElement(By.xpath("//input[@type=\"password\"]"));
        pd.sendKeys("admin123");
	    WebElement lo= driver.findElement(By.xpath("//button[@type=\"submit\"]"));
	    TakesScreenshot ts=(TakesScreenshot)driver;
	    File src =ts.getScreenshotAs(OutputType.FILE);
	    File dest=new File("C:\\Users\\Lenovo\\Downloads\\output.png");
	    FileUtils.copyFile(src, dest);
        lo.click();
        
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	}

}
