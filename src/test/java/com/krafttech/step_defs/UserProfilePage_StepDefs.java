package com.krafttech.step_defs;

import com.krafttech.pages.UserProfilePage;
import io.cucumber.java.en.When;

public class UserProfilePage_StepDefs {

    UserProfilePage userProfilePage = new UserProfilePage();

    @When("The user sohould be able navigate User Profile Page Tabs with {string}")
    public void the_user_sohould_be_able_navigate_user_profile_page_tabs_with(String tabName) {
    userProfilePage.navigateEditProfileTabs(tabName);
    }
}
