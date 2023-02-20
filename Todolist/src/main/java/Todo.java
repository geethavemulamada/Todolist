import java.time.Duration;
import java.time.temporal.TemporalAmount;

import java.util.ArrayList;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Todo {
	
	
	WebDriver driver=  new ChromeDriver();
	
	public void setup() 
	{
		WebDriverManager.chromedriver().setup();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(40));
		driver.manage().window().maximize();
	}
	public void openurl() 
	{
		driver.get("https://todo-list-login.firebaseapp.com/");
	}
	public void login() 
	{
		driver.findElement(By.xpath("//a[@class='btn btn-social btn-google']")).click();
		ArrayList<String> windows=new ArrayList<String>(driver.getWindowHandles());
		driver.switchTo().window(windows.get(1));
		driver.findElement(By.id("identifierId")).sendKeys("geethavemulamada@gmail.com");
		driver.findElement(By.id("identifierId")).sendKeys(Keys.ENTER);
		driver.findElement(By.name("password")).sendKeys("geet123$");
		driver.findElement(By.name("password")).sendKeys(Keys.ENTER);
	}
	public void tendiffstrings() throws Exception
	{
		ArrayList<String> windows1=new ArrayList<String>(driver.getWindowHandles());
		driver.switchTo().window(windows1.get(0));
		Thread.sleep(3000);
		for(int i=0;i<=10;i++)
		{
		String str[] = {"Geetha1" ,"Hello","Hi mandy","good morning","Hello people","asdfdsv","sdfggdfsg","dsgffdg","dasfdf","fghjj"};
		driver.findElement(By.xpath("(//input[@type='text'])[2]")).click();
	    driver.findElement(By.xpath("(//input[@type='text'])[2]")).sendKeys(str[i]);
		driver.findElement(By.xpath("(//button[@ng-click = 'home.list && home.add()'])")).click();  
		 
		}	
	}
	public void logout() throws Exception
	{
		
		Thread.sleep(5000);
		Actions act=new Actions(driver);		
		WebElement Signout=driver.findElement(By.xpath("//button[text()='Sign out']"));
		act.moveToElement(Signout).click().build().perform();
		
	}

	public static void main(String[] args) throws Exception 
	{
		
			Todo todo=new Todo();
			todo.setup();
		    todo.openurl();
		    todo.login();
		    todo.tendiffstrings();
		    todo.logout();
		    
		
		}
	}

	


	
