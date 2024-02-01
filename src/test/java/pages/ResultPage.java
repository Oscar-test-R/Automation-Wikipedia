package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.ExpectedConditions;

public class ResultPage extends BasePage{
    public ResultPage (WebDriver driver){
        super(driver);
    }
    @FindBy(css = ".mw-page-title-main")
    private WebElement resultTitle;
    public boolean isTitleCorrect(String title){
        getWait().until(ExpectedConditions.visibilityOf(resultTitle));
        return resultTitle.isDisplayed() &&
                resultTitle.getText().toLowerCase().equals(title.toLowerCase());
    }
}
