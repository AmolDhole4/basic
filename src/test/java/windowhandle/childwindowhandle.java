package windowhandle;

import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class childwindowhandle {
	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver","C:\\Users\\amol\\Downloads\\chromedriver-win64 (4)\\chromedriver-win64\\chromedriver.exe" );
		WebDriver driver =new ChromeDriver();
		driver.get("https://demo.automationtesting.in/Windows.html");
		driver.manage().window().maximize();
		driver.findElement(By.xpath("(//button[@class=\"btn btn-info\"])[1]")).click();
		String is=driver.getWindowHandle();
		System.out.println(is);
		Set<String> ids = driver.getWindowHandles();
		
		String [] ar=ids.toArray(new String [ids.size()]);
		System.out.println("+++++++++++++++++++++++++++++++++++++++++++++++");
		System.out.println(ar[0]);
		System.out.println("-----------------------------------------------------------");
		System.out.println(ar[1]);
		driver.switchTo().window(ar[1]);
		driver.findElement(By.xpath("(//a[@class=\"nav-link\"])[1]")).click();
	}

}
