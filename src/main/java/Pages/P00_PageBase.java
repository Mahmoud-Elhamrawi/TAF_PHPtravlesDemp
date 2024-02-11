package Pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;

public class P00_PageBase {
    protected WebDriver driver ;
    public P00_PageBase(WebDriver driver)
    {
        this.driver = driver ;
    }

    WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(30));



    public void clickEle(WebElement ele)
    {
        wait.until(ExpectedConditions.elementToBeClickable(ele));
        ele.click();

    }

    public void enterTxt(WebElement ele , String txt)
    {
        wait.until(ExpectedConditions.visibilityOf(ele));
        ele.sendKeys(txt);
    }
}
