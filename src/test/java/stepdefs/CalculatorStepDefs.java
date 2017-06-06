package stepdefs;

import cucumber.api.PendingException;
import cucumber.api.java8.En;

public class CalculatorStepDefs implements En {
    public CalculatorStepDefs() {
        When("^I add (\\d+) and (\\d+)$", (Integer number1, Integer number2) -> {
            // Write code here that turns the phrase above into concrete actions
            throw new PendingException();
        });
    }
}
