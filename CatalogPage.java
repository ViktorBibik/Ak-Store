import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

/**
 * Created by Viktor.B on 11/21/2016.
 */
public class CatalogPage extends MainPage {

    public CatalogPage(WebDriver driver) {
        super(driver);
    }

    @FindBy(xpath = "//select[@id='SortBy']")
    public WebElement rangingDroupDownList;

    @FindBy(xpath = "//div[@class='grid__item small--one-half medium--one-third large--one-third']//a[@href='/products/burton-custom-freestyle-151']")
    public  WebElement firstProduct;

    @FindBy(xpath = "//a[@class='grid-link text-center'][@href='/products/electronic-product']")
    public  WebElement secondProduct;

    @FindBy(xpath = "//a[@class='grid-link text-center'][@href='/products/electronic-product-3']")
    public  WebElement thirdtProduct;

    @FindBy(xpath = "//a[@class='grid-link text-center'][@href='/products/product-4']")
    public  WebElement lastProduct;
}
