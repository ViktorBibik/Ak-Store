import org.openqa.selenium.By;
import org.openqa.selenium.Cookie;
import org.openqa.selenium.Keys;
import org.openqa.selenium.firefox.FirefoxBinary;
import org.openqa.selenium.firefox.FirefoxProfile;
import org.testng.Assert;
import org.testng.annotations.BeforeClass;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.Test;


import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.sql.Time;
import java.util.Set;
import java.util.concurrent.TimeUnit;

/**
 * Created by Viktor.B on 11/21/2016.
 */
public class MainClass {
    public static WebDriver driver;



    @BeforeClass
    public void setUp() throws Exception {

        System.setProperty("webdriver.gecko.driver","C:\\Users\\Viktor.B\\Desktop\\Screen Shots\\geckodriver.exe");

        File pathToBinary = new File("C:\\Users\\Viktor.B\\AppData\\Local\\Mozilla Firefox\\firefox.exe");
        FirefoxBinary ffBinary = new FirefoxBinary(pathToBinary);
        FirefoxProfile firefoxProfile = new FirefoxProfile();
        driver = new FirefoxDriver(ffBinary,firefoxProfile);

        //driver = new FirefoxDriver();
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
    }

    @Test
    public void addProductToCart() throws InterruptedException {
        driver.get("https://ak-store-4.myshopify.com");

        MainPage mainPage = new MainPage(driver);
        CatalogPage catalogPage = new CatalogPage(driver);
        FirstProductPage firstProductPage = new FirstProductPage(driver);
        NewList newList = new NewList(driver);
        SnapReistryPage snapReistryPage = new SnapReistryPage(driver);
        CartPage cartPage = new CartPage(driver);
        CustomerPage customerPage = new CustomerPage(driver);

        mainPage.linkCatalog.click();
        catalogPage.firstProduct.sendKeys(Keys.RETURN);


        Thread.sleep(6000);
        firstProductPage.changeQuantity.sendKeys("25");
        firstProductPage.buttonAddToSnapRegistryList.click();

        Thread.sleep(6000);
        firstProductPage.buttonCreateNewList.click();
        newList.productListNameIsRequired.sendKeys("FirstList");
        newList.productAmount.sendKeys("123");
        newList.buttonSave.click();

        Thread.sleep(6000);
        driver.get("https://ak-store-4.myshopify.com");
        firstProductPage.linkSnapRegistry.click();
        snapReistryPage.buttonBuyList.click();

        Thread.sleep(6000);
        mainPage.linkCart.click();
        cartPage.buttonCheckOut.click();
        customerPage.linkReturnToStore.click();

        String body = driver.findElement(By.xpath("//div[@class='header-bar__right large--display-table-cell']//span[@class='cart-count header-bar__cart-count']")).getText();
        Assert.assertEquals(body, "123");

        getCookies();
        //createNewList();
    }

   /*
    public void createNewList(){
        MainPage mainPage = new MainPage(driver);
        NewList newList = new NewList(driver);
        //add new Product List
        mainPage.linkSnapRegistry.click();
        newList.linlCreateNewList.click();
        newList.fieldEnterListName.sendKeys("Second List");
        newList.buttonSaveList.click();
    }
    */
   public static void getCookies(){

       Set<Cookie> cookies = driver.manage().getCookies();
       System.out.println("Size of Cookies :" + cookies.size());

       for(Cookie cookie:cookies){
           System.out.println(cookie.getName() + ": " + cookie.getValue()+ ": " + cookie.getDomain()+ ": " + cookie.getExpiry()+ ": " + cookie.getPath());
       }
       driver.manage().deleteAllCookies();
       System.out.println("Size of Cookies :" + cookies.size());
   }

}
