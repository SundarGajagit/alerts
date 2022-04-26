package org.alerts;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Alerts {
public static void main(String[] args) {
	System.setProperty("webdriver.chrome.driver", "C:\\Users\\Dell\\eclipse-workspace\\Alerts\\driver\\chromedriver.exe");
	WebDriver driver=new ChromeDriver();
	driver.get("http://demo.automationtesting.in/Alerts.html");
	driver.manage().window().maximize();
	WebElement btnClick1 = driver.findElement(By.xpath("//button[contains(@class,'btn btn-danger')]"));
	btnClick1.click();
	Alert a1 = driver.switchTo().alert();
	a1.accept();
	WebElement btnLoginOkCancel= driver.findElement(By.xpath("//a[text()='Alert with OK & Cancel ']"));
	btnLoginOkCancel.click();
	WebElement btnClick2 = driver.findElement(By.xpath("//button[contains(@class,'btn btn-primary')]"));
	btnClick2.click();
	Alert a2=driver.switchTo().alert();
	a2.accept();
	WebElement btnLoginOkWithText= driver.findElement(By.xpath("//a[text()='Alert with Textbox ']"));
	btnLoginOkWithText.click();
	WebElement btnClick3 = driver.findElement(By.xpath("//button[contains(@class,'btn btn-info')]"));
	btnClick3.click();
	Alert a3 = driver.switchTo().alert();
	a3.sendKeys("Sundar Gaja");
	a3.accept();
	
	
}
}
