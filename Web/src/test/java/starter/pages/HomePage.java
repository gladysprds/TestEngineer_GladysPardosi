package starter.pages;

import net.serenitybdd.core.pages.PageObject;
import net.thucydides.core.annotations.Step;
import org.openqa.selenium.By;

public class HomePage extends PageObject{

    private By dropdownAsuransiJiwa(){
        return By.xpath("//*[@class='block__nav block__nav--menus'][1]//a[contains(text(),'Asuransi Jiwa')]");
    }

    private By danaPensiunOption(){
        return By.xpath("//*[@class='mega-menus__child']//a[contains(text(),'Dana Pensiun')]");
    }

    @Step
    public void openUrl(){
        openUrl("https://sequis.co.id/");
    }

    @Step
    public void chooseDropdownAsuransiJiwa(){
        $(dropdownAsuransiJiwa()).click();
    }

    @Step
    public void chooseDanaPensiunOption(){
        $(danaPensiunOption()).click();
    }


}
