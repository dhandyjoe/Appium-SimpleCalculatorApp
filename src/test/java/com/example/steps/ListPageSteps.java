package com.example.steps;

import com.example.BaseTest;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;

public class ListPageSteps extends BaseTest {

    @And("user do scroll")
    public void userDoScroll() {
      listPage.swipeList();
    }

    @And("user double tap in first list")
    public void userDoubleTapInFirstList() {
      listPage.doubleTap();
    }

    @Then("toast should appear twice")
    public void toastShouldAppearTwice() {
        listPage.toastFirstList();
    }
}
