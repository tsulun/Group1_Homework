package group1.homework1;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class TestCase_9 {

    WebDriver driver;

    @BeforeMethod
    public void setUp() {
        WebDriverManager.chromedriver().setup();
        driver = new ChromeDriver();
        driver.manage().window().maximize();

    }

    @AfterMethod
    public void tearDown() throws InterruptedException {

        Thread.sleep(3000);
        driver.quit();
    }

    @Test
    public void test1() throws InterruptedException {
        driver.get("https://practice-cybertekschool.herokuapp.com");
        Thread.sleep(3000);

        WebElement statusCodes = driver.findElement(By.xpath("/html/body/div[1]/div[2]/div/ul/li[46]/a"));
        statusCodes.click();


        WebElement twoHundred = driver.findElement(By.xpath("/html/body/div[1]/div[2]/div/div/ul/li[1]/a"));
        twoHundred.click();





    }

    }


