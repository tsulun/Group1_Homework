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

import java.util.List;

public class TestCase_2 {

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
    public void testCase2(){
        driver.get("https://practice-cybertekschool.herokuapp.com/");
        WebElement registrationForm = driver.findElement(By.linkText("Registration Form"));
        JavascriptExecutor jse = (JavascriptExecutor) driver;
        jse.executeScript("arguments[0].scrollIntoView(true);",registrationForm);
        registrationForm.click();
        List<WebElement> programmingLanguageCheckboxes = driver.findElements(By.xpath("//*[@class='form-check form-check-inline']"));
        for (WebElement checkbox : programmingLanguageCheckboxes) {
            Assert.assertTrue(checkbox.isDisplayed(),"verify checkboxes are displayed");
        }

}
}
