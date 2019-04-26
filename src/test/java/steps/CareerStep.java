package steps;

import Base.BaseUtil;
import cucumber.api.DataTable;
import cucumber.api.PendingException;
import cucumber.api.java.en.And;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import org.junit.Assert;
import org.openqa.selenium.By;
import pages.CareersPage;
import java.util.ArrayList;
import java.util.List;


public class CareerStep extends BaseUtil{

    private  BaseUtil base;

    public CareerStep(BaseUtil base) {
        this.base = base;
    }


    @And("^I click on careers$")
    public void iClickCareers() throws Throwable {
        CareersPage page = new CareersPage(base.Driver);
        base.Driver.get("https://www.nextiva.com/company/careers.html");
        page.ClickJob();
    }






}
