import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;


public class WebDriverCommonLib {
public void login(WebDriver driver)
{
	driver = new FirefoxDriver();
	driver.get("https://www.amazon.com/");
	driver.findElement(By.xpath("//*[text()='Your Amazon.com']")).click();
	
}
}
