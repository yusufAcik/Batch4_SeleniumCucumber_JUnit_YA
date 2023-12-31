package com.krafttech.step_defs;

import com.krafttech.pages.DashboardPage;
import com.krafttech.utilities.BrowserUtils;
import com.krafttech.utilities.ExcelUtil;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;

import java.util.List;
import java.util.Map;

public class Dashboard_StepDefs {

    DashboardPage dashboardPage = new DashboardPage();

    @Then("Verify that the username on the dashboard page is {string}")
    public void verify_that_the_username_on_the_dashboard_page_is(String expectedUsername) {
        String actualUsername = dashboardPage.getElementText(dashboardPage.userName);
        Assert.assertEquals(expectedUsername, actualUsername);
    }

    @Then("The user should be able to see all following tabs that shown on the page")
    public void the_user_should_be_able_to_see_all_following_tabs_that_shown_on_the_page(List<String> expectedTabMenuNames) {

        List<String> actualTabNames = BrowserUtils.getElementsText(dashboardPage.basePageTabs);
        Assert.assertEquals(expectedTabMenuNames, actualTabNames);
    }

    @When("The user should be able to navigate Tabs and Modules with {string} and {string}")
    public void the_user_should_be_able_to_navigate_tabs_and_modules_with_and(String tabName, String moduleName) {
    dashboardPage.navigateToTabsAndModules(tabName,moduleName);
    }

    @Then("Verify that {string} is visible on dashboard page with excel file {string}, {string},{int}")
    public void verify_that_is_visible_on_dashboard_page_with_excel_file(String yourName, String path, String sheetName, Integer row) {
        ExcelUtil excelUtil = new ExcelUtil(path,sheetName);

        List<Map<String, String>> dataList = excelUtil.getDataList();
        String expectedUsername = dataList.get(row).get(yourName);
        String actualUsername = dashboardPage.userName.getText();

        Assert.assertEquals(expectedUsername,actualUsername);
    }
    @When("The user navigates to tab and module via {string} and {string} from excel file {string}, {string}, {int}")
    public void the_user_navigates_to_tab_and_module_via_and_from_excel_file(String yourName, String moduleName, String path, String sheetName, Integer row) {
    ExcelUtil excelUtil=new ExcelUtil(path,sheetName);
        List<Map<String, String>> dataList = excelUtil.getDataList();

        String yourNameData=dataList.get(row).get(yourName);
        String module=dataList.get(row).get(moduleName);

        dashboardPage.navigateToTabsAndModules(yourNameData,module);
    }
}