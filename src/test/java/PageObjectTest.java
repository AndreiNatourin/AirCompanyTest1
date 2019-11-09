import org.junit.jupiter.api.Test;
import pages.BaseFunc;
import pages.HomePage;
import pages.RegistrationPage;

public class PageObjectTest {

    private BaseFunc baseFunc = new BaseFunc();

    @Test
    public void poTest() {
        baseFunc.goToUrl("http://qaguru.lv:8089/tickets/");

        HomePage homePage = new HomePage(baseFunc);
        homePage.selectFromAirport("RIX");
        homePage.selectToAirport("MEL");
        homePage.clickGoGoBtn();

        RegistrationPage registrationPage = new RegistrationPage(baseFunc);
        //input data
        //click book
        registrationPage.clickBook();
    }
}
