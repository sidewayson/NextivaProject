package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.PageFactory;
public class CareersPage {

    public CareersPage(WebDriver driver) {
        PageFactory.initElements(driver, this);
    }

    @FindBy(how = How.XPATH, using = "//*[@id=\"opt-ct\"]/div[3]/div/a[42]")
    public WebElement srQaEngineer;



    public void ClickJob()
    {
        srQaEngineer.click();
    }
}
