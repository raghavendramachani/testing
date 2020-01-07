package com.machani.selenium;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class FacebookLogin {
  WebDriver driver;

  public FacebookLogin(WebDriver driver){
    this.driver = driver;
  }

  public void setUsername(String username){
    ((FirefoxDriver) driver).findElementById("email").sendKeys(username);
  }

  public void setPassword(String password){
    ((FirefoxDriver) driver).findElementById("pass").sendKeys(password);
  }

  public void clickLogin(){
    ((FirefoxDriver) driver).findElementById("loginbutton").click();
  }

  public void loginToFacebook(String username, String password){
    this.setUsername(username);
    this.setPassword(password);
    this.clickLogin();
  }

}
