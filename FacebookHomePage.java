package com.machani.selenium;

import org.openqa.selenium.WebDriver;

public class FacebookHomePage {
  WebDriver driver;

  public FacebookHomePage(WebDriver driver){
    this.driver = driver;
  }

  public String getHomePageTitle(){
    return this.driver.getTitle();
  }
}
