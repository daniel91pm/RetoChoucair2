package userinterface;

import net.serenitybdd.screenplay.targets.Target;
import org.openqa.selenium.By;

public class UtestSignUpPersonalPage {
    public static final Target NAME_FIELD= Target.the("Fill the User Name")
            .located(By.id("firstName"));
    public static final Target LAST_NAME = Target.the("Fill Last Name")
            .located(By.id("lastName"));
    public static final Target EMAIL = Target.the("Fill Email")
            .located(By.id("email"));
    public  static final  Target SELECT_MONTH = Target.the("select Bitrh Month")
            .located(By.cssSelector("#birthMonth"));
    public static final  Target SELECT_DAY = Target.the("Select Birth Day")
            .located(By.cssSelector("#birthDay"));
    public static final Target SELECT_YEAR  = Target.the("Select Bitrh year")
            .located(By.cssSelector("#birthYear"));
    public static final Target BUTTON_TO_LOCATION = Target.the("Located next Step: Location")
            .located(By.xpath("(//*[text()='Next: Location'])"));

}
