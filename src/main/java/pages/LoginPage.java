package pages;

import static com.codeborne.selenide.Selectors.byClassName;
import static com.codeborne.selenide.Selectors.byName;
import static com.codeborne.selenide.Selenide.$;
import static com.codeborne.selenide.Selenide.open;


public class LoginPage {

    public void visit() {
        open("https://wallethub.com/");
    }

    public void logIn(String email, String pass) {
        $(byClassName("login")).click();
        $(byName("em")).setValue(email).pressTab();
        $(byName("pw")).setValue(pass).pressTab();
        $(byClassName("track")).click();
        $(byClassName("btns")).click();
    }
}
