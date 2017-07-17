package com.main;

import com.codeborne.selenide.Configuration;
import org.junit.Test;
import pages.LoginPage;
import pages.TestInsuranceCompanyPage;


public class WalletHubTest {

    static {
        Configuration.timeout = 15000;
        Configuration.browser = "gecko";
    }

    LoginPage loginPage = new LoginPage();
    TestInsuranceCompanyPage testInsuranceCompanyPage = new TestInsuranceCompanyPage();

    @Test
    public void testGmailSendSearch() {

        loginPage.visit();

        loginPage.logIn(TestData.email, TestData.password);

        testInsuranceCompanyPage.openTestInsurance();

        testInsuranceCompanyPage.changeRating();

        testInsuranceCompanyPage.selectPolicy();

        testInsuranceCompanyPage.inputText();

        testInsuranceCompanyPage.assertReview();
    }
}
