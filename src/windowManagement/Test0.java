package windowManagement;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Test0 {
	public static void main(String[] args) throws InterruptedException {
		
	
   WebDriver driver=new ChromeDriver();
	driver.manage().window().maximize();
	driver.get("https://www.skillrary.com/");
	
	Thread.sleep(5000);
	driver.manage().window().fullscreen();
	
	Thread.sleep(5000);
	driver.manage().window().minimize();
	
}
}

