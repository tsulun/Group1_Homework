package group1.homework1;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class TestCase_1 {
    WebDriver driver;

    @BeforeMethod
    public void setUp(){
        WebDriverManager.chromedriver().setup();
        driver = new ChromeDriver();
        driver.manage().window().maximize();
    }
    @AfterMethod
    public void tearDown() throws InterruptedException {
        Thread.sleep(2000);
        driver.quit();
    }
    @Test
    public void testCase1(){
        driver.get("https://practice-cybertekschool.herokuapp.com/");
        WebElement registrationForm = driver.findElement(By.linkText("Registration Form"));
        JavascriptExecutor jse = (JavascriptExecutor) driver;
        jse.executeScript("arguments[0].scrollIntoView(true);",registrationForm);
        registrationForm.click();
        WebElement birthday = driver.findElement(By.xpath("//*[@name='birthday']"));
        birthday.sendKeys("wrong_dob");
        WebElement warningMessage = driver.findElement(By.xpath("/html/body/div/div[2]/div/div/div/div/form/div[1]/div/small[1]"));
        Assert.assertTrue(warningMessage.isDisplayed());
    }

    }
