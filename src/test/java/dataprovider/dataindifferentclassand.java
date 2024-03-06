package dataprovider;



import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class dataindifferentclassand {
	
	
		 @Test (dataProvider="getDaata",dataProviderClass=ToFetchTheDatausingExcelshettDatainsameClass.class)
		  public void fetchthedata (String username, String password) {
		System.setProperty("webdriver.chrome.driver","C:\\Users\\amol\\Downloads\\chromedriver-win64 (4)\\chromedriver-win64\\chromedriver.exe" );
	WebDriver driver =new ChromeDriver();
	driver.get("https://www.facebook.com/");
	driver.manage().window().maximize();
	//driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));

	//driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS) ;
  
	
	
		  String expectedUrl="https://www.facebook.com/";
		  WebElement un = driver.findElement(By.xpath("//input[@id=\"email\"]"));
			WebElement pw = driver.findElement(By.xpath("//input[@id=\"pass\"]"));
				WebElement login = driver.findElement(By.xpath("//button[@name=\"login\"]"));
				System.out.println(username)	;
				
				un.sendKeys(username);
				pw.sendKeys(password);
				login.click();
	//driver.close();
		 }

}
