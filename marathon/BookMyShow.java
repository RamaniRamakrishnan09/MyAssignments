package week2.marathon;

import java.io.File;
import java.io.IOException;
import java.time.Duration;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class BookMyShow {

	public static void main(String[] args) throws IOException, InterruptedException {
		// TODO Auto-generated method stub

		
		ChromeDriver driver= new ChromeDriver();

		driver.get("https://in.bookmyshow.com/");

		driver.manage().window().maximize();
		
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));

		driver.findElement(By.xpath("//input[@placeholder='Search for your city']")).sendKeys("Hyderabad");
		
		driver.findElement(By.xpath("//span[@class='sc-dBaXSw gYlrLO']")).click();
		
		String currentUrl = driver.getCurrentUrl();
		
		System.out.println(currentUrl);
		
		boolean contains = currentUrl.contains("hyderabad");
		
		System.out.println(contains);
		
		driver.findElement(By.id("4")).click();
		
		driver.findElement(By.xpath("//a[@class='sc-DNdyV cjGOcX']")).click();
		
		driver.findElement(By.id("wzrk-cancel")).click();
		
		String theatre = driver.findElement(By.className("__venue-name")).getText();

		System.out.println(theatre);
		
		driver.findElement(By.className("venue-info-text")).click();
		
		boolean parking = driver.findElement(By.className("facility-text")).isDisplayed();
		
		System.out.println(parking);
		
		driver.findElement(By.xpath("//div[@class='cross-container']")).click();
		
		driver.findElement(By.xpath("//a[@class='showtime-pill']")).click();
	
		driver.findElement(By.id("btnPopupAccept")).click();
		
		driver.findElement(By.id("pop_1")).click();
		
		driver.findElement(By.id("proceed-Qty")).click();
		
		driver.findElement(By.xpath("(//a[@class='_available'])[1]")).click();
		
		driver.findElement(By.id("btmcntbook")).click();
		
		Thread.sleep(2000);
		
		String total = driver.findElement(By.xpath("//span[@class='__sub-total']")).getText();
		
		System.out.println(total);
	
		File source1=driver.getScreenshotAs(OutputType.FILE);
		
		File target1 =new File("./snaps/output.png");
		
		FileUtils.copyFile(source1, target1);
		
		
		
		

		
	}

}
