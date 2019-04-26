package steps;

import Base.BaseUtil;
import cucumber.api.Scenario;
import cucumber.api.java.After;
import cucumber.api.java.Before;
import org.openqa.selenium.chrome.ChromeDriver;


public class Hook extends BaseUtil{


    private BaseUtil base;

    public Hook(BaseUtil base) {
        this.base = base;
    }

    @Before
    public void InitializeTest(Scenario scenario) {




        //System.out.println("Opening the browser : Firefox");

        //System.setProperty("webdriver.firefox.marionette", "C:\\Users\\Chip\\Drivers\\geckodriver.exe");
        //base.Driver = new FirefoxDriver();


        //Chrome driver
        System.setProperty("webdriver.chrome.driver", "C:\\Users\\Chip\\Drivers\\chromedriver.exe");
        base.Driver = new ChromeDriver();
    }


    @After
    public void TearDownTest(Scenario scenario) {
        if (scenario.isFailed()) {
            //Take screenshot logic goes here
            System.out.println(scenario.getName());
        }
        System.out.println("Afterhook");
        base.Driver.close();

    }

}
