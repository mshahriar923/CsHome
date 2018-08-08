package moFramework;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class CsHome {

	public static void main(String[] args) throws InterruptedException {

		String exePath = "C:\\Users\\mohammed.shahriar\\Desktop\\Tools\\chromedriver\\chromedriver.exe";
		System.setProperty("webdriver.chrome.driver", exePath);
		WebDriver chromeBrowser = new ChromeDriver();
		chromeBrowser.get("http://www.clicksafety.com");
		Thread.sleep(5000);
		WebElement loginButton = chromeBrowser.findElement(By.id("btnLoginLinks"));
		if (loginButton.isDisplayed()) {
			loginButton.click();
			System.out.println("This CS homepage is up and running");
		}
		Thread.sleep(5000);
		chromeBrowser.quit();
	}

}
