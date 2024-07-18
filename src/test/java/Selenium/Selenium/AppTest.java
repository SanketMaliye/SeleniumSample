package Selenium.Selenium;
 
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.testng.annotations.Test; 
 
public class AppTest 
{
     
    @Test
    public void LaunchChrome()
    {   
        ChromeOptions options = new ChromeOptions();
        		
        options.addArguments("--headless");
        
        WebDriver driver = new ChromeDriver(options);  
        
        driver.get("https://www.google.com/");
        
        driver.findElement(By.cssSelector("[title=\"Search\"]")).sendKeys("Google");      
        
        driver.quit();
        
    }
}
