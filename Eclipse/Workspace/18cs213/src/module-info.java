import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class Demo1 {
		public static void main(String[] args)
{
			System.setProperty("webdriver.chrome.driver", 
					"D:\\Eclipse\\chromedriver.exe"");
			ChromeDriver driver = new ChromeDriver();
	             	driver.get("http://www.newtours.demoaut.com");        
	          		driver.manage().window().maximize();
			driver.findElement(By.name("userName")).sendKeys("mercury");
			driver.findElement(By.name("password")).sendKeys("mercury");
			driver.findElement(By.name("login")).click();
			}
                                  }
		        

