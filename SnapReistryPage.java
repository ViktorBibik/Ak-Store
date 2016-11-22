import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

/**
 * Created by Viktor.B on 11/22/2016.
 */
public class SnapReistryPage extends MainPage {
    public SnapReistryPage(WebDriver driver){
        super(driver);
    }

    @FindBy (xpath = "//button[text()='Buy list']")
    //@FindBy(xpath = ".//*[@id='heading_02c876b3-9923-4ee5-b563-0b900ab96375']/h3/div/button[3]")
    public WebElement buttonBuyList;
}
