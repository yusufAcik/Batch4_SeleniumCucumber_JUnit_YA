package com.krafttech.step_defs;

import com.krafttech.pages.AddEducationPage;
import com.krafttech.utilities.BrowserUtils;
import com.krafttech.utilities.ExcelUtil;
import io.cucumber.datatable.DataTable;
import io.cucumber.datatable.internal.difflib.StringUtills;
import io.cucumber.java.DataTableType;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.apache.commons.lang3.StringUtils;
import org.junit.Assert;

import java.util.List;
import java.util.Map;
import java.util.Objects;

public class AddEducation_StepDefs {
    AddEducationPage addEducationPage = new AddEducationPage();

    @Then("The user should be able to see following labels at the Education Form")
    public void the_user_should_be_able_to_see_following_labels_at_the_education_form(DataTable table) {
        List<String> expectedList = table.asList(String.class);
       // nullToString(expectedList.get(4));
        BrowserUtils.waitFor(2);
        List<String>actualList= BrowserUtils.getElementsText(addEducationPage.addEducationFormLabels);
        Assert.assertEquals(expectedList,actualList);
    }

    @DataTableType
    public String nullToString(String cell){
        return Objects.isNull(cell) ? StringUtils.EMPTY : cell;
    }

    @Then("The user should be able to see following labels at the Education Form_second")
    public void theUserShouldBeAbleToSeeFollowingLabelsAtTheEducationForm_second(List<String> expectedLabels) {

        BrowserUtils.waitForVisibility(addEducationPage.addEducationButton,5);
        List<String> actualLabels_1 = BrowserUtils.getElementsText(addEducationPage.addEducationFormLabels_1);
        List<String> actualLabels_2 = BrowserUtils.getElementsText(addEducationPage.addEducationFormLabels_2);

        Assert.assertEquals(expectedLabels,actualLabels_1);
        Assert.assertEquals(expectedLabels,actualLabels_2);

    }

    @When("The user fills the education form with {string}, {string}, {string}, {string}, {string}, {string}")
    public void the_user_fills_the_education_form_with(String school, String degree, String study, String fromDate, String toDate, String desc) {
    addEducationPage.fillingEducationForm(school, degree, study, fromDate, toDate, desc);
    }
    @When("The user fills the Add Education Form with excel file {string}, {string}, {int}")
    public void the_user_fills_the_add_education_form_with_excel_file(String path, String sheetName, Integer row) {
        ExcelUtil excelUtil=new ExcelUtil(path,sheetName);
        List<Map<String, String>> dataList = excelUtil.getDataList();

        String school=dataList.get(row).get("school");
        String degreee = dataList.get(row).get("degree");
        String study = dataList.get(row).get("study");
        String fromDate = dataList.get(row).get("fromdate");
        String toDate = dataList.get(row).get("Todate");
        String description = dataList.get(row).get("Program Desc");

        addEducationPage.fillingEducationForm(school,degreee,study,fromDate,toDate,description);
    }
}
