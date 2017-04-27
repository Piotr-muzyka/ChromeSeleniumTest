package simpleTest;

import org.junit.Test;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.junit.Assert; 

import java.io.File;
import java.io.IOException;
import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;

public class firstTest {

	@Test
	public void startWebDriver()
	{
	// Open Chrome
	System.setProperty("webdriver.chrome.driver", "chrome/chromedriver.exe");

		WebDriver driver=new ChromeDriver();

	// Maximize the window
	driver.manage().window().maximize();

	// Pass the url
	driver.get("http://www.google.com");

	// Take screenshot and store as a file format
	File src= ((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
	try{
	// now copy the  screenshot to desired location using copyFile //method
	FileUtils.copyFile(src, new File("screenshot/screenshot.png"));
	}
	catch(IOException e)
	{
	System.out.println(e.getMessage());
	}
	driver.close();
	
	}
}
