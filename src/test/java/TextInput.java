import org.openqa.selenium.By;

/**
 * Created by Liudmyla.Ievdokymova on 4/27/2015.
 */
public class TextInput extends Element{
 //   protected By by;
    public TextInput (By by){
        this.by = by;
    }

    public void sendKey(String value){
        element().clear();
        element().sendKeys(value);
    }
}
