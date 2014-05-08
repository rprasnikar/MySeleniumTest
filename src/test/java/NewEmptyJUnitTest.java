/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */


import org.junit.After;
import org.junit.AfterClass;
import org.junit.Assert;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

/**
 *
 * @author Robert
 */
public class NewEmptyJUnitTest {
    
    static private String URL = "http://localhost:8080/MySeleniumTest/simpleform.jsp";
    
    public NewEmptyJUnitTest() {
    }
    
    @BeforeClass
    public static void setUpClass() {
    }
    
    @AfterClass
    public static void tearDownClass() {
    }
    
    @Before
    public void setUp() {
    }
    
    @After
    public void tearDown() {
    }

    // TODO add test methods here.
    // The methods must be annotated with annotation @Test. For example:
    //
    // @Test
    // public void hello() {}
    @Test
    public void myLittleTest() {
         WebDriver driver  = new FirefoxDriver();
         driver.get(URL);
         WebElement e = driver.findElement(By.name("link"));
         e.click();
         //Do some actions
         driver.quit();
    }
    
        @Test
    public void myOtherLittleTest() {
         WebDriver driver  = new FirefoxDriver();
         driver.get(URL);
         WebElement n = driver.findElement(By.name("yourName"));
         n.sendKeys("A");
         WebElement a = driver.findElement(By.name("yourAge"));
         a.sendKeys("5");        
         //Do some actions
         WebElement i = driver.findElement(By.id("s"));
         i.click();
         System.out.println("Page title is: " + driver.getTitle());
         Assert.assertFalse(driver.getTitle().contains("Error"));
         driver.quit();
    }
}
