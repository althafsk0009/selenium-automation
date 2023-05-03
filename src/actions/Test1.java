package actions;

import org.openqa.selenium.WebDriver;

public class Test1 {

	public static void main(String[] args) {
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.amazon.com/");
		driver.manage().timeouts().implicitlyWait(duration.ofseconds(10));
		
		

	}

}
