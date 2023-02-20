import org.openqa.selenium.By;

public class Tododeletestrings extends Todo
{
	public void deletestrings() 
	{

		for(int i=4;i<=10;i++)
		{
			String str[] = {"Geetha1" ,"Hello","Hi mandy","good morning","Hello people","asdfdsv","sdfggdfsg","dsgffdg","dasfdf","fghjj"};
			driver.findElement(By.xpath("(//button[@ng-click='home.delete($index)'])")).str[i].click();
			
		}
        
	}

	public static void main(String[] args) throws Exception 
	{
		Tododeletestrings tds=new Tododeletestrings();
		tds.setup();
		tds.openurl();
		tds.login();
		tds.deletestrings();
		tds.logout();

	}

}
