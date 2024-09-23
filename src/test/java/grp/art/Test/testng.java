package grp.art.Test;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class testng {
	WebDriver driver;
	@BeforeMethod
	public void setup()
	{
		driver=new ChromeDriver();
		driver.get("https://google.photo.com/");
		driver.manage().window().maximize();
	}
	@Test
	public void title() {
		System.out.println(driver.getTitle());

	}
	@AfterMethod
	public void teardown()
	{
		driver.quit();
	}

}
