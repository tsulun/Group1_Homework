package group1.homework1;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class TestCase_10 {

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
    public void test1(){

        driver.get("https://practice-cybertekschool.herokuapp.com");

        WebElement statusCodes = driver.findElement(By.xpath("/html/body/div[1]/div[2]/div/ul/li[46]/a"));
        statusCodes.click();

        WebElement threeHundred = driver.findElement(By.xpath("/html/body/div[1]/div[2]/div/div/ul/li[2]/a"));
        threeHundred.click();

        WebElement text = driver.findElement(By.xpath("/html/body/div[1]/div[2]/div/div/p"));


        String text1 = text.getText();

        System.out.println("Displayed text: " + text1);
        }
    }


