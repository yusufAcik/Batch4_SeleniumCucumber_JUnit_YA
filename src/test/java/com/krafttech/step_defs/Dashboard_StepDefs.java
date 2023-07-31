package com.krafttech.step_defs;

import com.krafttech.pages.DashboardPage;
import com.krafttech.utilities.BrowserUtils;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;

import java.util.List;

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
}