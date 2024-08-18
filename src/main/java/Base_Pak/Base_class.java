package Base_Pak;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.*;
import org.openqa.selenium.support.ui.Select;

import java.io.File;
import java.io.IOException;
import java.time.Duration;

public class Base_class {


    public static WebDriver driver;
    public static JavascriptExecutor js;



    public static void url(WebDriver driver, String s){

        driver.get(s);
    }

    public static void find_elements(WebDriver driver,String a){
        driver.findElements(By.xpath(a));

    }

    public static void close(WebDriver driver){
        driver.close();

    }

    public static void title(WebDriver driver,String b){
        driver.getTitle();

    }

    public static  void Switch(WebDriver driver){
        driver.switchTo();

    }
    public static void credentials(WebElement c, String d){
        c.sendKeys(d);

    }
    public static  void clk( WebElement w) {
        w.click();


    }
    public static void maximize(WebDriver driver){

        driver.manage().window().maximize();
    }
    public static void toscrolldown( WebDriver driver,WebElement ref) {
        js = (JavascriptExecutor) driver;
        js.executeScript("arguments[0].scrollIntoView()", ref);

    }

    public static void todropdownbyvalue(WebElement WE,String SE){


        Select s1 =new Select(WE);
        s1.selectByVisibleText(SE);
    }

    public static void todropdownbyvisibletext(WebElement WE,String S){
        Select s =new Select(WE);
        s.selectByVisibleText(S);


    }

    public static void snapshot(WebDriver driver,String N) throws IOException {
        TakesScreenshot ts=  (TakesScreenshot)driver;
        File src=ts.getScreenshotAs(OutputType.FILE);
        File des=new File("C:\\Users\\Manoj\\IdeaProjects\\DEMO-NEW\\src\\test\\Screenshot"+N+".png");


        FileUtils.copyFile(src,des);


    }


    public static void accept(WebDriver driver ){
        Alert a= driver.switchTo().alert();
        a.accept();
    }

    public static void dismiss(WebDriver driver ){
        Alert a= driver.switchTo().alert();
        a.dismiss();
    }

    public static void implicitwait(WebDriver driver){
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(13));
    }




























}
