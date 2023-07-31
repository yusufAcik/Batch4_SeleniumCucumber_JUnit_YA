package com.krafttech.step_defs;

import com.krafttech.utilities.Driver;
import io.cucumber.java.After;
import io.cucumber.java.Before;
import io.cucumber.java.Scenario;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;

import java.util.concurrent.TimeUnit;

public class Hooks {
    @Before(order = 0)
    public void setUp(){
        Driver.get().manage().window().maximize();
        Driver.get().manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
    }
    @After(order = 0)
    public void tearDown(Scenario scenario){
if(scenario.isFailed()){
   final byte[] screenshot = ((TakesScreenshot) Driver.get()).getScreenshotAs(OutputType.BYTES);
    scenario.attach(screenshot,"image/png","screenshot");
}
Driver.closeDriver();
    }

    @Before(value ="@manager",order = 1)
    public void setUpManager(){
        System.out.println("Before Manager");
    }
    @After (value ="@manager",order = 1)
    public void tearDownManager(){
        System.out.println("After Manager");
    }
}
