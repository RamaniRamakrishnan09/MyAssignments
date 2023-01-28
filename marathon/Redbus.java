package week2.marathon;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Redbus {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
ChromeDriver driver= new ChromeDriver();

driver.get("https://www.redbus.in/");

driver.manage().window().maximize();

driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));

driver.findElement(By.id("src")).sendKeys("Chennai");

driver.findElement(By.xpath("//li[@class='sub-city']/parent::ul")).click();

driver.findElement(By.id("dest")).sendKeys("Bangalore");

driver.findElement(By.xpath("//li[@class='sub-city']/i")).click();

//driver.findElement(By.xpath("//label[text()='Date']/parent::div")).click();

driver.findElement(By.xpath("//td[@class='we day']")).click();

driver.findElement(By.xpath("//button[@class='fl button']")).click();

String title = driver.findElement(By.xpath("//span[@class='f-bold busFound']")).getText();

System.out.println(title + " found");

driver.findElement(By.xpath("//label[text()='SLEEPER']/preceding-sibling::label")).click();

String name = driver.findElement(By.xpath("(//div[@class='travels lh-24 f-bold d-color'])[2]")).getText();

System.out.println(name);

driver.findElement(By.xpath("(//div[@class='button view-seats fr'])[1]")).click();

String seats = driver.findElement(By.xpath("(//div[@class='seat-left m-top-30'])[1]")).getText();

System.out.println(seats);


	}

}
