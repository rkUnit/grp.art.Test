package grp.art.Test;

	import org.openqa.selenium.By;
	import org.openqa.selenium.WebDriver;
	import org.openqa.selenium.WebElement;
	import org.openqa.selenium.chrome.ChromeDriver;
	import org.openqa.selenium.chrome.ChromeOptions;

	import java.util.List;

	public class Flight {

	    public static void main(String[] args)throws InterruptedException {
	        // Set the path to your WebDriver executable
	        // Set up Chrome options
//	        ChromeOptions options = new ChromeOptions();
//	        options.addArguments("--headless"); // Run Chrome in headless mode (optional)
	        WebDriver driver = new ChromeDriver();

	        try {
	            // Step 1: Go to makemytrip.com
	            driver.get("https://www.makemytrip.com");
                Thread.sleep(1000);  
	            driver.findElement(By.xpath("//*[@data-cy='closeModal']")).click();
	            // Step 2: Click on flight search (assuming flight search is visible and clickable)
	            WebElement flightSearchButton=driver.findElement(By.xpath("//a[contains(text(),'Search')]"));
	            flightSearchButton.click();
	            driver.navigate().refresh();
	            System.out.println(driver.getTitle());
	                                  Thread.sleep(1000);                                                      
	            List<WebElement> flightElements = driver.findElements(By.xpath("//*[@class='makeFlex spaceBetween ']"));
	            // Step 4: Filter and print Indigo flight details
	            for (WebElement flight : flightElements) {
	                String airlineName = flight.findElement(By.xpath("//*[@class='boldFont blackText airlineName']")).getText();
	                if (airlineName.contains("Indigo")) {
	                    // Print details of the Indigo flight
	                    String flightDetails = flight.getText();
	                    System.out.println("Indigo Flight Details: " + flightDetails);
	                }
	            }

	        } finally {
	            // Step 5: Close the browser
	            driver.quit();
	        }
	    }
	}
