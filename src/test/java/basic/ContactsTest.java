package basic;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class ContactsTest {

	@Test
	public void createOrganizationsTest() {
		
		WebDriver d = new ChromeDriver();
		
		d.get("https://www.ajio.com/");
	}
}
