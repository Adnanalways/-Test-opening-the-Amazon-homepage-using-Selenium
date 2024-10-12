package pageTitle;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class PageTitleTest {
	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "C:\\selenium\\chromedriver-win64 (1)\\chromedriver-win64\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.amazon.com");
		driver.manage().window().maximize();
		
		String title=driver.getTitle();
		System.out.println("page title is :"+title);
		
		if(title.contains("Amazon")) {
			System.out.println("test passed");
		}else{
			System.out.println("Test Failed");
			
		}
		//driver.quit();
			
		
		
	}

}
