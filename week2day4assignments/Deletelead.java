package week2day4assignments;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Deletelead {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
	ChromeDriver driver=new ChromeDriver();
	driver.get("http://leaftaps.com/opentaps/control/login");
	WebElement username=driver.findElement(By.id("username"));
	username.sendKeys("demosalesmanager");
	driver.findElement(By.id("password")).sendKeys("crmsfa");
	driver.findElement(By.className("decorativeSubmit")).click();
	driver.findElement(By.linkText("CRM/SFA")).click();
	driver.findElement(By.linkText("Leads")).click();
	driver.findElement(By.linkText("Find Leads")).click();
	driver.findElement(By.linkText("Phone")).click();
	driver.findElement(By.xpath("//input[@name='phoneNumber']")).sendKeys("9500912420");
	driver.findElement(By.xpath("//input[@name='phoneAreaCode']")).sendKeys("012");
	driver.findElement(By.xpath("//a[text()='Find Leads']")).click();
	//driver.findElement(By.linkText("Find Leads")).click();
	driver.findElement(By.xpath("//a[text()='10153']")).click();
	driver.findElement(By.linkText("Delete")).click();
	driver.findElement(By.linkText("Find Leads")).click();
	driver.findElement(By.xpath("//input[@name='id']")).sendKeys("10153");
	driver.findElement(By.xpath("//button[text()='Find Leads']")).click();
	driver.close();
	
	
}
}