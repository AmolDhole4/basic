package ListBox;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class handleDynamicDropdownSelectOptionfromAutoSuggestion {
public static void main(String[] args) {
	System.setProperty("webdriver.chrome.driver","C:\\Users\\amol\\Downloads\\chromedriver-win64 (4)\\chromedriver-win64\\chromedriver.exe" );
	WebDriver driver =new ChromeDriver();
driver.manage().window().maximize();
String option="samsung a34 5g";
driver.get("https://www.flipkart.com/");
driver.findElement(By.xpath("//input[@name=\"q\"]")).sendKeys("macbook pro");
                                                    //ul[@class="_1sFryS _2x2Mmc _3ofZy1"]//li
List<WebElement> op = driver.findElements(By.xpath("//div[contains(@class,\"YGcVZO _2VHNef\")]"));
 for(WebElement opt:op) {
String s=	 opt.getText();
	 
System.out.println(s); 
if(s.equals(option)) {
	opt.click();
	
}
 }
}
}
