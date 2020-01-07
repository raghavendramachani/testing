package com.machani.selenium;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class FacebookMain {
  public static void main(String args[]){
    WebDriver driver = null;
    try{
      System.setProperty("webdriver.gecko.driver","/Users/machanir/testing/geckodriver");
      driver = new FirefoxDriver();
      String baseUrl = "http://www.facebook.com";
      driver.get(baseUrl);
      FacebookLogin facebookLogin = new FacebookLogin(driver);
      FacebookHomePage facebookHomePage = new FacebookHomePage(driver);

      System.out.println(facebookHomePage.getHomePageTitle());

      facebookLogin.loginToFacebook("raghavendra.machani@gmail.com", "");
      String title = facebookHomePage.getHomePageTitle();
      System.out.println(title);

    }catch (Exception ex){
      ex.printStackTrace();
    }finally {
      driver.close();
    }

  }
}
