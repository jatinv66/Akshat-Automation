package bajaj;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import testselectors.Selectbajaj;
public class Bajaj extends Selectbajaj{
public static void main(String[] args) throws Exception {
		   
				System.setProperty("webdriver.chrome.driver","C:\\Users\\HP\\Downloads\\chromedriver_win32/chromedriver.exe");
				WebDriver driver = new ChromeDriver();
			        driver.manage().window().maximize();
			        driver.manage().deleteAllCookies();
		//visit google
        driver.get(google);
        driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
        
        //search Bajaj Finserv Health Limited
        driver.findElement(By.cssSelector(selector)).sendKeys("Bajaj Finserv Health Limited"+Keys.ENTER);
       
       //visit https://www.bajajfinservhealth.in/
        driver.findElement(By.cssSelector(link)).click();
       
         //Search Doctors
         driver.findElement(By.cssSelector(searchbox)).sendKeys("Doctors"+Keys.ENTER);
        
        driver.findElement(By.cssSelector(result_one)).click();
         
        //click slot and move check page
        driver.findElement(By.cssSelector(slot_selector)).click();
        	
        }
}
