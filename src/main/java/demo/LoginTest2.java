package demo;
import java.io.IOException;
import java.time.Duration;

import org.apache.poi.EncryptedDocumentException;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.Test;

import Data.ReadExcelData;

 class LoginTest2 {	
	 
	public  WebDriver driver;	
	
	
    @Test(priority =0)
	public void SetUp()
	{
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
		driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
	}
    
    @Test(priority =1)
    public void LogonApp() throws InterruptedException, EncryptedDocumentException, IOException
    {
    	ReadExcelData ex= new ReadExcelData();   	
    	
    	String us=ex.GetExcelData("Login", 1, 0);
    	driver.findElement(By.name("username")).sendKeys(us);
    	
    	String pw=ex.GetExcelData("Login", 1, 1);
    	driver.findElement(By.name("password")).sendKeys(pw);    	
    	driver.findElement(By.xpath("//button[@type='submit']")).click();
    }
    
  
    @Test(priority =2)
    public void VerifyTitle()
    {
    	String actaulTitle="OrangeHRM";
        String Expectetitle=driver.getTitle();
        Assert.assertEquals(actaulTitle, Expectetitle);
        driver.close();
    
    }
    
    

}
