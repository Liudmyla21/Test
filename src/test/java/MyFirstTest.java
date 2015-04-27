import org.testng.annotations.Test;

import static com.thoughtworks.selenium.SeleneseTestNgHelper.assertEquals;

public class MyFirstTest extends ConfigurationManager {

 //   LoginPage loginPage;

    @Test
    public void testUntitled() throws Exception {
        driver.findElement(Locators.LOGIN).clear();
        driver.findElement(Locators.LOGIN).sendKeys("dfgsdfg");
        driver.findElement(Locators.PASSWORD).clear();
        driver.findElement(Locators.PASSWORD).sendKeys("sdfgsdfg");
        driver.findElement(Locators.AUTH__BUTTON).click();
        assertEquals(driver.getTitle(), "dfgsdfg");
    }

    @Test
    public void testUntitled2() throws Exception {
        Data data = new Data();
        LoginPage loginPage = new LoginPage();
        loginPage.fillInLoginPage(data.getLogin())
                .fillInPasswordPage(data.getPassword())
                .clickAuth();
        assertEquals(loginPage.getPageTitle(), data.getTitle());

//        driver.findElement(Locators.LOGIN).clear();
//        driver.findElement(Locators.LOGIN).sendKeys("dfgsdfg");
//        driver.findElement(Locators.PASSWORD).clear();
//        driver.findElement(Locators.PASSWORD).sendKeys("sdfgsdfg");
//        driver.findElement(Locators.AUTH__BUTTON).click();
    }

}
