package pages;
//1) Тестов должно быть 4 и более
//2) Реализовать проверку наличия 2 элементов (разных)
//3) Реализовать проверку текста с использованием ResourceBundle
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;
public class BlizzardPage {
    @FindBy (xpath = "//*[@id='masthead_button_0_0']")
    WebElement element;
//    @FindBy(id="download-battlenet")
//    WebElement elementDownloadBattlenet;
    @FindBy(xpath = "//*[@id=\"products-0\"]/div[1]/blz-game-card[10]/p")  //(xpath = "//*[@id='search-icon-legacy']")
    WebElement elementTypeOfGame;

    public BlizzardPage (WebDriver driver){
        PageFactory.initElements(driver, this);
    }
//    public String getTextDownloadBattlenet(){
//        return elementDownloadBattlenet.getText();
//    }

    public String getElement(){
        return element.getText();
    }
    public String getTypesOfGame(){
        return elementTypeOfGame.getText();
    }
}
