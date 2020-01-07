package com.machani.selenium;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class App {

  public static void main(String args[]){
    WebDriver driver = null;
    try {

//      System.out.println("This is my first selenium program..");
//      System.setProperty("webdriver.chrome.driver","/Users/machanir/testing/chromedriver");
//      driver = new ChromeDriver();
//      String baseUrl = "http://www.facebook.com";
//      driver.get(baseUrl);
//      System.out.println(driver.getTitle());
//      WebElement username = ((ChromeDriver) driver).findElementById("email");
//      WebElement password = ((ChromeDriver) driver).findElementById("pass");
//      WebElement submit = ((ChromeDriver) driver).findElementById("loginbutton");
//      username.sendKeys("raghavendra.machani@gmail.com");
//      password.sendKeys("u8i9o0p-");
//      submit.click();
//      System.out.println(driver.getTitle());

        System.setProperty("webdriver.gecko.driver","/Users/machanir/testing/geckodriver");
        driver = new FirefoxDriver();
        String baseUrl = "http://www.facebook.com";
        driver.get(baseUrl);
        System.out.println(driver.getTitle());
        WebElement username = ((FirefoxDriver) driver).findElementById("email");
        WebElement password = ((FirefoxDriver) driver).findElementById("pass");
        WebElement submit = ((FirefoxDriver) driver).findElementById("loginbutton");
        username.sendKeys("raghavendra.machani@gmail.com");
        password.sendKeys("");
        submit.click();
        System.out.println(driver.getTitle());
    }catch (Exception e){
      e.printStackTrace();
    }finally {
      driver.close();
    }
  }
}
