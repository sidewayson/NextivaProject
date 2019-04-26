package pages;

import org.junit.Assert;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.PageFactory;


public class HomePage {

    public HomePage(WebDriver driver) {
        PageFactory.initElements(driver, this);
    }

    @FindBy(how = How.LINK_TEXT, using = "VoIP Phone Systems")
    public WebElement voipProducts;

    @FindBy(how = How.XPATH, using = "//*[@id=\"nextos-voice\"]/div[2]/section[1]/div[2]/a[1]")
    public WebElement OfficeProducts;

    @FindBy(how = How.XPATH, using = "//*[@id=\"home\"]/footer/div[2]/div[2]/ul[5]/li[5]/a")
    public WebElement careers;

    @FindBy(how = How.XPATH, using = "//*[@id=\"plans-and-pricing\"]/div/div[2]/section/div/div/span[1]/div/span[2]/span[2]")
    public WebElement officePro;

    @FindBy(how = How.XPATH, using = "//*[@id=\"plans-and-pricing\"]/div/div[2]/section/div/div/span[2]/div/span[2]")
    public WebElement officeProPlus;

    @FindBy(how = How.XPATH, using = "//*[@id=\"plans-and-pricing\"]/div/div[2]/section/div/div/span[3]/div/span[2]")
    public WebElement officeEnterprise;

    public void ClickProduct()
    {
        voipProducts.click();
    }

    public void ClickOfficeProduct()
    {

        OfficeProducts.click();
    }

    public void VerifyPrices()
    {
        Assert.assertTrue(officePro.getText().contains("19.95"));
        Assert.assertTrue(officeProPlus.getText().contains("20.95"));
        Assert.assertTrue(officeEnterprise.getText().contains("27.95"));
    }



}
