package Runner;


import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;
import org.junit.AfterClass;
import org.junit.BeforeClass;
import org.junit.runner.RunWith;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

@RunWith(Cucumber.class)
@CucumberOptions(features = "C:\\Users\\Manoj\\IdeaProjects\\DEMO-NEW\\src\\test\\java\\Feature",glue="Step_Pak",
      dryRun = false,monochrome = false)

public class Runner_Class {

    public static WebDriver driver;


    @BeforeClass
    public static void browseropen(){

        driver =new ChromeDriver();
    }

    @AfterClass

    public static void browserclose(){
        driver.close();
    }
}
