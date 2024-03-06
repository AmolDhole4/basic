package ListBox;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class usingSelectclass {
	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver","C:\\Users\\amol\\Downloads\\chromedriver-win64 (4)\\chromedriver-win64\\chromedriver.exe" );
		WebDriver driver =new ChromeDriver();
	driver.manage().window().maximize();
	driver.get("https://www.hyrtutorials.com/p/html-dropdown-elements-practice.html");
	WebElement listbox = driver.findElement(By.xpath("//select[@id=\"course\"]"));
	Select s=new Select(listbox);
//	s.selectByIndex(2);
	try {
		Thread.sleep(20000);
	} catch (InterruptedException e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	}
	//s.selectByValue("java");
	  try {
		Thread.sleep(1000);
	} catch (InterruptedException e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
		s.selectByVisibleText("Javascript");
	}
	}

}
