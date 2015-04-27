import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

/**
 * Created by Liudmyla.Ievdokymova on 4/27/2015.
 */
public abstract class Element {
    protected By by;

    public WebElement element(){
        return ConfigurationManager.getDriver().findElement(by);
    }
}
