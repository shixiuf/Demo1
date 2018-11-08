package login;
import java.util.concurrent.TimeUnit;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeDriverService;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.ExpectedCondition;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;
import org.openqa.selenium.WebDriverException;
import javax.annotation.CheckForNull;


public class login{
    public static void main(String[] args) {
        System.setProperty("C://Program Files (x86)//Mozilla Firefox//firefox.exe","webdriver.firefox.driver");
        WebDriver driver =new FirefoxDriver();
        driver.get("http://www.baidu.com");
        driver.findElement(By.id("KW")).sendKeys("你好");
        driver.findElement(By.id("SU")).click();
    }
}


