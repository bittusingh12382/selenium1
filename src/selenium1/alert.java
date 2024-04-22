package selenium1;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class alert {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Lenovo\\Downloads\\chromedriver-win64\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
	    //alert-popup
		driver.get("https://demo.automationtesting.in/Alerts.html");
	    driver.manage().window();
	    driver.manage().deleteAllCookies();
	    
	    driver.findElement(By.xpath("//button[@class='btn btn-danger']")).click();
	    		
	    Alert alert= driver.switchTo().alert();		
	    Thread.sleep(2000);
	    System.out.println(alert.getText());
	    alert.accept();
	
	    //confirmation box
	    driver.findElement(By.xpath("//a[normalize-space()='Alert with OK & Cancel']")).click();     
	    driver.switchTo().alert();
	    System.out.println(alert.getText());
	    alert.accept();
	
	    
	    
	    
	    
	    
	    
	    
	    
	    
	
	
	}

}
