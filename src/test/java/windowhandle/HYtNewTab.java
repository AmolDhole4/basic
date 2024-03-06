package windowhandle;

import java.util.Set;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class HYtNewTab {
	
	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver","C:\\Users\\amol\\Downloads\\chromedriver-win64 (4)\\chromedriver-win64\\chromedriver.exe" );
		WebDriver driver =new ChromeDriver();
		driver.get("https://www.hyrtutorials.com/p/window-handles-practice.html");
		driver.manage().window().maximize();
		JavascriptExecutor js = (JavascriptExecutor) driver;
		js.executeScript("window.scrollBy(0,550)", "");

		
		driver.findElement(By.xpath("//button[@id=\"newTabBtn\"]")).click();
		String is=driver.getWindowHandle();
		System.out.println(is);
		Set<String> ids = driver.getWindowHandles();
		
		String [] ar=ids.toArray(new String [ids.size()]);
		System.out.println("+++++++++++++++++++++++++++++++++++++++++++++++");
		System.out.println(ar[0]);
		System.out.println("-----------------------------------------------------------");
		System.out.println(ar[1]);
		driver.switchTo().window(ar[1]);
		driver.findElement(By.xpath("//button[@id=\"alertBox\"]")).click();
	
	
	 Alert rv= driver.switchTo().alert();
	 rv.accept();
		//JavascriptExecutor js1 = (JavascriptExecutor) driver;
		js.executeScript("window.scrollBy(0,500)", "");
}
}