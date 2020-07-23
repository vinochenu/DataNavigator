package fis.DataNavigator;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.net.MalformedURLException;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.Properties;
import java.util.Set;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.Cookie;
import org.openqa.selenium.Keys;
import org.openqa.selenium.PageLoadStrategy;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.firefox.GeckoDriverService;
import org.openqa.selenium.ie.InternetExplorerDriver;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.support.ui.Select;

public class DriverInstance {

	public static WebDriver driver;
	public static ChromeOptions options;


	public static void getdriver() throws IOException, InterruptedException {

		try {

			FileInputStream fileInputStream=new FileInputStream("configDN.properties");
			Properties properties=new Properties();
			properties.load(fileInputStream);

			String browser=properties.getProperty("Browser");
			String chromedriverlocation=properties.getProperty("ChromeDriverLocation");
			String iedriverlocation=properties.getProperty("IEDriverLocation");
			String geckodriverlocation=properties.getProperty("GeckoDriverLocation");
			String appurl=properties.getProperty("ApplicationUrl");
			if(browser.equalsIgnoreCase("chrome")) 
			{
				System.setProperty("webdriver.chrome.driver",chromedriverlocation );
				options = new ChromeOptions();
				options.setPageLoadStrategy(PageLoadStrategy.EAGER);
				
				options.addArguments("disable-infobars");
		        options.addArguments("start-maximized");
		        options.addArguments("--disable-features=NetworkService");
		        options.addArguments("--disable-gpu");
		        options.addArguments("--dns-prefetch-disable");
		        options.addArguments("--disable-dev-shm-usage");
		        options.addArguments("--no-sandbox");
		        options.addArguments("--incognito");
				driver = new ChromeDriver(options);
				TimeUnit.SECONDS.sleep(1);
			

				//System.setProperty("webdriver.chrome.silentOutput","true" );
				
				
				/*options = new ChromeOptions();
				options.setPageLoadStrategy(PageLoadStrategy.EAGER);
				options.addArguments("disable-infobars");
		        options.addArguments("start-maximized");
		        //options.addArguments("--incognito");
		        options.addArguments("--disable-features=NetworkService");
		        options.addArguments("--disable-gpu");
			    //driver = new ChromeDriver(options);
			    
			    DesiredCapabilities capabilities = DesiredCapabilities.chrome();
			    capabilities.setCapability(ChromeOptions.CAPABILITY, options);
			    driver=new ChromeDriver(capabilities);*/

				System.out.println("before delete cookies are : ");
				System.out.println(driver.manage().getCookies());

				driver.manage().deleteAllCookies();
				Thread.sleep(8000);
				
				driver.get("chrome://settings/clearBrowserData");
				driver.findElement(By.xpath("//settings-ui")).sendKeys(Keys.ENTER);

		
				
				Set<Cookie>cookies=driver.manage().getCookies();
				for (Cookie cookie : cookies) {
					System.out.println("after delete cookies are : "+cookie);
				}
				

				


				//options.addArguments("--always-authorize-plugins");
				//options.addArguments("load-extension=C:/Users/hemanand.rajamani/AppData/Local/Google/Chrome/User Data/Default/Extensions/mlomiejdfkolichcflejclcbmpeaniij/7.1.0.49_0");
				// options.addArguments("user-data-dir=C:/Users/hemanand.rajamani/AppData/Local/Google/Chrome/User Data/Default");
				// capabilitiesChrome.setCapability(ChromeOptions.CAPABILITY,options);

				//options.setPageLoadStrategy(PageLoadStrategy.EAGER);
				//options.addArguments("--disable-extensions");

				//options.addArguments("enable-automation"); // https://stackoverflow.com/a/43840128/1689770
				//options.addArguments("--headless"); // only if you are ACTUALLY running headless
				//options.addArguments("--no-sandbox"); //https://stackoverflow.com/a/50725918/1689770
				//options.addArguments("--disable-infobars"); //https://stackoverflow.com/a/43840128/1689770
				//options.addArguments("start-maximized"); // https://stackoverflow.com/a/26283818/1689770
				//options.addArguments("--disable-dev-shm-usage"); //https://stackoverflow.com/a/50725918/1689770
				//options.addArguments("--disable-browser-side-navigation"); //https://stackoverflow.com/a/49123152/1689770
				//options.addArguments("--disable-gpu"); //https://stackoverflow.com/questions/51959986/how-to-solve-selenium-chromedriver-timed-out-receiving-message-from-renderer-exc
				//options.addArguments("--dns-prefetch-disable");
				//options.addArguments("--timeout");
				//options.addArguments("--user-response-timeout");
				//options.addArguments("enable-features=NetworkServiceInProcess");
				//options.addArguments("--disable-features=NetworkService");


				/* options.addArguments("disable-infobars");
			        options.addArguments("start-maximized");
				driver = new ChromeDriver(options);

				driver.get("chrome://settings/clearBrowserData");

		        Thread.sleep(5000);
		        driver.switchTo().activeElement();
		        Thread.sleep(8000);

		        driver.findElement(By.cssSelector("* /deep/ #clearBrowsingDataConfirm")).click();
		        Thread.sleep(5000);*/


				/* DesiredCapabilities cap = DesiredCapabilities.chrome();
		        cap.setCapability("applicationCacheEnabled", false);
		        driver = new ChromeDriver(cap);*/

			}
			else	
				
			{
				System.setProperty("webdriver.gecko.driver",geckodriverlocation );
				driver = new FirefoxDriver();
				
				driver.manage().deleteAllCookies();
				Thread.sleep(7000);
				
				
			}



		}
		catch(IOException io)
		{

			io.printStackTrace();
			System.err.println("IOException is"+io.getMessage());

		}


	}

}
