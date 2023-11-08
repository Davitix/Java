package Android.Test;

import Android.util.Driver;
import org.testng.annotations.BeforeTest;
import Android.Screen.MainScreen;

public class BaseTest {
    protected MainScreen mainScreen;
    @BeforeTest
    public void preTest() {
        this.mainScreen = new MainScreen(new Driver().getDriver());
    }
}

