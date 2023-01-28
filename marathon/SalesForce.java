package week2.marathon;

import org.openqa.selenium.chrome.ChromeDriver;

public class SalesForce {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		ChromeDriver driver= new ChromeDriver();

		driver.get("https://www.redbus.in/");

		driver.manage().window().maximize();
	}

}
