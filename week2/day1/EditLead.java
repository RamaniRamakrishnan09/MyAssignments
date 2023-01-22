package week2.day1;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class EditLead {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
ChromeDriver driver = new ChromeDriver();
		
		driver.get("http://leaftaps.com/opentaps/control/main");
		
		driver.manage().window().maximize();
		
		//Enter username
		WebElement eleUserName = driver.findElement(By.id("username"));
		eleUserName.sendKeys("DemoSalesManager");
		
		driver.findElement(By.id("password")).sendKeys("crmsfa");
		
		driver.findElement(By.className("decorativeSubmit")).click();
		
		driver.findElement(By.linkText("CRM/SFA")).click();
		
		driver.findElement(By.linkText("Leads")).click();
		
		driver.findElement(By.linkText("Create Lead")).click();
		
		driver.findElement(By.id("createLeadForm_companyName")).sendKeys("TestLeaf");
		
		driver.findElement(By.id("createLeadForm_firstName")).sendKeys("Ramani");
		
		driver.findElement(By.id("createLeadForm_lastName")).sendKeys("Ramakrishnan");
		
		driver.findElement(By.id("createLeadForm_firstNameLocal")).sendKeys("Ramlu");
		
		driver.findElement(By.id("createLeadForm_departmentName")).sendKeys("Computer science");
		
		driver.findElement(By.id("createLeadForm_description")).sendKeys("Engineering");
		
		driver.findElement(By.id("createLeadForm_primaryEmail")).sendKeys("ramanicse2013@gmail.com");
		
		driver.findElement(By.name("submitButton")).click();
		
		driver.findElement(By.linkText("Edit")).click();
		
		driver.findElement(By.id("updateLeadForm_description")).clear();
		
		driver.findElement(By.id("updateLeadForm_importantNote")).sendKeys("Test");
		
		driver.findElement(By.className("smallSubmit")).click();
		
		System.out.println(driver.getTitle());

		if(driver.getTitle().contains("View")) {
			
			System.out.println("I confirm the title has View");
		}
		else
			System.out.println("Title has no word called View");
		
		driver.close();
		
	}

}
