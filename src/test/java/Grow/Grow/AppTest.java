package Grow.Grow;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class AppTest 
{
    /**
     * Rigorous Test :-)
     */
    @Test
    public void shouldAnswerWithTrue()
    {
       System.out.println("App Test");
       WebDriver driver = new ChromeDriver();
       driver.get("https://google.com");
       driver.quit();
       
    }
}
