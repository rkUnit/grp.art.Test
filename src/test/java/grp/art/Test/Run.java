package grp.art.Test;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Run {

	public static void main(String[] args) throws InterruptedException {
WebDriver driver=new ChromeDriver();
driver.manage().window().maximize();
driver.get("https://www.amazon.in");
Thread.sleep(1000);
driver.getTitle();
System.out.println("Title is "+driver.getTitle());
WebElement Electronics=driver.findElement(By.xpath("//*[contains(text(),' Electronics ')]"));
Electronics.click();
Thread.sleep(1000);
List<WebElement> subnav=driver.findElements(By.xpath("(//*[@class='nav-a-content'])"));
for(int i=0;i<subnav.size();i++)
  {
	System.out.println(subnav.get(i).getText());
	
        }
driver.quit();
	}

}
