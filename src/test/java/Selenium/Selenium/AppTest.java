package Selenium.Selenium;
 
 
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

 
public class AppTest 
{
     
    @org.testng.annotations.Test
    public void shouldAnswerWithTrue()
    {
        WebDriver driver = new ChromeDriver();
        
        driver.get("https://www.google.com/");
        
        driver.findElement(By.cssSelector("[title=\"Search\"]")).sendKeys("Google");      
        
        driver.quit();
        
    }
}
