package login;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.firefox.FirefoxProfile;
import org.openqa.selenium.support.ui.ExpectedCondition;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

import javax.annotation.CheckForNull;
import java.util.concurrent.TimeUnit;

public class login{
    public static void main(String[] args) {
        WebDriver dirver;
        System.setProperty("webdriver.firefox.driver","C:\\driver\\geckodriver.exe");//调用浏览器驱动
        WebDriver driver = new FirefoxDriver();
        driver.get("https://www.baidu.com");  //打开URL
        WebElement username_0 = driver.findElement(By.id("kw"));//定位输入框元素
        username_0.sendKeys("沙海剧照");//输入沙海剧照
        WebElement btn = driver.findElement(By.id("su"));//定位“百度一下”按钮元素
        btn.click();//点击“百度一下”
        driver.quit();//关闭浏览器
    }
}


