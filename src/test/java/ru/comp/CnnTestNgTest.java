package ru.comp;

import org.openqa.selenium.support.PageFactory;

import org.testng.Assert;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

import ru.comp.pages.HomePage;
import ru.comp.pages.ResultsPage;
import ru.comp.steps.CnnSteps;

public class CnnTestNgTest extends TestNgTestBase {

    private CnnSteps cnnSteps;

    @BeforeClass
    public void initPageObjects() {

      cnnSteps = new CnnSteps(PageFactory.initElements(driver, HomePage.class),
              PageFactory.initElements(driver, ResultsPage.class));
    }

    @BeforeMethod
    @Parameters({"siteUrl"})
    public void goToHomePage(String siteUrl) {
      driver.get(siteUrl);
    }

    @Test
    @Parameters({"correctQuery"})
    public void testSearchFeatureCorrectQuery(String correctQuery) {
      cnnSteps.CheckSearchQuery(correctQuery, false);
    }

    @Test
    @Parameters({"incorrectQuery"})
    public void testSearchFeatureFoolishQuery(String incorrectQuery) {
      cnnSteps.CheckSearchQuery(incorrectQuery, true);
    }
}
