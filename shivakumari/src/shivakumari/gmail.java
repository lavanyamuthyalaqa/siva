package shivakumari;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class gmail {

	static WebDriver driver;
	public static void main(String[] args) {
		
		System.setProperty("webdriver.chrome.driver", "F:\\newDrivers\\chromedriver.exe");
		 driver = new ChromeDriver();
		 driver.manage().window().maximize();
		driver.manage().deleteAllCookies();
		driver.manage().timeouts().implicitlyWait(50, TimeUnit.SECONDS);
		driver.manage().timeouts().pageLoadTimeout(50, TimeUnit.SECONDS);

		driver.get("https://www.gmail.com");
		
		WebElement username=driver.findElement(By.xpath("//input[@type='email'][@id='identifierId']"));
		username.sendKeys("lavanya pattabhi madhu");
		
		//2.StringBUilder
		/*StringBuilder email=new StringBuilder().append("lav").append(" ").append("automation").append(" ").append("Qtp");
		username.sendKeys(email);
		
		//3.StringBuffer
		StringBuffer email1=new StringBuffer().append("sonu").append(" ").append("automation").append(" ").append("selenium");
		username.sendKeys(email1);
		
		String space="";
		String author="Pattabhi";
		
		username.sendKeys(email,space,email1,space,author);*/
		
		
	}

}
