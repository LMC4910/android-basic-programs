package lab;
import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.WebElement;
import java.util.List;

public class Demo1 {
public static void main(String[] args){
System.setProperty("webdriver.chrome.driver","C:\\Users\\Student\\Downloads\\chromedriver_win32 (1)\\chromedriver.exe");
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

