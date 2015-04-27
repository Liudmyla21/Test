import javax.xml.soap.Text;

/**
 * Created by Liudmyla.Ievdokymova on 4/27/2015.
 */
public class LoginPage {
    public TextInput loginField = new TextInput(Locators.LOGIN);
    public TextInput passwordField = new TextInput(Locators.PASSWORD);
    public Button authButton = new Button(Locators.AUTH__BUTTON);

    public LoginPage fillInLoginPage(String login){
        loginField.sendKey(login);
        return this;
    }

    public LoginPage fillInPasswordPage(String password){
        passwordField.sendKey(password);
        return this;
    }

    public LoginPage clickAuth(){
        authButton.click();
        return this;
    }

    public String getPageTitle(){
        return ConfigurationManager.getDriver().getTitle();
    }

    public LoginPage fillInLoginForm(String login, String password){
        return fillInLoginPage(login).fillInPasswordPage(password).clickAuth();
    }
}
