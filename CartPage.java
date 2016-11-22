import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

/**
 * Created by Viktor.B on 11/22/2016.
 */
public class CartPage extends MainPage {
    public  CartPage(WebDriver driver){
        super(driver);
    }
    @FindBy(xpath = "//div[@class='grid__item text-right']//button[@class='btn checkout']")
    public WebElement buttonCheckOut;

    @FindBy(xpath = "//div[@class='grid__item text-right']//button[@class='btn--secondary update-cart']")
    public WebElement buttonUpdateOut;
}
