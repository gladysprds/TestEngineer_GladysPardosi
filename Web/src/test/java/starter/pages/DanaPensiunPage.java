package starter.pages;

import net.serenitybdd.core.pages.PageObject;
import net.serenitybdd.core.pages.SerenityActions;
import net.thucydides.core.annotations.Step;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;

public class DanaPensiunPage extends PageObject {


    private By openOptionDropdown(){
        return By.xpath("//span[@class=\"jcf-select-opener\"]");
    }

    private By danaPensiun(){
        return By.xpath("//span[@data-index=\"1\"]");
    }

    private By buttonNext(){
        return By.xpath("//button[contains(text(),'Selanjutnya')]");
    }
    private By buttonNextForUsia(){
        return By.xpath("//*[@id=\"financialCalculatePensiun\"]/section[2]/div[4]/button");
    }

    private By fieldPenghasilanPerBulan(){
        return By.xpath("//input[@name='calc_type3']");
    }
    private By fieldInflasi(){
        return By.xpath("//input[@id='inflasiInput']");
    }

    private By usia(){
        return By.xpath("//input[@id='usiaCurrentInput']");
    }
    private By usiaPensiun(){
        return By.xpath("//input[@id='usiaPensiunInput']");
    }
    private By rasio(){
        return By.xpath("//input[@id='ratioInput']");
    }

    private By resultDanaPensiun(){
        return By.xpath("//div[@class='big-calc']");
    }

     private By buttonX(){
        return By.xpath("//*[@id=\"pc-button\"]/button");

    }

    private By buttonNextForRatio(){
        return By.xpath("//*[@id=\"financial-pensiun-step3\"]");
    }

    @Step
    public void scrollDown(){
        $("//body").sendKeys(Keys.END);
    }


    @Step
    public void clickDanaPensiunDropdown(){
        $(openOptionDropdown()).click();
        $(danaPensiun()).click();
    }

    @Step
    public void clickNextButton(){
        $(buttonNext()).click();
    }

    @Step
    public void fillFieldPenghasilanAndInflasi(){
        $(fieldPenghasilanPerBulan()).type("5000000");
        $(fieldInflasi()).type("10");
    }

    @Step
    public void fillFieldUsia(){
        $(usia()).type("23");
        $(usiaPensiun()).type("60");

    }

    @Step
    public void clickNextButtonForUsia(){
        $(buttonNextForUsia()).click();
    }

    @Step
    public void clickX(){
        $(buttonX()).click();
    }

    @Step
    public void fillRasio(){
        $(rasio()).type("80");
    }


    @Step
    public void clickNextButtonForRatio(){
        $(buttonNextForRatio()).click();
    }

    @Step
    public void validateresultDanaPensiun(){
        $(resultDanaPensiun()).isDisplayed();
    }







}
