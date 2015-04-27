import org.openqa.selenium.By;

/**
 * Created by Liudmyla.Ievdokymova on 4/27/2015.
 */
public class Button extends Element{
  //  protected By by;
            public Button (By by){
                this.by = by;
            }

    public void click(){
        element().click();
    }
}
