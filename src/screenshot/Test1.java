package screenshot;

import java.io.File;
import java.time.Duration;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Test1 {

	public static void main(String[] args) {
		
		WebDriver driver = new ChromeDriver();
		 driver.manage().window().maximize();
		 driver.get("https://www.amazon.in/");
		 driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		
		 //Step:1 Typecasting
		 TakesScreenshot ts= (TakesScreenshot) driver;
		 
		 //Step:2 we can access the methos and photo will be stored in RAM 
		 ts.getScreenshotAs(OutputType.FILE);
		 
		 //Step:3 specify the location where photo should be stored
		 File dest=new File("./amazon.png");
				 
		 
		//step:4 copy paste from RAM to your location
	      FileUtils.copyFile(src, dest)
		 driver.close();
		 
		

	}

}
