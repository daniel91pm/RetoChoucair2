package userinterface;

import net.serenitybdd.screenplay.targets.Target;
import org.openqa.selenium.By;

public class UtestSignUpAddressPage {
    public static final Target CITY_FIELD = Target.the("Fill City field")
            .located(By.id("city"));
    public static final Target POSTAL_CODE = Target.the("Fill PostalCode")
            .located(By.id("zip"));
    public static final Target BUTTON_TO_DEVICES = Target.the("Located next Step: Devices")
            .located(By.xpath("(//*[text()='Next: Devices'])"));
}
