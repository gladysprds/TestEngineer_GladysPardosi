package starter.stepdefinitions;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

import starter.pages.DanaPensiunPage;
import starter.pages.HomePage;

public class countPensionFund {
    HomePage homePage;
    DanaPensiunPage danaPensiunPage;

    @Given("I am on homepage")
    public void iAmOnHomepage() {
        homePage.openUrl();
        homePage.chooseDropdownAsuransiJiwa();
        homePage.chooseDanaPensiunOption();

    }

    @When("I scroll down and choose Dana Pensiun")
    public void iScrollDownAndChooseDanaPensiun() {
        danaPensiunPage.scrollDown();
        danaPensiunPage.clickDanaPensiunDropdown();
    }

    @And("I click next button")
    public void iClickNextButton() {
        danaPensiunPage.clickNextButton();
    }

    @And("I fill field Penghasilan and field Tingkat Inflasi and click next button")
    public void iFillFieldPenghasilanAndFieldTingkatInflasiAndClickNextButton() {
        danaPensiunPage.fillFieldPenghasilanAndInflasi();
        danaPensiunPage.clickNextButton();
    }

    @And("I fill field Usia and field Usia pensiun and click next button")
    public void iFillFieldUsiaAndFieldUsiaPensiunAndClickNextButton() {
        danaPensiunPage.fillFieldUsia();
        danaPensiunPage.clickX();
        danaPensiunPage.clickNextButtonForUsia();
    }


    @And("I fill the ratio and click next button")
    public void iFillTheRatioAndClickNextButton() {
        danaPensiunPage.fillRasio();
        danaPensiunPage.clickNextButtonForRatio();
    }

    @Then("I get my result")
    public void iGetMyResult() {
        danaPensiunPage.validateresultDanaPensiun();
    }



}
