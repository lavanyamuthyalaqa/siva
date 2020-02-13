package selenium;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Dropdownwithoutselect {
	
	static WebDriver driver;

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		System.setProperty("webdriver.chrome.driver", "F:\\newDrivers\\chromedriver.exe");
		 driver = new ChromeDriver();
		 driver.manage().window().maximize();
		driver.manage().deleteAllCookies();
		driver.manage().timeouts().implicitlyWait(50, TimeUnit.SECONDS);
		driver.manage().timeouts().pageLoadTimeout(50, TimeUnit.SECONDS);

		driver.get("https://www.facebook.com");
		
		/*List<WebElement> month=driver.findElements(By.xpath("//select[@name='birthday_month']//option"));
		
		System.out.println(month.size());
		
		for(int i=0;i<month.size();i++){
			//System.out.println(month.get(i).getText());
			
			if(month.get(i).getText().equals("Jun")){
				month.get(i).click();
				break;
			}
		}*/
		
		selectDropDown("//select[@name='birthday_day']//option","23");
		selectDropDown("//select[@name='birthday_month']//option","Apr");

		selectDropDown("//select[@name='birthday_year']//option","2018");


	}
	
	public static void selectDropDown(String xpathvalue,String value){
		
    List<WebElement> month=driver.findElements(By.xpath(xpathvalue));
		
		System.out.println(month.size());
		
		for(int i=0;i<month.size();i++){
			//System.out.println(month.get(i).getText());
			
			if(month.get(i).getText().equals(value)){
				month.get(i).click();
				break;
			}
		}
		
	}

}
