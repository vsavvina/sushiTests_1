package guru.qa.tests;

import com.github.javafaker.Faker;
import guru.qa.page.SubmittingFormPage;
import guru.qa.page.UserDataPage;
import org.junit.jupiter.api.Test;

import static guru.qa.tests.TestData.*;

public class PracticeFormWithPageObjects extends TestBase {

    UserDataPage userDataPage = new UserDataPage();
    SubmittingFormPage subFormPage = new SubmittingFormPage();
    Faker faker = new Faker();
    public String name = faker.name().firstName();
    public String surname = faker.name().lastName();
    public String email = faker.internet().emailAddress();
    public String phonenumber = faker.phoneNumber().subscriberNumber(10);
    public String address = faker.address().streetAddress();

   // @Test
    void practiceFormTests() {

        userDataPage.typeName(name);
        userDataPage.typeSurename(surname);
        userDataPage.typeEmail(email);
        userDataPage.typeGander();
        userDataPage.typePhoneNumber(phonenumber);
        userDataPage.setDate(day,month,year);
        userDataPage.typeSubject(subjects1);
        userDataPage.typeSubject(subjects2);
        userDataPage.typeHobbies1();
        userDataPage.typeHobbies2();
        userDataPage.typeHobbies3();
        userDataPage.scroll();
        userDataPage.typePicture(pathpoto);
        userDataPage.typeAdress(address);
        userDataPage.stateType();
        userDataPage.cityType();
        userDataPage.clickBtn();

        subFormPage.tableVisible();
        subFormPage.nameIsCorrect(name, surname);
        subFormPage.emailIsCorrect(email);
        subFormPage.ganderIsCorrect();
        subFormPage.mobileIsCorrect(phonenumber);
        subFormPage.birthDayIsCorrect();
        subFormPage.subjectIsCorrect();
        subFormPage.hobbiesIsCorrect();
        subFormPage.pictureIsCorrect();
        subFormPage.addressIsCorrect(address);
        subFormPage.stateAndCityIsCorrect();
    }
}
