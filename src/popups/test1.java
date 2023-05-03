package popups;

import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class test1 {

	public static void main(String[] args) {
		 
		 WebDriver driver=new ChromeDriver();
		  driver.manage().window().maximize();
		 driver.get("https://www.facebook.com/");
		 driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		 
		 driver.navigate().to("https://www.skillrary.com/");

	}

}
