package windowhandle;

import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class HYTMultiplewindow {
	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver","C:\\Users\\amol\\Downloads\\chromedriver-win64 (4)\\chromedriver-win64\\chromedriver.exe" );
		WebDriver driver =new ChromeDriver();
		driver.get("https://www.hyrtutorials.com/p/window-handles-practice.html");
		driver.manage().window().maximize();
		JavascriptExecutor js = (JavascriptExecutor) driver;
		js.executeScript("window.scrollBy(0,550)", "");
	 
	WebElement btn = driver.findElement(By.xpath("//button[@id=\"newWindowsBtn\"]"));
	//	WebDriverWait wait = new WebDriverWait(driver,Duration.ofSeconds(50));
//WebElement btn=wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//button[@id=\"newWindowBtn\"]")));
btn.click();
		driver.findElement(By.xpath("//button[@id=\"newWindowBtn\"]")).click();
		String is=driver.getWindowHandle();
		System.out.println(is);
		Set<String> ids = driver.getWindowHandles();
		
		String [] ar=ids.toArray(new String [ids.size()]);
		System.out.println("+++++++++++++++++++++++++++++++++++++++++++++++");
		System.out.println(ar[0]);
		System.out.println("-----------------------------------------------------------");
		System.out.println(ar[1]);
		System.out.println(ar[2]);

		driver.switchTo().window(ar[1]);
		driver.findElement(By.xpath("//input[@id=\"firstName\"]")).sendKeys("AMol");
		driver.switchTo().window(ar[2]);
		String s=driver.findElement(By.xpath("//img[@id=\"Header1_headerimg\"]")).getText();
		
		
		System.out.println(s);

	}

}
