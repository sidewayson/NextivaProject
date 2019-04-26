package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.PageFactory;


public class LoginPage {

    public LoginPage(WebDriver driver) {
        PageFactory.initElements(driver, this);
    }

    @FindBy(how = How.LINK_TEXT, using = "VoIP Phone Systems")
    public WebElement voipProducts;

    @FindBy(how = How.XPATH, using = "//*[@id=\"nextos-voice\"]/div[2]/section[1]/div[2]/a[1]")
    public WebElement OfficeProducts;

    @FindBy(how = How.NAME, using = "Login")
    public WebElement btnLogin;

    public void ClickProduct()
    {
        voipProducts.click();
    }

    public void ClickOfficeProduct()
    {

        OfficeProducts.click();
    }

    public void ClickLogin()
    {
        btnLogin.submit();
    }


}
