package demo;
import org.testng.annotations.Test;

 class LoginTest {	
	
    @Test(priority = 2)
	public void openBrowser()
	{
		System.out.println("Open browser");
	}
    
    @Test(priority = 3)
    public void LogonBrowser()
    {
    	System.out.println("Login Application");
    }
    
  
    @Test(priority = 1)   
    public void LogoutApp()
    {
    	System.out.println("Logout application");
    }
    
    

}
