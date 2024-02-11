package Tests;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;

import java.util.concurrent.TimeUnit;

public class TC00_TestBase {
    public WebDriver driver ;



    @BeforeClass
    public void setUp()
    {
        driver = new ChromeDriver();

        //configuration
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(20, TimeUnit.MILLISECONDS);

        //navigate to test website
        driver.get("https://phptravels.net/");

    }



    @AfterClass
    public void cleanUp()
    {
        driver.quit();
    }
}
