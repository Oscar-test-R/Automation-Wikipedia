package tests;

import org.testng.Assert;
import org.testng.annotations.Optional;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;
import pages.HomePage;
import pages.ResultPage;

import static org.testng.Assert.assertTrue;

public class SearchText extends BaseTest{
    HomePage homepage;
    ResultPage resultPage;
    @Test (dataProvider = "data")
    public void searchText (String textToSearch){
        homepage = loadFirstPage();
        homepage.inputTextSearch(textToSearch);
        resultPage = homepage.clickSearchButton();
        assertTrue(resultPage.isTitleCorrect(textToSearch),"The title does not match");
        Assert.assertEquals(driver.getDriver().getCurrentUrl(),"https://es.wikipedia.org/wiki/Globant");
    }
}
