package ipo.page;

import com.codeborne.selenide.SelenideElement;

import static com.codeborne.selenide.Selenide.$;

public class RegistrationPage {
    private SelenideElement eMail = $("[id  = 'reg-email']");
    private SelenideElement password = $("[id  = 'reg-pass']");
    private SelenideElement repetedPassword = $("[id  = 'reg-dublpass']");
    private SelenideElement name = $("[id  = 'reg-name']");
    private SelenideElement phone = $("[id  = 'reg-phone']");
    private SelenideElement checkboxPrivacy = $("[for = 'regulations-privacy']");
    private SelenideElement checkboxData = $("[for = 'regulations-position']");
    private SelenideElement checkboxOpsWithData = $("[for = 'regulations-personal']");
    private SelenideElement checkboxCommunity = $("[for = 'regulations-code']");
    private SelenideElement button = $(".registation-footer__btn-referral");

    private SelenideElement investSum = $("[id  = 'reg-amount']");
    private SelenideElement company = $("[id  = 'reg-actcompany']");
    private SelenideElement sphere = $("[id  = 'reg-actsphere']");
    private SelenideElement compAdress = $("[id  = 'reg-actadress']");
    private SelenideElement position = $("[id  = 'reg-actposition']");

    private SelenideElement lastName = $("[id  = 'reg-othlastname']");
    private SelenideElement parentName = $("[id  = 'reg-othpatronymic']");
    private SelenideElement status = $("[id  = 'reg-othstatus']");
    private SelenideElement statusOption = $(".registation-body__option");
    private SelenideElement citizenship = $("[id  = 'reg-citizenship']");
    private SelenideElement livingAdress = $("[id  = 'reg-location']");
    private SelenideElement livingCountry = $("[id  = 'reg-country']");
    private SelenideElement inputFile1 = $("[id  = 'reg-pasport']");
    private SelenideElement inputFile2 = $("[id  = 'reg-registration']");
    private SelenideElement lastButton = $(".avatar__btn");
    private SelenideElement profilePhotoButton = $("[for='dropInput']");


    public void createUser(String mail, String number) {
        eMail.setValue(mail);
        password.setValue("123456789");
        repetedPassword.setValue("123456789");
        name.setValue("Bots name");
        phone.setValue(number);
        checkboxCommunity.click();
        checkboxData.click();
        checkboxPrivacy.click();
        checkboxOpsWithData.click();
        button.click();

        investSum.setValue("20000");
        company.setValue("some company");
        sphere.setValue("smth");
        compAdress.setValue("Россия, г Санкт-Петербург, ул Боровая, 5");
        position.setValue("smth to put");
        button.click();

        lastName.setValue("LastName");
        parentName.setValue("parentName");
        status;
        statusOption;
        citizenship.setValue("Российская Федерация");
        livingCountry.setValue("Россия");
        livingAdress.setValue("Россия, г Санкт-Петербург, ул Боровая, 5");
        inputFile1.click();

        inputFile2.click();

        button.click();
        profilePhotoButton.click();

        lastButton.click();
        lastButton.click();
    }

}
