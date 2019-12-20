
import org.junit.jupiter.api.Test;
import pages.BaseFunc;
import pages.HomePage;
import pages.RegistrationPage;
import pages.SeatsPage;

public class AirCompanyTest {

    @Test
    public void airCmpanyTest() {

        BaseFunc baseFunc = new BaseFunc();

        baseFunc.goToUrl("http://qaguru.lv:8089/tickets/");
        HomePage homePage = new HomePage(baseFunc);
        homePage.selectFromAirport("RIX");
        homePage.selectToAirport("MEL");
        //click Gogogo
        homePage.clickGoGoBtn();

         //input fields
        RegistrationPage registrationPage = new RegistrationPage(baseFunc);
        registrationPage.fillName("Janis");
        registrationPage.fillSurname("Jansons");
        registrationPage.fillDiscount("holiday");
        registrationPage.fillAdults("2");
        registrationPage.fillChildren("1");
        registrationPage.fillLuggage("2");
        registrationPage.selectFlight("13-05-2018");
        // click get price
        registrationPage.clickPrice();
        //click book
        registrationPage.ClickBook();
        //select seat
        SeatsPage seatsPage = new SeatsPage(baseFunc);
        seatsPage.ClickSeat();
        seatsPage.ClickBookSeat();
         //close browser
        baseFunc.closeBrowser();
     }
}
