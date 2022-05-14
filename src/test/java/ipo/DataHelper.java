package ipo;

import com.github.javafaker.Faker;
import lombok.Value;

public class DataHelper {

    @Value
    public static class UserInfo {
        private String eMail;
        private String phoneNumber;
    }

    public static UserInfo getInfoForUsers() {
        Faker faker = new Faker();
        var randomEMail = faker.internet().emailAddress();
        var randomNumber = faker.phoneNumber().phoneNumber();
        return new UserInfo(randomEMail, randomNumber);

    }
}
