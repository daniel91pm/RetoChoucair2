package tasks;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.Tasks;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.actions.Open;
import userinterface.UtestJoinPage;

public class OpenUtest implements Task {

    private UtestJoinPage utestJoinPage;

    public static OpenUtest thepage(){

        return Tasks.instrumented(OpenUtest.class);
    }

    @Override
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(Open.browserOn(utestJoinPage),
                Click.on(UtestJoinPage.JOIN_BUTTON)
        );
    }
}
