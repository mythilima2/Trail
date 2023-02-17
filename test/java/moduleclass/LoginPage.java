package moduleclass;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.BeforeTest;

public class LoginPage {
    WebDriver driver;
    public LoginPage(WebDriver dr){
        PageFactory.initElements(dr,this);
        this.driver=dr;
    }
    By search=By.cssSelector("#inputValEnter");
    By searchButton = By.cssSelector("span.searchTextSpan") ;
    By selectProduct = By.linkText("UrbanMark Men Comfortable Chunky Lace-Up Shoes- Grey");
   // @FindBy(css = "span.searchTextSpan")
    //WebElement searchbutton1;




    @BeforeTest
    public void  searchProducts(){
        driver.findElement(search).sendKeys("shoes");
        driver.findElement(searchButton).click();
        driver.findElement(selectProduct).click();
    }
}
