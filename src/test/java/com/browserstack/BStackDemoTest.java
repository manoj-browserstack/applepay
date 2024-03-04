package com.browserstack;

import com.browserstack.SeleniumTest;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;
import org.testng.Assert;
import org.testng.annotations.Test;

public class BStackDemoTest extends SeleniumTest {
    @Test
    public void addProductToCart() throws Exception {
        // navigate to bstackdemo
        driver.get("https://globale-qa-c1-us2.myshopify.com/");

        driver.findElement(By.id("password")).sendKeys("globale");

        driver.findElement(By.xpath("//form/button")).click();

        Thread.sleep(3000);

        driver.findElement(By.xpath("//h3[@class=\"card__heading h5\"]/a[@href=\"/products/adidas-superstar-80s\"]")).click();

        Thread.sleep(3000);

        driver.findElement(By.xpath("//button[@name='add']")).click();
//        Thread.sleep(3000);
//        driver.findElement(By.id("cart-icon-bubble")).click();

//        Thread.sleep(5000);
//
//        driver.findElement(By.xpath("//button[@class=\"cart__checkout-button button\"]")).click();

        Thread.sleep(30000);
//        WebElement buttonElement = driver.findElement(By.xpath("//div[@class=\"product-form__buttons\"]/button"));
//        element.click();
//
//        driver.findElement(By.xpath("//button[@name=\"checkout\"]")).click();
//
        driver.findElement(By.id("email")).sendKeys("Automation.Bot@gmail.com");

        Select objSelect = new Select(driver.findElement(By.id("Select0")));
        objSelect.selectByValue("IL");

        driver.findElement(By.id("TextField13")).sendKeys("Automation");

        driver.findElement(By.id("TextField14")).sendKeys("Bot");

        Thread.sleep(1000);

        driver.findElement(By.id("TextField18")).sendKeys("Bazel 25");

        driver.findElement(By.id("TextField19")).sendKeys("4951038");

        driver.findElement(By.id("TextField20")).sendKeys("Petah Tikva");

        driver.findElement(By.id("TextField6")).sendKeys("+972545000000");

        driver.findElement(By.xpath("//div[@class=\"oQEAZ\"]/div/ button")).click();

//        Thread.sleep(5000);
        Thread.sleep(50000);
        driver.findElement(By.xpath("//div[@class=\"oQEAZ\"]/div/ button")).click();

        driver.findElement(By.xpath("//input[@id=\"basic-More Payment Options\"]")).click();



    }
}
