package ipo;

import com.codeborne.selenide.SelenideElement;
import ipo.page.RegistrationPage;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static com.codeborne.selenide.Selenide.$;
import static com.codeborne.selenide.Selenide.open;
import static org.junit.jupiter.api.Assertions.assertEquals;

public class ElementsTest {
    private SelenideElement regResponce = $(".registation__respons-titl");
    @BeforeEach
    void setup() {
        open("https://id.ipo-company.com/registration/?referral=yes&user=4668");
    }

    @Test
    public void create3ndLineUser() {
        DataHelper.UserInfo info = DataHelper.getInfoForUsers();
        var page = new RegistrationPage();
        page.createUser(info., info.);
        var actual = regResponce.getOwnText();
        assertEquals("Данные успешно заполнены", actual);
    }
}
