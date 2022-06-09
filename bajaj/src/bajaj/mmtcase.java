package bajaj;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class mmtcase {

	public static void main(String[] args) throws Exception {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver","C:\\Users\\HP\\Downloads\\chromedriver_win32/chromedriver.exe");

		WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        
        driver.get("https://www.makemytrip.com");
        
       WebElement radio1= driver.findElement(By.xpath("//*[@id=\"root\"]/div/div[2]/div/div/div/ul/li[2]"));
       radio1.click();

//      Thread.sleep(3000);
//       driver.findElement(By.xpath("//*[@id=\"root\"]/div/div[2]/div/div/div[2]/div[1]/div[1]/label")).click();
//       Thread.sleep(3000);
//     
//       driver.findElement(By.xpath("//*[@id=\"root\"]/div/div[2]/div/div/div[2]/div[1]/div[1]/div[1]/div/div/div/input")).sendKeys("Chandigarh, India");
//       
//    List<WebElement>dynamicList=driver.findElements(By.cssSelector("#react-autowhatever-1-section-0-item-0 > div > div.calc60 > p.font14.appendBottom5.blackText"));
//     for(int i=0;i<dynamicList.size();i++) {
//    	 String text=dynamicList.get(i).getText();
//    	
//    	 if(text.contains("Chandigarh, India")) {
//    	 dynamicList.get(i).click();
//    		 break;
//    	 }
//     }
            
       driver.findElement(By.xpath("//div[@id=\"root\"]/div/div[2]/div/div/div[2]/p/a")).click();
       driver.findElement(By.xpath("//input[@id=\"departure\"]")).click();
       Thread.sleep(3000);
       driver.findElement(By.xpath("//div[@class=\"DayPicker-Day\"][contains(@aria-label,'25 June 2022')]")).click();
//       driver.findElement(By.xpath( "//input[@id=\"return\"]")).click();
       driver.findElement(By.xpath("//div[@class=\"DayPicker-Day--end\"][contains(@aria-label,'25 June 2022')]")).click();
       driver.findElement(By.xpath("//button[@class='primaryBtn hsw_searchButton']")).click();
	}

}
