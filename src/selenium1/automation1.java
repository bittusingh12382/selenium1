package selenium1;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
public class automation1 {


	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Lenovo\\Downloads\\chromedriver-win64\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
		Thread.sleep(2000);
	    driver.getTitle();	
	    WebElement un= driver.findElement(By.xpath("//input[@name=\"username\"]"));
	    un.sendKeys("admin");
	    WebElement pd= driver.findElement(By.xpath("//input[@type=\"password\"]"));
        pd.sendKeys("admin123");
	    WebElement lo= driver.findElement(By.xpath("//button[@type=\"submit\"]"));
        lo.click();
        Thread.sleep(5000);
        WebElement buzz= driver.findElement(By.xpath("(//span[@class=\"oxd-text oxd-text--span oxd-main-menu-item--name\"])[12]"));	
	    buzz.click();
	    Thread.sleep(2000);
	    WebElement po= driver.findElement(By.xpath("//textarea[@class=\"oxd-buzz-post-input\"]"));
        po.sendKeys("bittu");
        Thread.sleep(5000);
        WebElement post= driver.findElement(By.xpath("//button[@type=\"submit\"]"));
        post.click();

	
	
	
	

}}
