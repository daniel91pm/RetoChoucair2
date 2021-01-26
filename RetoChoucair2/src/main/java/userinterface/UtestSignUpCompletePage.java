package userinterface;

import net.serenitybdd.screenplay.targets.Target;
import org.openqa.selenium.By;

public class UtestSignUpCompletePage {
    public static final Target PASSWORD_FIELD = Target.the("Fill the password field")
            .located(By.id("password"));
    public static final Target CONFIRM_PASSWORD = Target.the("Confirm Password")
            .located(By.id("confirmPassword"));
    public static final Target CB_TERM_CONDITIONS = Target.the("Checkbox T&C")
            .located(By.id("termOfUse"));
    public static final Target CB_PRIVACY_POLICY = Target.the("Checkbox Privacy Policy")
            .located(By.id("privacySetting"));
    public static final Target BUTTON_COMPLETE = Target.the("Complete button")
            .located(By.id("laddaBtn"));

}
