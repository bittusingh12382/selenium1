package selenium1;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class draganddrop {

	public static <Actions> void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Lenovo\\Downloads\\chromedriver-win64\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
	
     //Mouse Aactions
	
		driver.get("https://www.globalsqa.com/demo-site/draganddrop/#google_vignette");
	    driver.manage().window();
	
	    Actions a=new actions(driver);
	    WebElement frame=driver
	
	
	
	    		

	    		


	    		
	    		
	    		
	
	}

}
