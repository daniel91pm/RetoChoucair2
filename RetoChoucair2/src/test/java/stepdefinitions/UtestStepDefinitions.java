package stepdefinitions;

import cucumber.api.java.Before;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import model.RegisterData;
import net.serenitybdd.screenplay.GivenWhenThen;
import net.serenitybdd.screenplay.actors.OnStage;
import net.serenitybdd.screenplay.actors.OnlineCast;
import questions.Answer;
import tasks.OpenUtest;
import tasks.Register;

import java.util.List;

public class UtestStepDefinitions {

    @Before
    public void setStage() {
        OnStage.setTheStage(new OnlineCast());
    }

    @Given("^than daniel Open Utest Page and try to Click Join Button$")
    public void thanDanielOpenUtestPageAndTryToClickJoinButton() {
        OnStage.theActorCalled("Daniel").wasAbleTo(OpenUtest.thepage());

    }

    @When("^he Fill and complete all register fields$")
    public void heFillAndCompleteAllRegisterFields(List<RegisterData> registerData) {
        OnStage.theActorInTheSpotlight().attemptsTo(Register.the(registerData.get(0).getStrName(), registerData.get(0).getStrLastName(),
                registerData.get(0).getStrEmail(), registerData.get(0).getStrBirthMonth(),
                registerData.get(0).getStrBirthDay(), registerData.get(0).getStrBirthYear(),
                registerData.get(0).getStrCity(), registerData.get(0).getStrPostalCode(),
                registerData.get(0).getStrPassword()
        ));

    }

    @Then("^he finds button complete Register$")
    public void heFindsButtonCompleteRegister() {
        OnStage.theActorInTheSpotlight().should(GivenWhenThen.seeThat(Answer.tothe())
        );

    }

}
