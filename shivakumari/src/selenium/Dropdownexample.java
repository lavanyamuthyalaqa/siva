package selenium;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Dropdownexample {
	static WebDriver driver;

	public static void main(String[] args) {

		System.setProperty("webdriver.chrome.driver", "F:\\newDrivers\\chromedriver.exe");
		 driver = new ChromeDriver();
		 driver.manage().window().maximize();
		driver.manage().deleteAllCookies();
		driver.manage().timeouts().implicitlyWait(50, TimeUnit.SECONDS);
		driver.manage().timeouts().pageLoadTimeout(50, TimeUnit.SECONDS);

		driver.get("https://www.facebook.com");
		
	
		
		WebElement day=driver.findElement(By.xpath("//select[@name='birthday_day']"));
		
		WebElement month=driver.findElement(By.xpath("//select[@name='birthday_month']"));
		
		WebElement year=driver.findElement(By.xpath("//select[@name='birthday_year']"));
		
		/*selectvaluefromdropdown(day,"12");
		selectvaluefromdropdown(month,"Jun");
		selectvaluefromdropdown(year,"2019");*/
		
		String dob="23-May-2019";
		String dobArr[]=dob.split("-");
		
		selectvaluefromdropdown(day,dobArr[0]);
		selectvaluefromdropdown(month,dobArr[1]);
		selectvaluefromdropdown(year,dobArr[2]);
		
		
		
		}
	
	public static void selectvaluefromdropdown(WebElement element,String value){
		
		Select drop=new Select(element);
		drop.selectByVisibleText(value);
		
	}
	
}
