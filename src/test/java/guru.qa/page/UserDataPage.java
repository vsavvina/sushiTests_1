package guru.qa.page;

import com.codeborne.selenide.SelenideElement;
import org.openqa.selenium.By;

import java.io.File;

import static com.codeborne.selenide.Selectors.byText;
import static com.codeborne.selenide.Selectors.byXpath;
import static com.codeborne.selenide.Selenide.$;
import static guru.qa.tests.TestData.*;

public class UserDataPage {

    private SelenideElement
            firstNameInput = $("#firstName"),
            lastNameInput = $("#lastName"),
            emailInput = $("#userEmail"),
            ganderInput = $(byText(gander)),
            phoneNumberInput = $(By.id("userNumber")),
            birthInput = $("#dateOfBirthInput"),
            birthMonthInput = $(".react-datepicker__month-select"),
            birthYearInput = $(".react-datepicker__year-select"),
            birthDayInput = $(".react-datepicker__day--0%s:not(.react-datepicker__day--outside-month)"),
            subjectInput = $("#subjectsInput"),
            hobbies1Input = $("#hobbiesWrapper").$(byText(hobbies1)),
            hobbies2Input = $("#hobbiesWrapper").$(byText(hobbies2)),
            hobbies3Input = $("#hobbiesWrapper").$(byText(hobbies3)),
            btnSubmiteInput = $("#submit"),
            pictureInput = $("#uploadPicture"),
            adressInput = $("#currentAddress"),
            findStateInput = $(byXpath("//*[@id=\"state\"]/div/div[2]/div")),
            clickStateInput = $(byText(state)),
            findCityInput =  $(byXpath("//*[@id=\"city\"]/div/div[2]/div")),
            clickCityInput = $(byText(city));

    public UserDataPage typeName(String value) {
        firstNameInput.setValue(value);
        return this;
    }
    public UserDataPage typeSurename(String value) {
        lastNameInput.setValue(value);
        return this;
    }
    public UserDataPage typeEmail(String value) {
        emailInput.setValue(value);
        return this;
    }
    public void typeGander() {
        ganderInput.click();
    }

    public UserDataPage typePhoneNumber(String value) {
        phoneNumberInput.setValue(value);
        return this;
    }
    public void setDate(String day, String month, String year) {
        birthInput.click();
        birthMonthInput.selectOption(month);
        birthYearInput.selectOption(year);
            String selector1 = ".react-datepicker__day--0%s:not(.react-datepicker__day--outside-month)";
            String formatedSelector = String.format(selector1, day);
        $(formatedSelector).click();
    }
    public UserDataPage typeSubject(String value) {
        subjectInput.setValue(value).pressEnter();
        return this;
    }
    public void typeHobbies1() {
        hobbies1Input.click();
    }
    public void typeHobbies2() {
        hobbies2Input.click();
    }
    public void typeHobbies3() {
        hobbies3Input.click();
    }
    public void scroll() {
        btnSubmiteInput.scrollIntoView(true);
    }
    public UserDataPage typePicture(String value) {
        pictureInput.uploadFile(new File(value));
        return this;
    }
    public UserDataPage typeAdress(String value) {
        adressInput.setValue(value);
        return this;
    }
    public void stateType() {
        findStateInput.click();
        clickStateInput.click();
    }
    public void cityType() {
        findCityInput.click();
        clickCityInput.click();
    }
    public void clickBtn() {
        btnSubmiteInput.click();
    }
}
