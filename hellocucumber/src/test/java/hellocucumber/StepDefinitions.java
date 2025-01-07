package hellocucumber;

import static org.junit.jupiter.api.Assertions.assertEquals;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.When;
import io.cucumber.java.en.Then;

public class StepDefinitions {

    // La méthode de la classe IsItFriday qui retourne "TGIF" si c'est vendredi, sinon "Nope"
    static class IsItFriday {
        static String isItFriday(String today) {
            return "Friday".equals(today) ? "TGIF" : "Nope";
        }
    }

    // Variables pour stocker l'entrée du jour et la réponse réelle
    String today;
    String actualAnswer;

    // Step pour le Given: Aujourd'hui c'est le jour spécifié
    @Given("today is {string}")
    public void today_is(String day) {
        today = day; // On définit aujourd'hui avec la valeur passée dans le scénario
    }

    // Step pour le When: Demander si c'est vendredi
    @When("I ask whether it's Friday yet")
    public void i_ask_whether_it_s_friday_yet() {
        actualAnswer = IsItFriday.isItFriday(today); // On appelle la méthode isItFriday pour obtenir la réponse
    }

    // Step pour le Then: Vérifier la réponse
    @Then("I should be told {string}")
    public void i_should_be_told(String expectedAnswer) {
        assertEquals(expectedAnswer, actualAnswer); // Vérification que la réponse est celle attendue
    }
}
