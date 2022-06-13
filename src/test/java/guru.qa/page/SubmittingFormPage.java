package guru.qa.page;

import com.codeborne.selenide.Condition;
import com.codeborne.selenide.SelenideElement;

import static com.codeborne.selenide.Condition.text;
import static com.codeborne.selenide.Selenide.$;
import static com.codeborne.selenide.Selenide.$x;
import static guru.qa.tests.TestData.*;
import static guru.qa.tests.PracticeFormWithPageObjects.*;

public class SubmittingFormPage {

    private SelenideElement
            visibleTable = $(".modal-content"),
            visibleName = $x("//td[text()='Student Name']/following-sibling::td"),
            visibleEmail = $x("//td[text()='Student Email']/following-sibling::td"),
            visibleGander = $x("//td[text()='Gender']/following-sibling::td"),
            visibleMobile = $x("//td[text()='Mobile']/following-sibling::td"),
            visibleBirthDay = $x("//td[text()='Date of Birth']/following-sibling::td"),
            visibleSubject = $x("//td[text()='Subjects']/following-sibling::td"),
            visibleHobbies = $x("//td[text()='Hobbies']/following-sibling::td"),
            visiblePicture = $x("//td[text()='Picture']/following-sibling::td"),
            visibleAddress = $x("//td[text()='Address']/following-sibling::td"),
            visibleStateCity = $x("//td[text()='State and City']/following-sibling::td");

    public void tableVisible () {
        visibleTable.shouldBe(Condition.visible);
    }
    public void nameIsCorrect(String value1, String value2) {
        visibleName.shouldHave(text(value1 + " " + value2));
    }
    public void emailIsCorrect(String value) {
        visibleEmail.shouldHave(text(value));
    }
    public void ganderIsCorrect() {
        visibleGander.shouldHave(text(gander));
    }
    public void mobileIsCorrect(String value) {
        visibleMobile.shouldHave(text(value));
    }
    public void birthDayIsCorrect() {
        visibleBirthDay.shouldHave(text("19 February" + "," + "1998"));
    }
    public void subjectIsCorrect() {
        visibleSubject.shouldHave(text(subjects1 + ", " + subjects2));
    }
    public void hobbiesIsCorrect() {
        visibleHobbies.shouldHave(text(hobbies1 + ", " + hobbies2 + ", " + hobbies3));
    }
    public void pictureIsCorrect() {
        visiblePicture.shouldHave(text(photo));
    }
    public void addressIsCorrect(String value) {
        visibleAddress.shouldHave(text(value));
    }
    public void stateAndCityIsCorrect() {
        visibleStateCity.shouldHave(text(state + " " + city));
    }
}
