package IBMSampleTests;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class SampleTestNG {
	
	WebDriver driver;
	String Url="https://dev.netenrich.us";
	
    @BeforeMethod
	public void OpenBrowser(){
    	
    	System.setProperty("webdriver.chrome.driver","F:\\Drivers_Latest\\Browsers\\chromedriver.exe");    	
    	driver = new ChromeDriver();
	  
  }
    @AfterMethod
  public void closeBrowser(){
    	
    	driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
    	System.out.println("In Close browser method");
    	//driver.close();
  }
	  
  @Test
  public void f() throws InterruptedException {
	  System.out.println("In Test Method");
	  driver.manage().window().maximize();
	  driver.get(Url);
	  driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
	  driver.findElement(By.xpath("//*[@id='email']")).sendKeys("chandrasekhar.kovvuri@netenrich.com");
	  driver.findElement(By.xpath("//*[@id='btn-fblogin']")).click();
	  driver.findElement(By.id("login-password")).sendKeys("test456");
	  driver.findElement(By.id("btn-fblogin")).click();
	  Thread.sleep(10000);
	  List<WebElement> conversationList=driver.findElements(By.xpath("//*[@id='conversationArea']/div"));
	  int cnt=conversationList.size();
	  System.out.println("The count of div tags in conversation list is"+"  "+conversationList.size());
	  for (int i=1;i<=cnt;i++){
		  System.out.println("the text of the list is "+"  "+driver.findElement(By.xpath("//*[@id='conversationArea']/div["+i+"]")));
		 
	  }
	  driver.findElement(By.xpath("//*[@id='conversationArea']/div[11]")).click();
	  Thread.sleep(2000);
	  System.out.println("Text Value is: "+driver.findElement(By.xpath("//*[@class='slimScrollDiv']/div[1]/p/p")).getText());
	  
	  Actions a = new Actions(driver);
	  a.moveToElement(driver.findElement(By.xpath("//*[@class='slimScrollDiv']/div[1]/p/p"))).build().perform();
	
	  Thread.sleep(1000);
	  //f0bddb72-a3e8-4d55-b5fc-4c7a2fb0f04dsettings-menui')]/a/i
	  driver.findElement(By.xpath("//*[contains(@id,'settings-menui')]/a/i")).click();
	  //driver.findElement(By.id("chatInputBoxId")).sendKeys("enter the message through selenium automation tool");
	  //driver.findElement(By.id("chatInputBoxId")).sendKeys(Keys.ENTER);
	 // driver.findElement(By.xpath("//*[@id='myTasksFooterIcon']")).click();
	  //Thread.sleep(5000);
	  //Select mytask=new Select(driver.findElement(By.xpath("//*[@id='partnerDropDown']")));
	  //mytask.selectByIndex(4);
	  //abc.inc
	  //driver.findElement(By.xpath("//*[@id='bs-example-navbar-collapse-1']/ul[2]/li/a/span[2]")).click();
	//*[@id="page-containerChannelId"]/div[1]/div[2]/div/div[1]/ul[2]/li[4]
	//*[@id="page-containerChannelId"]/div[1]/div[2]/div/div[1]/ul[2]/li[4]/a/div/text()[2]
	 // driver.findElement(By.xpath("//*[@id='signOutForm']/button")).click();
	  /*driver.findElement(By.xpath("/html/body/nav[1]/div/div/div/ul/li[3]/a")).click();
	  //driver.findElement(By.cssSelector("#s2id_autogen1 > a")).click();
	  driver.findElement(By.xpath("//*[@id='s2id_autogen1']/a/span[1]")).click();
	  Thread.sleep(2000);
	  driver.findElement(By.xpath("//*[@id='select2-drop']/div/input")).sendKeys("rose");
	  Thread.sleep(9000);
	  List<WebElement> hotel_List=driver.findElements(By.xpath("//*[@id='select2-drop']/ul/li[2]/ul/"));
	  System.out.println("The count of the hotels list are"+" "+hotel_List.size() );
	  driver.findElement(By.xpath("//*[@id='select2-drop']/ul/li[2]/ul/li[1]/div")).click();
	  //*[@id="s2id_autogen1"]/a/span[1]*/
	}
}
