package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class HomePage extends BasePage{
public HomePage (WebDriver driver){
        super(driver);
    }
@FindBy(id = "searchInput")
    private WebElement searchInput;
@FindBy(css = "[type='submit']")
    private WebElement searchButton;
public HomePage inputTextSearch (String searchText){
    searchInput.sendKeys(searchText);
    return this;
}
public ResultPage clickSearchButton (){
    searchButton.click();
    return new ResultPage(super.getDriver());
}
}
