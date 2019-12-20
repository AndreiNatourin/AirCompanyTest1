package pages;

import org.openqa.selenium.By;

public class HomePage {
    private BaseFunc baseFunc;

    private final By TITLE = By.xpath(".//h1[contains(@class, 'headline__title')]");
    private final By FROM = By.id("afrom");
    private final By TO = By.id("bfrom");
    private final By GO = By.xpath(".//span[@class='gogogo']");

    private final By LOGO1 = By.xpath(".//span[@class='ryan']");
    private final By LOGO2 = By.xpath(".//span[@class='baltic']");
    private final By MOTO = By.xpath(".//span[@class='moto']");

    public HomePage(BaseFunc baseFunc) {this.baseFunc = baseFunc;}

    public void waitFrom () {
        baseFunc.wait(FROM);
    }
    public void selectFromAirport(String airport) {
        baseFunc.selectByText(FROM, airport);
    }

    public void selectToAirport(String airport) {
        baseFunc.selectByText(TO, airport);
    }

    public void clickGoGoBtn() {
        baseFunc.clickButton(GO);
    }
}

