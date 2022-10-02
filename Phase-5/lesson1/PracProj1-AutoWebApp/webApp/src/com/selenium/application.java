package com.selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class application {
	public static void main(String[] args) throws InterruptedException {
// TODO Auto-generated method stub
		WebDriver webdriver = null;
		System.setProperty("webdriver.chrome.driver", "C:\\tools\\webdriver\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();

		driver.manage().window().maximize();

		driver.get("https://www.amazon.com/");

		WebElement e1 = driver.findElement(By.xpath("//*[@class='nav-line-2 ']"));

		Actions a = new Actions(driver);

		a.moveToElement(e1).perform();
		driver.findElement(By.xpath("(//span[@class='nav-text'])[10]")).click();
		Thread.sleep(5000);
		driver.findElement(By.id("ap_email")).sendKeys("test@mail.com");
		Thread.sleep(5000);
		driver.findElement(By.id("ap_password")).sendKeys("password");
		Thread.sleep(5000);
		driver.findElement(By.id("signInSubmit")).click();
		Thread.sleep(5000);
		driver.findElement(By.xpath("//a[contains(text(),'Create a new Amazon account')]")).click();
		Thread.sleep(5000);

		driver.findElement(By.xpath("(//input[@type='text'])")).sendKeys("K V Sagar");
		Thread.sleep(5000);

		driver.findElement(By.xpath("(//input[@type='email'])")).sendKeys("sagar@mail.com");
		Thread.sleep(5000);

		driver.findElement(By.xpath("(//input[@type='password'])")).sendKeys("password");
		Thread.sleep(5000);
		driver.findElement(By.xpath("(//input[@id='continue'])")).click();

	}
}