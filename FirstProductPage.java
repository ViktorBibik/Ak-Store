import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

/**
 * Created by Viktor.B on 11/21/2016.
 */
public class FirstProductPage extends MainPage {

    public FirstProductPage(WebDriver driver) {
        super(driver);
    }

    @FindBy(xpath = "//input[@id='Quantity']")
    public WebElement changeQuantity;

    @FindBy(xpath = "//button[@id='AddToCart']")
    public WebElement buttonAddToCart;

    @FindBy(xpath = "//div[@itemprop='offers']//button[@class='btn btn-default btn-extended']")
    public WebElement buttonAddToSnapRegistryList;

    @FindBy(xpath = "//div[@class='social-sharing is-clean']//a[@class='share-facebook']")
    public WebElement shareFacebook;

    @FindBy(xpath = "//div[@class='social-sharing is-clean']//a[@class='share-twitter']")
    public WebElement shareTweet;

    @FindBy(xpath = "//div[@class='social-sharing is-clean']//a[@class='share-google']")
    public WebElement shareGoogle;

    @FindBy(xpath = "//div[@class='col-md-12']//button[@class='btn btn-modal ng-scope']")
    public WebElement buttonCreateNewList;


}
