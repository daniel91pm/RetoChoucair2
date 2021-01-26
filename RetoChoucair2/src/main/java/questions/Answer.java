package questions;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Question;
import userinterface.UtestSignUpCompletePage;

public class Answer implements Question<Boolean> {
    private String question;


    public static Answer tothe() {
        return new Answer();
    }

    @Override
    public Boolean answeredBy(Actor actor) {


        boolean result = UtestSignUpCompletePage.BUTTON_COMPLETE.resolveFor(actor).isVisible();
        return result;

    }
}
