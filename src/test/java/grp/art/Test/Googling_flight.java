package grp.art.Test;


import java.io.File;
import java.io.IOException;
import java.util.HashSet;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeTest;

import com.google.common.io.Files;

public class Googling_flight {

	public static void main(String[] args) throws InterruptedException, IOException {
WebDriver driver=new ChromeDriver();
driver.get("https://www.google.com/travel/flights");
driver.manage().window().maximize();
driver.manage().deleteAllCookies();
System.out.println("Page Title is: "+driver.getTitle());
Thread.sleep(1000);
driver.navigate().refresh();
Thread.sleep(1000);
//Wait for flight page to be loaded
driver.findElement(By.xpath("(//div[contains(text(),'Flights')])[last()]"));

//Click on the roundtrip button to make oneway ticket
driver.findElement(By.xpath("(//*[@class='VfPpkd-aPP78e'])[last()-2]")).click();
driver.findElement(By.xpath("(//li[@data-value='2'])[1]")).click();
Thread.sleep(1000);

//wait for where from text

//wait for where To text
WebElement to = driver.findElement(By.xpath("//*[@aria-label='Where to? ']"));

//departures date
WebElement dep=driver.findElement(By.xpath("(//*[@placeholder='Departure'])[last()-1]"));

//type from which city
//from.sendKeys("BBI");


//type from to which city

to.sendKeys("BBI");
    Thread.sleep(1000);  
    Actions ac=new Actions(driver);
    
    ac.sendKeys(to,Keys.ARROW_DOWN);
    ac.sendKeys(Keys.ENTER).perform();
    
dep.click();
Thread.sleep(1000);
driver.findElement(By.xpath("//*[@data-iso='2024-08-21']")).click();
driver.findElement(By.xpath("(//*[text()='Done'])[last()]")).click();
Thread.sleep(1000);
driver.findElement(By.xpath("//span[@class='VfPpkd-kBDsod E6fbI']")).click();
Thread.sleep(1000);
//wait for airline option
driver.findElement(By.xpath("//*[@aria-label='Airlines, Not selected']")).click();
Thread.sleep(1000);
//select indigo flight
driver.findElement(By.xpath("//*[@aria-label='Select all airlines']")).click();

//filter the checkbox for indigo
List<WebElement> airlines = driver.findElements(By.xpath("//*[@type='checkbox']"));

for(WebElement air:airlines)
{
	System.out.println(air.getAttribute("value"));
	if(air.getAttribute("value").equals("IndiGo"))
	{
		if(!air.isSelected()) {
			air.click();
		}
	}
}
Thread.sleep(1000);

driver.findElement(By.xpath("(//button[@aria-label='Close dialog' and @data-tooltip-enabled='true'])[1]")).click();
Thread.sleep(1000);     
File f=((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
	Files.copy(f,new File("C:\\Users\\Hrushikesh Dandpat\\eclipse-workspace\\grp.art.Test\\src\\screenshot\\google.jpg"));
	List<WebElement> flight = driver.findElements(By.xpath("//*[contains(@aria-label,'From')]"));
	for(WebElement flights:flight)
	{
		System.out.println(flights.getAttribute("aria-label"));
	}
	String prices="From 5477 Indian rupees. Nonstop flight with IndiGo. Leaves Rajiv Gandhi International Airport at 5:40 AM on Wednesday, August 21 and arrives at Biju Patnaik International Airport at 7:25 AM on Wednesday, August 21. Total duration 1 hr 45 min.  Select flight";
 
     driver.close();

	}

}
