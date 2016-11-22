import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

/**
 * Created by Viktor.B on 11/21/2016.
 */
public class NewList extends MainPage {

    public NewList(WebDriver driver){
        super(driver);
    }

    @FindBy(xpath = "//div[@class='block-overflow']//input[@class='form-control ng-pristine ng-untouched ng-empty ng-invalid ng-invalid-required']")
    public WebElement productListNameIsRequired;

    @FindBy(xpath = "//div[@class='block-overflow']//input[@class='form-control ng-pristine ng-untouched ng-empty ng-valid-min ng-invalid ng-invalid-required ng-valid-pattern']")
    public WebElement productAmount;

    @FindBy(xpath = ".//*[@id='burton-custom-freestyle-151']/div[1]/div/div/div[4]/div/div/div/div/form/button")
    public WebElement buttonSave;

    @FindBy(xpath = "//div[@id='product-list']//button[@ng-click='showModal()']")
    public WebElement linlCreateNewList;

    @FindBy(xpath = "//div[@class='form-group']//input[@class='form-control ng-pristine ng-untouched ng-empty ng-invalid ng-invalid-required']")
    public WebElement fieldEnterListName;

    @FindBy(xpath = "//div[@class='form-group']//button[@class='btn btn-modal']")
    public WebElement buttonSaveList;
}
