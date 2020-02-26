package automationFramework;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class SeleniumTestCase {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "C:\\Programs\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();

		driver.get("http://www.google.com");
		boolean verifyTextPositive = driver.getPageSource().contains("Gmail");
		boolean verifyTextNegative = driver.getPageSource().contains("WrongText");

		if(verifyTextPositive == true) {
			System.out.println("Succesfully opened the website www.google.com");
		} else {
			System.out.println("Something went wrong");
		}

		if(verifyTextNegative == false) {
			System.out.println("Negative scenario went fine");
		} else {
			System.out.println("Something went wrong");
		}

		//Wait for 5 sec
		try {
			Thread.sleep(5000);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}

		//Close the driver
		driver.quit();
	}
}