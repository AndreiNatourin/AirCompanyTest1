import org.junit.jupiter.api.Test;
import pages.BaseFunc;
import pages.HomePage;
import pages.RegistrationPage;

public class PageObjectTest {

    @Test
    public void poTest() {
        //open browser, maximize
        BaseFunc baseFunc = new BaseFunc();
        //open url
        baseFunc.goToUrl("http://qaguru.lv:8089/tickets/");
        //select departure
        HomePage homePage = new HomePage(baseFunc);
        homePage.selectFromAirport("RIX");
        //select destination
        homePage.selectToAirport("MEL");
        //click Gogogo
 //RegPage
        //input fields
        // click get price
        //click book
        //select seat
        //click book
        //check thank you page
        //close browser



 //       homePage.clickGoGoBtn();

        RegistrationPage registrationPage = new RegistrationPage(baseFunc);
        //input data
        //click book
        //registrationPage.clickBook();
    }
}
