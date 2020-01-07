package com.machani.selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Guru99 {

  public static void main(String args[]){
    WebDriver driver = null;
    try {
        System.setProperty("webdriver.gecko.driver","/Users/machanir/testing/geckodriver");
        driver = new FirefoxDriver();
        String baseUrl = "http://live.demoguru99.com/index.php/";
        driver.get(baseUrl);
        System.out.println(driver.getTitle());

        driver.findElement(By.xpath("//a[contains(text(),'Mobile')]")).click();
        String listPrice = driver.findElement(By.xpath("//span[@id='product-price-3']")).getText();
        System.out.println(listPrice);
        driver.findElement(By.xpath("//img[@id='product-collection-image-3']")).click();
        String detailsPrice = driver.findElement(By.xpath("//span[@id='product-price-3']")).getText();
        System.out.println(detailsPrice);
        if (listPrice.equalsIgnoreCase(detailsPrice))
          System.out.println("PASS");
        else
          System.out.println("FAILED");
    }catch (Exception e){
      e.printStackTrace();
    }finally {
      driver.close();
    }
  }
}
