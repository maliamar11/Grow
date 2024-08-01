package Grow.Grow;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class AppTest3 
{
    /**
     * Rigorous Test :-)
     */
    @Test
    public void shouldAnswerWithTrue()
    {
       System.out.println("App Test");

       System.out.println("App Test 2");
       System.out.println("App Test");
       WebDriver driver = new ChromeDriver();
       driver.get("https://google.com");
       System.out.println(driver.getTitle());
       driver.quit();
    }
}
