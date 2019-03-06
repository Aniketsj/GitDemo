package MavenDemo1.MavenDemo;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class login {
	
	WebDriver dr=new ChromeDriver();
	
	@Test
	public void setup()
	{
		System.setProperty("webdriver.chrome.driver", "F:\\Selenium course\\Browser driver\\chromedriver.exe");
		dr.manage().window().maximize();
		dr.get("https://www.google.com");
		dr.navigate().to("https://www.facebook.com/");
		System.out.println("This is updated");
		System.out.println("This is updated 1");
		dr.navigate().back();
		
		dr.navigate().forward();
	}

}
