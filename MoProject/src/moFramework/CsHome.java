package moFramework;


import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class CsHome {
	
	@Test
	public static void CsWww() {

		String exePath = "C:\\Users\\mohammed.shahriar\\Desktop\\Tools\\chromedriver\\chromedriver.exe";
		System.setProperty("webdriver.chrome.driver", exePath);
		WebDriver chromeBrowser = new ChromeDriver();
		chromeBrowser.get("http://www.clicksafety.com");
		try {
			Thread.sleep(5000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		WebElement loginButton = chromeBrowser.findElement(By.id("btnLoginLink"));
		if (loginButton.isDisplayed()) {
			loginButton.click();
			System.out.println("This CS homepage is up and running");
		}
		try {
			Thread.sleep(5000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		chromeBrowser.quit();
	}
	
	@Test
	public static void CsLogin() {

		String exePath = "C:\\Users\\mohammed.shahriar\\Desktop\\Tools\\chromedriver\\chromedriver.exe";
		System.setProperty("webdriver.chrome.driver", exePath);
		WebDriver chromeBrowser = new ChromeDriver();
		chromeBrowser.get("http://www.clicksafety.com");
		try {
			Thread.sleep(5000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		WebElement loginButton = chromeBrowser.findElement(By.id("btnLoginLink"));
		if (loginButton.isDisplayed()) {
			loginButton.click();
			System.out.println("This CS homepage is up and running");
		}
		try {
			Thread.sleep(5000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		chromeBrowser.findElement(By.id("username")).sendKeys("qaitest1");
		chromeBrowser.findElement(By.id("password")).sendKeys("1234");
		chromeBrowser.findElement(By.id("login-submit")).click();
		System.out.println("CS login is working");
		chromeBrowser.quit();
		
		try {
			Thread.sleep(5000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}


}
