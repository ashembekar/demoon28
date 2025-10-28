package testFirefox1;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
public class fire1 {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
String BaseURl = "https://amazon.in";
WebDriver driver= new FirefoxDriver();
driver.get(BaseURl);
driver.manage().window().maximize();
System.out.print("TItle is - " + driver.getTitle());
Thread.sleep(3000);
driver.quit();
	}

}
