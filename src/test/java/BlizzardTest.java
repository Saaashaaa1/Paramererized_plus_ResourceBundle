import driverConfig.Base;
import driverConfig.Language;
import org.junit.After;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;
import pages.BlizzardPage;

import java.util.Arrays;
import java.util.Collection;
import java.util.ResourceBundle;

@RunWith(Parameterized.class)
public class BlizzardTest extends Base {

    BlizzardPage blizzardPage;
    ResourceBundle bundle;
    Language lang;

    @Parameterized.Parameters
    public static Collection options() {
        return Arrays.asList(Language.values());
    }

    public BlizzardTest(Language lang) {
        driver.get("http://" +  "www.blizzard.com/" + lang.getCode()+"/");  //https://www.blizzard.com/it-it/
        this.lang = lang;
        bundle =ResourceBundle.getBundle(lang.getCode());
    }
    @Before
    public void beforeTestMethod() {
        if (blizzardPage == null) {
            blizzardPage = new BlizzardPage(driver);
        }
    }
        @After
        public void afterTestMethod() throws InterruptedException {
            Thread.sleep(1000);
        }
    @Test
    public void checkLearnMore(){
        Assert.assertEquals(blizzardPage.getElement(),bundle.getString("news"));


    }


    @Test
    public void checkTypeOfGame(){
        Assert.assertEquals(blizzardPage.getTypesOfGame(),bundle.getString("typegame"));
    }

    }




