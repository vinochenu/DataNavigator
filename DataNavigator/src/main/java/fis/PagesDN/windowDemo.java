package fis.PagesDN;

import java.util.ArrayList;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class windowDemo {
	
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		System.setProperty("webdriver.chrome.driver","C:\\vinoth\\Software\\Browser Drivers\\Chrome Driver v83\\chromedriver.exe" );
		WebDriver driver=new ChromeDriver();
		
		driver.get("https://www.google.com/");
		String homepage=driver.getWindowHandle();
		
		JavascriptExecutor executor1=(JavascriptExecutor) driver;
		executor1.executeScript("window.open()");
		
		
		
		ArrayList<String> tabs = new ArrayList<String>(driver.getWindowHandles());
		driver.switchTo().window(tabs.get(1));
		driver.get("https://www.w3schools.com/");
		
		driver.close();
		driver.switchTo().window(homepage);
		
		driver.findElement(By.name("q")).sendKeys("fis"+Keys.ENTER);
		driver.close();
		
	}

}
