package Autosuggestions;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Program0 {

	public static void main(String[] args) {
	 WebDriver driver=new ChromeDriver();
	 driver.manage().window().maximize();
	 driver.get("https://www.google.com/");
	 driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
	 
	 WebElement ele =driver.findElement(By.name("q"));
	 ele.sendKeys("seleni");
	 
	 Thread.sleep(3000);
	 
	 List<webElement> ele1 = driver.findElement(By.xpath(null))
	 
	 
	 

	}

}
