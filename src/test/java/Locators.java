import org.openqa.selenium.By;

/**
 * Created by Liudmyla.Ievdokymova on 4/24/2015.
 */
public interface Locators {

    By LOGIN = By.id("mailbox__login");
    By PASSWORD = By.id("mailbox__password");
    By AUTH__BUTTON = By.id("mailbox__auth__button");

    By LETTERS = By.cssSelector(".d-letter");
}
