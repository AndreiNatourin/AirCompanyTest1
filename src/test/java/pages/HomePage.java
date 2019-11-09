package pages;

import org.openqa.selenium.By;

public class HomePage {
    private BaseFunc baseFunc;

    //private final By TITLE = By.xpath(".//h1[contains(@class, 'headline__title')]");

    private final By FROM = By.xpath(".//select[@id='afrom']");
    private final By TO = By.xpath(".//select[@id='bfrom']");
    private final By GO = By.xpath(".//span[@class='gogogo']");

    private final By LOGO1 = By.xpath(".//span[@class='ryan']");
    private final By LOGO2 = By.xpath(".//span[@class='baltic']");
    private final By MOTO = By.xpath(".//span[@class='moto']");


    public HomePage(BaseFunc baseFunc) { //konstruktor
        this.baseFunc = baseFunc;
    }

    public void selectFromAirport(String from) {
        baseFunc.selectFromDropdown(FROM, from);
    }
    public void selectToAirport(String to) {
        baseFunc.selectFromDropdown(TO, to);
    }
    public void clickGoGoBtn(){
        baseFunc.click(GO);
    }

        //Find WebElement
        //baseFunc.getElements(FROM).click();



        //click

}