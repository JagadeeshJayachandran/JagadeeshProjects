package TestAutoIt;

import java.io.IOException;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class TestAutoIt {

	public static void main(String[] args) throws InterruptedException, IOException {
		// TODO Auto-generated method stub

		System.setProperty("webdriver.chrome.driver",
				"C:\\Users\\p43661jj\\Downloads\\Selenium files\\chromedriver.exe");

		WebDriver driver = new ChromeDriver();

		driver.manage().window().maximize();

		driver.get("https://smallpdf.com/pdf-to-jpg");

		driver.findElement(By.xpath("//div[@class='l0v3m7-6 ktrls']")).click();
		;
		Thread.sleep(3000);
		Runtime.getRuntime().exec("C:\\Users\\p43661jj\\Documents\\fileUpload.exe");

	}

}
