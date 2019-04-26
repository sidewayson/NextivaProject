package pages;

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

    public void ClickProduct()
    {
        voipProducts.click();
    }

    public void ClickOfficeProduct()
    {

        OfficeProducts.click();
    }

    public void ClickCareers()
    {
        careers.click();
    }


}
