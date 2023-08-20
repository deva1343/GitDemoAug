package cromeDriverPKG;

import org.openqa.selenium.By;
import org.openqa.selenium.By.ByClassName;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class InvokCromeBrowser {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//System.setProperty("webdriver.chrome.driver", "C:\\Users\\erdev\\Downloads\\CromeDriver\\cromedriver.exe")
		//WebDriver driver = new  ChromeDriver();
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\erdev\\Downloads\\CromeDriver\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.moneycontrol.com/");
		//driver.findElement(By.id("search_str")).sendKeys("Jubilant Foodworks Ltd");
		driver.findElement(By.cssSelector("a[title='Top Gainers']")).click();
		

	}

}
