package testpackage;

import com.base.BaseTest;
import moduleclass.LoginPage;
import org.testng.annotations.Test;

public class TestClass extends BaseTest {
LoginPage lp;
    @Test
    public void main(){
       // lp=new LoginPage(driver);

        lp=new LoginPage(driver);
        lp.searchProducts();
    }
}
