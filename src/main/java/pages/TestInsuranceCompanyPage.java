package pages;

import com.codeborne.selenide.Condition;

import static com.codeborne.selenide.Selectors.*;
import static com.codeborne.selenide.Selenide.*;


public class TestInsuranceCompanyPage {


    public void openTestInsurance() {
        open("https://wallethub.com/profile/test_insurance_company/");
    }

    public void changeRating() {
        $(byClassName("wh-rating-notes")).hover();
        $$(".wh-rating-choices-holder.hover").get(4).hover();
        $$(".wh-rating-choices-holder .hover").shouldHaveSize(4);
        $$(".wh-rating-choices-holder.hover").get(5).click();
    }

    public void selectPolicy() {
        $(byClassName(".drop-arrow")).click();
        $(byText("Health")).click();
    }

    public void inputText() {
        $(by("#review-content")).click().setValue("Some text. PS. sorry for this I just have no time to make this task well.");
        $(by(".btn.blue")).click();
    }

    public void assertReview(String text) {
        open("https://wallethub.com/profile/Wall_Test1/activity/");
        $(byCssSelector(".activities .feeddesc")).shouldHave(Condition.attribute(text));
    }

}
