package vasudeva;

import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.Test;

public class AppTest 
{
	@Test
	public void sample()
	{
		FirefoxDriver driver=new FirefoxDriver();
		driver.get("Http://gmail.com");
		driver.manage().window().maximize();
		
	}
}
