package moduleclass;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.BeforeTest;

public class SelectingShoe {
    WebDriver driver;
    public SelectingShoe(WebDriver dr){
        PageFactory.initElements(dr,this);
        this.driver=dr;
    }
    By selectshoe= By.xpath("//*[@class='product-title ' and @title='UrbanMark Men Comfortable Chunky Lace-Up Shoes- Grey']");
    @BeforeTest
    public void selectproduct(){
        driver.findElement(selectshoe).click();
    }
}
