package com.bank;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import java.util.List;

public class Amex {
    WebDriver driver;

    @BeforeMethod
    public void setup() {

        WebDriverManager.chromedriver().setup();
        driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("https://www.americanexpress.com/us/credit-cards/?oneXPForcedExperiments=e30=");

        // second change


    }
/*
    @Test
    public void test1() throws InterruptedException {

        WebElement addCart = driver.findElement(By.xpath("(//div[.='Add Card'])[1]"));
        addCart.click();
Thread.sleep(2);
        WebElement businessPlatinium = driver.findElement(By.xpath("//span[contains(text(),'Business Platinum Card')]"));

        businessPlatinium.click();

        WebElement compare = driver.findElement(By.xpath("//button[.='Compare']"));

        compare.click();

        WebElement tab = driver.findElement(By.xpath("//span[contains(text(),'Offer & Benefit Terms')]"));
        tab.click();
        String windoowHandles = driver.getWindowHandle();
        driver.switchTo().window(windoowHandles);

      String actual =   driver.getTitle();
    }


 */

    @Test
    public void test() throws InterruptedException {


        // List<WebElement> allModules = driver.findElements(By.xpath("//button[@data-qe-id='Tab']"));

        WebElement allCards = driver.findElement(By.xpath("//*[@id=\"view-all-personal-cards\"]/div[3]/div[2]/div/ul/li[1]/div/button"));
        Thread.sleep(2000);

        allCards.click();

       /* for (WebElement allModule : allModules) {
            System.out.println(allModule.getSize());
            //  allModule.click();
            Thread.sleep(3000);


        }


        */

        //  for(int i = 0;i <allModules.size();i++) {


        //  }


    }


}
