import java.util.List;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.Cookie;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.interactions.Actions;
import org.testng.ITestResult;

import io.github.bonigarcia.wdm.WebDriverManager;
import static org.openqa.selenium.support.locators.RelativeLocator.with;

public class Day1 {

	static WebDriver driver;

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		String xpath_current_pop = "//div[@class='maincounter-number']/span[@class='rts-counter']";
		String xpath_today_pop = "//div[text()='Today']//parent::div//span[@class=\"rts-counter\"]";
		String xpath_thisYear_pop = "//div[text()='This year']//parent::div//span[@class='rts-counter']";
		String xpath_today_thisYear_pop = "//div[text()='This year' or text()='Today']//parent::div//span[@class='rts-counter']";

		WebDriverManager.chromedriver().setup();
		ChromeOptions co = new ChromeOptions();
		co.addArguments(("--incognito"));

		driver = new ChromeDriver(co);

		driver.manage().window().maximize();
		

		driver.get("https://www.worldometers.info/world-population/");
		driver.getWindowHandle();
		driver.getWindowHandles();
		Actions action = new Actions(driver);
		WebElement passwordField = driver.findElement(By.id("password"));
		ITestResult testResult;
		System.setProperty("webdriver.crome.logFil", value)
		ITestResult.FAILURE== testResult.getStatus();		
		WebElement passwordField = driver.findElement(By.id("password"));
		WebElement emailAddressField = driver.findElement(with(By.tagName("input"))
		.above(passwordField));
		
		System.out.println("1");
		System.out.println("2");
		
<<<<<<< HEAD
		System.out.println("master1");
		System.out.println("master2");
=======
		System.out.println("develop 1");
		
		System.out.println("develop 2");
>>>>>>> develop
		

//		int count = 1;
//		while (count <= 20) {
//			System.out.println(count + "sec");
//			if (count == 21)
//				break;
//			System.out.println("-----------------Current population count-----------------");
//			printPopulationData(xpath_current_pop);
//			System.out.println("-----------------Today and This Year population count-----------------");
//			printPopulationData(xpath_today_thisYear_pop);
//			System.out.println("======================================================================");
//
//			Thread.sleep(1000);
//			count++;

		}

	

	public static void printPopulationData(String locator) throws InterruptedException {
		// TODO Auto-generated method stub

		List<WebElement> popList = driver.findElements(By.xpath(locator));
		for (WebElement e : popList) {
			System.out.println(e.getText());
		}

	}

}
