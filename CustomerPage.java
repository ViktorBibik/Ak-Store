import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

/**
 * Created by Viktor.B on 11/22/2016.
 */
public class CustomerPage extends MainPage {
    public CustomerPage(WebDriver driver){
        super(driver);
    }
    @FindBy(xpath = "//div[@id='CustomerLoginForm']//a[@href='https://ak-store-4.myshopify.com']")
    public WebElement linkReturnToStore;
}
