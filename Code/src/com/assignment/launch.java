package com.assignment;

//import java.util.ArrayList;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
//import org.openqa.selenium.interactions.Actions;


public class launch
{
	public static WebDriver driver = null;
	public static void main(String [] args) throws InterruptedException
	{
		System.setProperty("webdriver.chrome.driver","C:\\Users\\adity\\eclipse-workspace\\chromedriver\\chromedriver.exe");
		driver = new ChromeDriver ();
		driver.manage().timeouts().implicitlyWait(15,TimeUnit.MILLISECONDS);
		
		//open the web app
		driver.navigate().to("https://amazon.co.uk");
		driver.manage().window().maximize();
		String title = driver.getTitle();
		
		if(title.equalsIgnoreCase("Amazon.co.uk"))
			System.out.println("Title matches");
		else
			System.out.println(title);
		
		//Typing the text
		WebElement myElement = driver.findElement(By.id("twotabsearchtextbox"));
		myElement.sendKeys("Stephen King");
		
		driver.findElement(By.className("nav-input")).click();
		Thread.sleep(2000);
		
		//select the book
		driver.findElement(By.partialLinkText("Stand")).click();
		Thread.sleep(2000);
		
		
		driver.findElement(By.cssSelector("#a-autoid-8-announce")).click();
		Thread.sleep(2000);
		//add to cart
		driver.findElement(By.cssSelector("#add-to-cart-button-ubb")).click();
		Thread.sleep(5000);
		
		//scroll the web page till end
		JavascriptExecutor js = (JavascriptExecutor) driver;
		js.executeScript("window.scrollTo(0, document.body.scrollheight)");
		Thread.sleep(3000);
		
		//Frames
		driver.get("http://demo.automationtesting.in/Frames.html");
		WebElement frame= driver.findElement(By.xpath("//iframe[@src='SingleFrame.html']"));
		driver.switchTo().frame(frame);
		Thread.sleep(2000);
		
		WebElement textbox=driver.findElement(By.xpath("//input[@type='text']"));
		textbox.sendKeys("HEY");
		Thread.sleep(3000);
		
		driver.close();
		driver.quit();
		
		
	}
}
