package com.krafttech.pages;

import com.krafttech.utilities.Driver;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;

import java.util.List;

public class AddEducationPage extends BasePage{
    @FindBy(xpath = "//button[text()='Add Education'][./parent::div]")
    public WebElement addEducationButton;

    @FindBy(css = "#school")
    public WebElement schoolOrBootcamp;

    @FindBy(xpath = "//*[@id='currentedu']")
    public WebElement checkBox;

    @FindBy(xpath = "(//form)[3]//label[@for!='current']")
    public List<WebElement> addEducationFormLabels_1;

    @FindBy(xpath = "(//form)[3]//label[not(@for='current')]")
    public List<WebElement> addEducationFormLabels_2;


    @FindBy(xpath = "//label[text()='School or Bootcamp *']/../..//label")
    public List<WebElement> addEducationFormLabels;
    public void fillingEducationForm(){
        Actions actions=new Actions(Driver.get());

        actions.click(schoolOrBootcamp)
                .sendKeys("Kraft"+ Keys.TAB)
                .sendKeys("First Degree"+Keys.TAB)
                .sendKeys("IT Engineering"+Keys.TAB)
                .sendKeys("11122020"+Keys.TAB+Keys.TAB)
                .sendKeys("12122022"+Keys.TAB)
                .sendKeys("Nice Course"+Keys.TAB+Keys.ENTER).perform();
    }

    public void fillingEducationForm(String school,String degree,String study,String fromDate,String toDate,String description){
        Actions actions=new Actions(Driver.get());

        actions.click(schoolOrBootcamp)
                .sendKeys(school+ Keys.TAB)
                .sendKeys(degree+Keys.TAB)
                .sendKeys(study+Keys.TAB)
                .sendKeys(fromDate+Keys.TAB+Keys.TAB)
                .sendKeys(toDate+Keys.TAB)
                .sendKeys(description+Keys.TAB+Keys.ENTER).perform();
    }
}
