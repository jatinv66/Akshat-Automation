 package bajaj;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import testselectors.SelectAmazon;

public class amazontest extends SelectAmazon  {

	public static void main(String[] args) throws Exception {
		// TODO Auto-generated method stub
          
		System.setProperty("webdriver.chrome.driver","C:\\Users\\HP\\Downloads\\chromedriver_win32/chromedriver.exe");
		WebDriver driver = new ChromeDriver();
	        driver.manage().window().maximize();
	        driver.manage().deleteAllCookies();
	        
	        driver.get(visit_amazon);
	        
	        driver.findElement(By.xpath(Signin)).click();
	        WebElement get_emailorphone=driver.findElement(By.id("ap_email"));
	        get_emailorphone.sendKeys(number);
	        
	        driver.findElement(By.id("continue")).submit();
	        
	        
	        WebElement get_password=driver.findElement(By.id("ap_password"));
	        get_password.sendKeys(password);
	        
	        driver.findElement(By.id("signInSubmit")).submit();
	        WebElement select_element=  driver.findElement(By.xpath(Dropbutton));
		      Select sel=new Select(select_element);
		      sel.selectByVisibleText("Electronics");

		      
		      WebElement search_box=driver.findElement(By.xpath(Search_box));
		      search_box.sendKeys("Iphone 12");
		      search_box.sendKeys(Keys.ENTER);
		      
		      driver.findElement(By.linkText(Device_to_select)).click();
		      
		      driver.findElement(By.xpath(move_to_cart)).click();
		      driver.findElement(By.xpath(cart_info)).click();
		      Thread.sleep(2000);
		}

}
	        
	        
	        
	
