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

    public RegistrationPage(BaseFunc baseFunc) { //konstruktor
        this.baseFunc = baseFunc;
    }
}
