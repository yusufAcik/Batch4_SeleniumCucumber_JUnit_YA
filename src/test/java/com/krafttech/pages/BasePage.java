package com.krafttech.pages;

import com.krafttech.utilities.Driver;
import com.krafttech.utilities.ExcelUtil;
import io.cucumber.java.it.Ma;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import java.util.List;
import java.util.Map;

public abstract class BasePage {

    public BasePage(){
        PageFactory.initElements(Driver.get(),this);
    }

    // abstract void assertPageTitle(); tüm sayfalar için zorunlu metod

    @FindBy(css = "nav>ul>li")
    public List<WebElement> basePageTabs;

    public void navigateToTabsAndModules(String tabName,String moduleName){
        String tabXpath ="//span[text()='"+tabName+"']";
        WebElement tab = Driver.get().findElement(By.xpath(tabXpath));
        tab.click();

        if(!moduleName.isEmpty()) {
            String moduleXpath = "//span[text()='" + moduleName + "']";
            WebElement module = Driver.get().findElement(By.xpath(moduleXpath));
            module.click();
        }

    }
    public String getElementText(WebElement element){
        return element.getText();
    }
    public void clickElement(WebElement element){
        element.click();
    }
    public List<Map<String,String>> getExcelData(String path,String sheetName){
        ExcelUtil excelUtil = new ExcelUtil(path,sheetName);
        List<Map<String,String>> dataList = excelUtil.getDataList();
        return dataList;
    }
}
