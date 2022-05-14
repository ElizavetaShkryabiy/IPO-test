package ipo;

public class DataHelper {

    @Value
    public static class UserInfo{
        private String eMail;
        private String phoneNumber;
    }
    public static UserInfo getInfoForUsers(){
        Faker faker = new Faker();
        var randomEMail = faker.;
        var randomNumber = faker.;
        return new UserInfo(randomEMail, randomNumber);

    }
}
