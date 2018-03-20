package rough;

import pages.HomePage;
import pages.LoginPage;

/**
 * Created by s.milaserdov on 12/13/2017.
 */
public class FirstTest {
    public static void main(String[] args) {


        HomePage page = new HomePage();
        //page.goToLogin();
        page.goToSignIn();


        LoginPage lp = new LoginPage();
        lp.doLogin("trainer@gmail.com", "123456");


    }
}
