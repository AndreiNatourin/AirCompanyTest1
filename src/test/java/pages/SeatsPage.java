package pages;

import org.openqa.selenium.By;

public class SeatsPage {
    private BaseFunc baseFunc;

    private final By SEAT_NR_1 = By.xpath(".//div[@class='seat'][text()='1']");
    private final By BOOK_SEATS = By.xpath(".//span[@id='book3']");
}
