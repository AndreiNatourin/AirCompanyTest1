package pages;

import org.openqa.selenium.By;

public class SeatsPage {
    private BaseFunc baseFunc;

    private final By SEAT_NR_1 = By.xpath(".//div[@class='seat'][text()='1']");
    private final By BOOK_SEATS = By.id("book3");

    public SeatsPage(BaseFunc baseFunc)  {
        this.baseFunc = baseFunc;
    }

    public void waitSeat () {
        baseFunc.wait(SEAT_NR_1);
    }
    public void ClickSeat (){
        baseFunc.clickButton(SEAT_NR_1);
    }
    public void ClickBookSeat(){
        baseFunc.clickButton(BOOK_SEATS);
    }
}
