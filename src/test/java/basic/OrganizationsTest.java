package basic;

import java.io.IOException;
import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

import commonUtils.PropertyFileUtil;
import commonUtils.WebDriverUtil;

public class OrganizationsTest {

				
		@Test
		public void organizationTest() throws IOException, InterruptedException {
			
			WebDriver d = new ChromeDriver();
			d.manage().window().maximize();
			d.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
			d.get("http://localhost:8888/");
			d.findElement(By.name("user_name")).sendKeys("admin");
			d.findElement(By.name("user_password")).sendKeys("admin");
			d.findElement(By.id("submitButton")).click();
			
//			//To maximize the window
//			wutil.maximize(d);
//			
//			//To apply wait for findElement method
//			wutil.implicitwait(d);
//			
//			//TO READ THE DATA FROM PROPERTY FILE
//			String url = putil.getDataFrompropertyFile("Url");
//			String username = putil.getDataFrompropertyFile("Username");
//			String pass = putil.getDataFrompropertyFile("Password");
			
		
	}
}
