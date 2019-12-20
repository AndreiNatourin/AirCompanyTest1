package pages;

import org.openqa.selenium.By;

public class RegistrationPage {
    private BaseFunc baseFunc;

    private final By REG_NAME = By.id("name");
    private final By REG_SURNAME = By.id("surname");
    private final By REG_DISCOUNT = By.id("discount");
    private final By REG_ADULTS = By.id("adults");
    private final By REG_CHILDREN = By.id("children");
    private final By REG_LUGGAGE = By.id("bugs");
    private final By REG_FLIGHT = By.id("flight");
    private final By BOOK_FLIGHT = By.id("book2");
    private final By PRICE = By.xpath(".//span[contains(@onclick, 'setLang()')]");


    public RegistrationPage(BaseFunc baseFunc) {this.baseFunc = baseFunc;}

    public void waitName () {
        baseFunc.wait(REG_NAME);
    }
    public void fillName(String text) {
        baseFunc.inputInField(REG_NAME, text);
    }
    public void fillSurname(String text) {
        baseFunc.inputInField(REG_SURNAME, text);
    }
    public void fillDiscount(String text) {
        baseFunc.inputInField(REG_DISCOUNT, text);
    }
    public void fillAdults(String text) {
        baseFunc.inputInField(REG_ADULTS, text);
    }
    public void fillChildren(String text) {
        baseFunc.inputInField(REG_CHILDREN, text);
    }
    public void fillLuggage(String text) {
        baseFunc.inputInField(REG_LUGGAGE, text);
    }
    public void selectFlight(String data) {
        baseFunc.selectByText(REG_FLIGHT, data);
    }
    public void clickPrice() {
        baseFunc.clickButton(PRICE);
    }
    public void ClickBook (){
        baseFunc.clickButton(BOOK_FLIGHT);
    }
}
