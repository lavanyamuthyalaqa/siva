package sivakumariSelenium4;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class handlingmulitiplyWindows {

	public static void main(String[] args) {

		System.setProperty("webdriver.chrome.driver", "F:\\newDrivers\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		
		driver.get("https://www.naukri.com/");

	}

}
