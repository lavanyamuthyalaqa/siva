package sivakumariSelenium4;

import java.util.ArrayList;
import java.util.List;
import java.util.Set;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WindowType;
import org.openqa.selenium.chrome.ChromeDriver;

public class openNewTab {

	public static void main(String[] args) {

		System.setProperty("webdriver.chrome.driver", "F:\\newDrivers\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		
		driver.get("http://www.gmail.com");
		System.out.println(driver.getTitle());
		
		driver.switchTo().newWindow(WindowType.WINDOW);//to oepn new tab
		System.out.println("After switch to new tab:"+driver.getTitle());
		
		Set<String> handles=driver.getWindowHandles();
		
		List<String> ls=new ArrayList<String>(handles);
		String parentWindow=ls.get(0);
		String childWindow=ls.get(1);
		
		
		driver.get("http://www.w3schools.com");
		System.out.println("After switch to new tab:"+driver.getTitle());
		
		driver.close();
		driver.switchTo().window(parentWindow);
		System.out.println("parent window title:"+driver.getTitle());

	}

}
