package selenium;


import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class flightbookingOrbitz {

	public static void main(String[] args) {

		// TODO Auto-generated method stub
				System.setProperty("webdriver.chrome.driver", "F:\\newDrivers\\chromedriver.exe");
				 WebDriver driver = new ChromeDriver();
				 driver.manage().window().maximize();
				driver.manage().deleteAllCookies();
				driver.manage().timeouts().implicitlyWait(50, TimeUnit.SECONDS);
				driver.manage().timeouts().pageLoadTimeout(50, TimeUnit.SECONDS);

				driver.get("https://www.orbitz.com/");
				//Flight Element Click
				driver.findElement(By.id("tab-flight-tab-hp")).click();
				//One Way Element Click
				driver.findElement(By.xpath("//label[@id='flight-type-one-way-label-hp-flight']")).click();
				//Flying From
				WebElement from=driver.findElement(By.xpath("//input[@id='flight-origin-hp-flight']"));
				from.sendKeys("MAA");
				from.sendKeys(Keys.ARROW_DOWN);
				from.sendKeys(Keys.ENTER);
				//Flying to


				WebElement wel1=driver.findElement(By.xpath("//input[@id='flight-destination-hp-flight']"));
				wel1.clear();
				wel1.sendKeys("BOM");
				wel1.sendKeys(Keys.ARROW_DOWN);
				wel1.sendKeys(Keys.ENTER);
				//DatePicker
				driver.findElement(By.xpath("//input[@id='flight-departing-single-hp-flight']")).click();
				//driver.findElement(By.xpath("//div[3][@class='datepicker-cal-month']//td//button[@data-day='21']")).click();
				
				List<WebElement> allDates=driver.findElements(By.xpath("//div[3][@class='datepicker-cal-month']//td"));
				for(WebElement ele:allDates){
					//System.out.println(ele.getText());
					String date=ele.getText();
					if(date.equalsIgnoreCase("21") && date.contains("March") ){
						ele.click();
						break;
					}
					
				}
			/*	WebElement date=driver.findElement(By.id("flight-departing-single-hp-flight"));
				String dateval= "02/15/2020";
				
				js.executeScript("arguments[0].setAttribute('value', '"+dateval+"')", date);
				WebElement submit=driver.findElement(By.xpath("//button[@id='search-button-hp-package']"));
			js.executeScript("arguments[0].click();", submit);*/
			
				
			
	}

}
