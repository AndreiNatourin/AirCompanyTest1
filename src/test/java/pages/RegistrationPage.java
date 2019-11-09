package pages;

import org.openqa.selenium.By;

public class RegistrationPage {
    private BaseFunc baseFunc;

    private final By REG_NAME = By.xpath(".//input[@id='name']");
    private final By REG_SURNAME = By.xpath(".//input[@id='surname']");
    private final By REG_DISCOUNT = By.xpath(".//input[@id='discount']");
    private final By REG_ADULTS = By.xpath(".//input[@id='adults']");
    private final By REG_CHILDREN = By.xpath(".//input[@id='children']");
    private final By REG_LUGGAGE = By.xpath(".//input[@id='bugs']");
    private final By REG_FLIGHT = By.xpath(".//select[@id='flight']");
    private final By BOOK_FLIGHT = By.xpath(".//span[@id='book2']");

    public RegistrationPage(BaseFunc baseFunc) { //konstruktor
        this.baseFunc = baseFunc;
    }
}
