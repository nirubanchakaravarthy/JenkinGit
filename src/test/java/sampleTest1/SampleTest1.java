package sampleTest1;

import java.io.File;
import java.io.IOException;

import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.io.FileHandler;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class SampleTest1 {
	
	@Test
	public void loginTest() throws IOException{
		WebDriverManager.chromedriver().setup();
		WebDriver wd= new ChromeDriver();
		wd.manage().window().maximize();
		wd.get("https://www.google.com/");
		
		// interfaces == webdriver, takescreenshot , outputType/
		
File src= ((TakesScreenshot)wd).getScreenshotAs(OutputType.FILE);
		
		FileHandler.copy(src, new File("C:\\seleniumWorkspace\\JenkinsGitTest\\ScreenShot\\Google.JPG"));

	}

}
