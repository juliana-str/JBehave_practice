package autotests_project.steps;

import org.jbehave.core.annotations.Given;
import org.jbehave.core.annotations.Then;
import org.jbehave.core.annotations.When;

import java.util.Random;

import static java.lang.Integer.sum;
import static org.junit.Assert.assertEquals;

public class CalculatorSteps {
    private int value1;
    private int value2;
    private String operation;

    @Given("a calculator")
    public void aCalculator() {
    }

    @Given("the calculator has operation")
    public void calculatorHasOperation() {
        operation = "+";
    }

    @When("the user run the calculator")
    public void runTheCalculator() {
        value1 = new Random().nextInt();
        value2 = new Random().nextInt();
    }

    @Then("the result of calculation must be sum of values")
    public void theResultOfCalculationMustBeSumOfValues() {
        assertEquals(sum(value1, value2), value1 + value2);
    }

}
