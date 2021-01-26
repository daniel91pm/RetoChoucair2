package userinterface;

import net.serenitybdd.screenplay.targets.Target;
import org.openqa.selenium.By;

public class UtestSignUpDevicesPage {
    public static final Target BUTTON_TO_LAST_STEP = Target.the("Located next Step: Location")
            .located(By.xpath("(//*[text()='Next: Last Step'])"));
}
