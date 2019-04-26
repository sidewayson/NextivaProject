package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.PageFactory;
import org.junit.Assert;
import org.openqa.selenium.support.ui.Select;
public class CareersPage {

    public CareersPage(WebDriver driver) {
        PageFactory.initElements(driver, this);
    }

    @FindBy(how = How.XPATH, using = "//*[@id=\"opt-ct\"]/div[3]/div/a[42]")
    public WebElement srQaEngineer;
    @FindBy(how = How.ID, using = "apply_button")
    public WebElement applyNow;
    @FindBy(how = How.ID, using = "first_name")
    public WebElement firstName;
    @FindBy(how = How.ID, using = "last_name")
    public WebElement lastName;
    @FindBy(how = How.ID, using = "email")
    public WebElement email;
    @FindBy(how = How.ID, using = "phone")
    public WebElement phoneNumber;
    @FindBy(how = How.ID, using = "job_application_location")
    public WebElement location;
    @FindBy(how = How.ID, using = "job_application_answers_attributes_1_text_value")
    public WebElement webSite;
    @FindBy(how = How.ID, using = "job_application_answers_attributes_0_text_value")
    public WebElement linkedinProfile;
    @FindBy(how = How.ID, using = "job_application_answers_attributes_3_boolean_value")
    public WebElement visaQuestion;
    @FindBy(how = How.ID, using = "submit_app")
    public WebElement submit_app;
    WebDriver driver;





    public void ClickJob()
    {
        srQaEngineer.click();
    }


    public void ClickAndFillOut(){
        firstName.sendKeys("Chip");
        lastName.sendKeys("Larsen");
        email.sendKeys("chipanlarsen@gmail.com");
        phoneNumber.sendKeys("4802020667");
        location.sendKeys("Chandler, Arizona, United States");
        webSite.sendKeys("www.linkedin.com");
        linkedinProfile.sendKeys("https://www.linkedin.com/in/chip-larsen/");
        Select visa=new Select(visaQuestion);
        visa.selectByVisibleText("Yes");
        Assert.assertEquals(true, submit_app.isDisplayed());
    }}

