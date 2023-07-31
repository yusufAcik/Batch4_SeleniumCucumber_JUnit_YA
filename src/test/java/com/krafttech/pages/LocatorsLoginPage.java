package com.krafttech.pages;

import com.krafttech.utilities.ConfigurationReader;
import com.krafttech.utilities.Driver;
import org.openqa.selenium.By;

public interface LocatorsLoginPage {

    public static final By emailBox_loc=By.id("email");
    By passwordBox_loc=By.id("yourPassword");
    By loginBtn_loc=By.xpath("//*[text()='Login']");


    // interface lere default metod koyabiliriz
    default void login(){
        Driver.get().findElement(emailBox_loc).sendKeys(ConfigurationReader.get("userEmail"));
        Driver.get().findElement(passwordBox_loc).sendKeys(ConfigurationReader.get("password"));
        Driver.get().findElement(loginBtn_loc).click();
    }

}
