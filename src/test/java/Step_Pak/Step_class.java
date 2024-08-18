package Step_Pak;

import Base_Pak.Base_class;
import Pom_Pak.Pom_class;
import Runner.Runner_Class;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.When;
import io.cucumber.java.en.Then;
import org.openqa.selenium.*;
import org.openqa.selenium.support.ui.ExpectedCondition;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.io.IOException;
import java.time.Duration;


public class Step_class extends Base_class {

    WebDriver driver = Runner_Class.driver;
    Pom_class pc=new Pom_class(driver);



    @Given("User launches the url and user is on home page")
    public void user_launches_the_url_and_user_is_on_home_page() {
        url(driver,"https://www.demoblaze.com/index.html");
        maximize(driver);

    }
    @Given("user clicking the  login button")
    public void user_clicking_the_login_button() {

        clk(pc.getLogin());

    }
    @When("I enter a valid username and password")
    public void i_enter_a_valid_username_and_password() {

        implicitwait(driver);

        credentials(pc.getUsername(),"mailformanojkaarthick@gmail.com");
        credentials(pc.getPassword(),"Manoj@638003");

    }
    @When("I click the sign in button")
    public void i_click_the_sign_in_button() {

        clk(pc.getSignin());

    }
    @When("I should see a welcome message and take the screenshot")
    public void i_should_see_a_welcome_message_and_take_the_screenshot() throws IOException {
        implicitwait(driver);

        snapshot(driver,"sign in");

    }
    @When("In categories section click the laptop button")
    public void in_categories_section_click_the_laptop_button() {
        implicitwait(driver);
        WebElement ele = driver.findElement(By.xpath("//a[text()='Laptops']"));
        JavascriptExecutor js=(JavascriptExecutor) driver;
        js.executeScript("arguments[0].click()",ele);













        //WebDriverWait wait =new WebDriverWait(driver, Duration.ofSeconds(10));




        //wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//a[normalize-space(text())='Laptops']")));




        //clk(pc.getLaptop());



    }
    @Then("click the Macbook air")
    public void click_the_macbook_air() {
        implicitwait(driver);

        WebElement ele1 = driver.findElement(By.linkText("MacBook air"));

        JavascriptExecutor js=(JavascriptExecutor) driver;
        js.executeScript("arguments[0].click()",ele1);

//        WebDriverWait wait =new WebDriverWait(driver, Duration.ofSeconds(25));
//       WebElement click= wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//a[text()='MacBook air']")));
//
//
//
//        clk(pc.getMacbook());

    }
    @Then("click Add to cart button")
    public void click_add_to_cart_button() {
        implicitwait(driver);

        clk(pc.getAddtocart());


    }
    @Then("handle the alert")
    public void handle_the_alert() {
        implicitwait(driver);
        WebDriverWait wait = new WebDriverWait(driver,Duration.ofSeconds(15));
        Alert alert = wait.until(ExpectedConditions.alertIsPresent());
        accept(driver);

    }
    @Then("click on cart and check the products are added")
    public void click_on_cart_and_check_the_products_are_added() {

        implicitwait(driver);

        clk(pc.getCart());

    }
    @Then("click on place the order button")
    public void click_on_place_the_order_button() {
        implicitwait(driver);

        clk(pc.getPlaceorder());

    }



}
