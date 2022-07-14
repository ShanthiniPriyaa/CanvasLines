import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class LinesIntercept {
	
	static String browser;
	static WebDriver driver;

	public static void main(String[] args) {
		setBrowser();
		setBrowserconfi();
		OpenApp();
		DrawLine();
		Lines();
		CloseApp();
	}
	
	public static void setBrowser() {
		browser ="Chrome";
	}
	
	public static void setBrowserconfi() {
		
		driver = new ChromeDriver();
		driver.manage().window().maximize();
	}
	
	public static void OpenApp() {
		driver.get("http://www.htmlcanvasstudio.com/");
	}
	
	public static void DrawLine() {
		driver.findElement(By.xpath("//input[contains(@title,'Draw a line')]")).click();
	}
	
	public static void Lines() {
		
		WebElement canvas = driver.findElement(By.id("imageView"));
		
		Actions a = new Actions(driver);
		
		a.clickAndHold(canvas).moveByOffset(200, 0).click().build().perform();
		
		a.clickAndHold(canvas).moveByOffset(0, -200).click().build().perform();
	}
	
	public static void CloseApp() {
		driver.quit();
	}

}
