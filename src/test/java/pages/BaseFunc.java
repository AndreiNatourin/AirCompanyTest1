package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class BaseFunc {
    private WebDriver driver;

    public BaseFunc() {
        System.setProperty("webdriver.chrome.driver", "C:/chromedriver.exe");
        driver = new ChromeDriver();
        driver.manage().window().maximize();
    }

    public void goToUrl(String url) {
        if (url.startsWith("http://") || url.startsWith("https://")) {

        } else {
            url = "http://" + url;
        }
        driver.get(url);
    }
   //public WebElement getElement(By locator) {
   //     return driver.findElement(locator);

        public void selectByText(By locator, String text){
            Select select = new Select(driver.findElement(locator));
            select.selectByVisibleText(text);
        }
        public void clickButton (By go) {
        driver.findElement(go).click();
        }
    }


    //public void click(By){
    //driver.findElement().click();

//    public void click (By BOOK_FLIGHT) {
 //       driver.findElement(BOOK_FLIGHT).click();


  //  public void click(By BOOK_SEATS){
  //      driver.findElement(BOOK_SEATS).click();




