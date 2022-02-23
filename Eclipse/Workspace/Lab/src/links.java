import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.WebElement;
import java.util.List;


public class links {
	public static void main(String[] args){
		System.setProperty("webdriver.chrome.driver","D:\\Eclipse\\chromedriver.exe");
		ChromeDriver d=new ChromeDriver();
		d.get("C:\\Users\\Student\\Desktop\\image.html");
		List <WebElement> a=d.findElements(By.xpath("//select"));
		int linkcount=a.size();
		System.out.println("total no of links ="+linkcount);

		List <WebElement> b=d.findElements(By.xpath("//*"));
		int elements=b.size();
		System.out.println("total no of elements ="+elements);

		}


}
