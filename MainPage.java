import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

/**
 * Created by Viktor.B on 11/21/2016.
 */
public class MainPage {
    public MainPage(WebDriver driver) {

        PageFactory.initElements(driver, this);
    }

    @FindBy(xpath = "//div[@class='grid--full medium-down--hide']//a[@href='/']")
    public WebElement linkHome;

    @FindBy(xpath = "//div[@class='grid--full medium-down--hide']//a[@href='/collections/all']")
    public WebElement linkCatalog;

    @FindBy(xpath = "//div[@class='grid--full medium-down--hide']//a[@href='/blogs/news']")
    public WebElement linkBlog;

    @FindBy(xpath = "//div[@class='grid--full medium-down--hide']//a[@href='/pages/about-us']")
    public WebElement linkAboutUs;

    @FindBy(xpath = "//div[@class='grid--full medium-down--hide']//a[@href='/pages/snap-registry']")
    public WebElement linkSnapRegistry;

    @FindBy (xpath = "//a[@class='cart-page-link']//span[@class='icon icon-cart header-bar__cart-icon']")
    public WebElement linkCart;
}
