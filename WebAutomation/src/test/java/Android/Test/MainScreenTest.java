package Android.Test;

import org.testng.annotations.Test;

public class MainScreenTest extends BaseTest{
    @Test
    public void loginScreenTest() {
        this.mainScreen.clickLoginButton();
    }
}
