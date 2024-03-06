package iframe;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class iframe1 {
	
	
	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver","C:\\Users\\amol\\Downloads\\chromedriver-win64 (4)\\chromedriver-win64\\chromedriver.exe" );
		WebDriver driver =new ChromeDriver();
	driver.manage().window().maximize();
	driver.get("https://ui.vision/demo/webtest/frames/");
	driver.switchTo().frame(1);// by id 
	driver.findElement(By.xpath("//input[@name=\"mytext2\"]")).sendKeys("Amol");
//	driver.switchTo().frame("iframe1");
//	driver.findElement(By.xpath("//input[@name=\"mytext1\"]")).sendKeys("Amol");
	
	

}
}
