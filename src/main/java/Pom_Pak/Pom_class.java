package Pom_Pak;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Pom_class {

    public static WebDriver driver;

    public Pom_class(WebDriver driver1){
        this.driver=driver1;
        PageFactory.initElements(driver,this);
    }

    @FindBy(linkText = "Log in")
    private WebElement login;

    @FindBy(xpath = "//input[@id=\"loginusername\"]")
    private WebElement username;

    @FindBy(xpath="//input[@id=\"loginpassword\"]")
    private WebElement password;


    @FindBy(xpath="//button[text()='Log in']")
    private WebElement signin;

    @FindBy(xpath = "//a[normalize-space(text())='Laptops']")
    private WebElement laptop;


    @FindBy(xpath="//a[text()='MacBook air']")
    private WebElement macbook;



    @FindBy(xpath="//a[text()='Add to cart']")
    private WebElement  addtocart;


    public WebElement getLogin() {
        return login;
    }

    public WebElement getUsername() {
        return username;
    }

    public WebElement getPassword() {
        return password;
    }

    public WebElement getSignin() {
        return signin;
    }

    public WebElement getLaptop() {
        return laptop;
    }

    public WebElement getMacbook() {
        return macbook;
    }

    public WebElement getAddtocart() {
        return addtocart;
    }

    public WebElement getCart() {
        return cart;
    }

    public WebElement getPlaceorder() {
        return placeorder;
    }

    @FindBy(xpath="//a[text()='Cart']")
    private WebElement cart;


    @FindBy(xpath="//button[text()='Place Order']")
    private WebElement placeorder;



}
