package tests;

import myDriver.MyDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.DataProvider;
import pages.HomePage;

public class BaseTest {
    MyDriver driver;
    private String url = "https://wikipedia.org";
@BeforeMethod
    public void beforeMethod(){
    driver = new MyDriver();
    driver.getDriver().manage().window().maximize();
    driver.getDriver().get(url);
}
public HomePage loadFirstPage(){
    return new HomePage(driver.getDriver());
}
@DataProvider(name = "data")
public Object[][] provideData() {
    return new Object[][] {
            {"globant"}
    };
}
@AfterMethod
    public void afterMethod(){
    driver.getDriver().close();
}
}
