package com.krafttech.step_defs;

import com.krafttech.pages.UserProfilePage;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;

public class UserProfilePage_StepDefs {

    UserProfilePage userProfilePage = new UserProfilePage();

    @When("The user sohould be able navigate User Profile Page Tabs with {string}")
    public void the_user_sohould_be_able_navigate_user_profile_page_tabs_with(String tabName) {
    userProfilePage.navigateEditProfileTabs(tabName);
    }

    @Then("the user should be able to see last added record with {string}")
    public void the_user_should_be_able_to_see_last_added_record_with(String school) {
        String actualRecordName = userProfilePage.addedEducation(school);
        Assert.assertEquals(school,actualRecordName);
    }

    @Then("The user should be able to delete last added record with {string}")
    public void the_user_should_be_able_to_delete_last_added_record_with(String school) {
    userProfilePage.deleteEducationRecord(school);
    }


}
