package tasks;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.Tasks;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.actions.Enter;
import net.serenitybdd.screenplay.actions.SelectFromOptions;
import net.serenitybdd.screenplay.actions.SendKeys;
import net.serenitybdd.screenplay.matchers.WebElementStateMatchers;
import net.serenitybdd.screenplay.waits.WaitUntil;
import org.openqa.selenium.Keys;
import userinterface.UtestSignUpAddressPage;
import userinterface.UtestSignUpCompletePage;
import userinterface.UtestSignUpDevicesPage;
import userinterface.UtestSignUpPersonalPage;

public class Register implements Task {

    private UtestSignUpPersonalPage utestSignUpPersonalPage;
    private String strName;
    private String strLastName;
    private String strEmail;
    private String strBirthMonth;
    private String strBirthDay;
    private String strBirthYear;
    private String strCity;
    private String strPostalCode;
    private String strPassword;

    public Register(String strName, String strLastName, String strEmail, String strBirthMonth, String strBirthDay, String strBirthYear, String strCity, String strPostalCode, String strPassword) {
        this.strName = strName;
        this.strLastName = strLastName;
        this.strEmail = strEmail;
        this.strBirthMonth = strBirthMonth;
        this.strBirthDay = strBirthDay;
        this.strBirthYear = strBirthYear;
        this.strCity = strCity;
        this.strPostalCode = strPostalCode;
        this.strPassword = strPassword;

    }

    public static Register the(String strName, String strLastName, String strEmail, String strBirthMonth, String strBirthDay, String strBirthYear, String strCity, String strPostalCode, String strPassword) {
        return Tasks.instrumented(Register.class, strName, strLastName, strEmail, strBirthMonth, strBirthDay, strBirthYear, strCity, strPostalCode, strPassword);
    }

    @Override
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(Enter.theValue(strName).into(UtestSignUpPersonalPage.NAME_FIELD),
                Enter.theValue(strLastName).into(UtestSignUpPersonalPage.LAST_NAME),
                Enter.theValue(strEmail).into(UtestSignUpPersonalPage.EMAIL),
                SelectFromOptions.byVisibleText(strBirthMonth).from(UtestSignUpPersonalPage.SELECT_MONTH),
                SelectFromOptions.byVisibleText(strBirthDay).from(UtestSignUpPersonalPage.SELECT_DAY),
                SelectFromOptions.byVisibleText(strBirthYear).from(UtestSignUpPersonalPage.SELECT_YEAR),
                Click.on(UtestSignUpPersonalPage.BUTTON_TO_LOCATION),
                WaitUntil.the(UtestSignUpAddressPage.BUTTON_TO_DEVICES, WebElementStateMatchers.isVisible()),
                Enter.theValue(strCity).into(UtestSignUpAddressPage.CITY_FIELD),
                SendKeys.of(Keys.ARROW_DOWN).into(UtestSignUpAddressPage.CITY_FIELD),
                Enter.theValue(strPostalCode).into(UtestSignUpAddressPage.POSTAL_CODE),
                Click.on(UtestSignUpAddressPage.BUTTON_TO_DEVICES),
                Click.on(UtestSignUpDevicesPage.BUTTON_TO_LAST_STEP),
                Enter.theValue(strPassword).into(UtestSignUpCompletePage.PASSWORD_FIELD),
                Enter.theValue(strPassword).into(UtestSignUpCompletePage.CONFIRM_PASSWORD),
                WaitUntil.the(UtestSignUpCompletePage.BUTTON_COMPLETE, WebElementStateMatchers.isVisible()),
                Click.on(UtestSignUpCompletePage.CB_TERM_CONDITIONS),
                Click.on(UtestSignUpCompletePage.CB_PRIVACY_POLICY)




        );
    }
}
