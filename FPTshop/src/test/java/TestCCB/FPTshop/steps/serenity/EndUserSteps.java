package TestCCB.FPTshop.steps.serenity;

import TestCCB.FPTshop.pages.DictionaryPage;
import net.thucydides.core.annotations.Step;
import net.thucydides.core.steps.ScenarioSteps;

import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.Matchers.containsString;
import static org.hamcrest.Matchers.hasItem;

public class EndUserSteps {

    DictionaryPage dictionaryPage;

    @Step
    public void enters(String keyword) {
        
    }

    @Step
    public void starts_search() {
        
    }

    @Step
    public void should_see_definition(String definition) {
        
    }

    @Step
    public void is_the_home_page() {
       
    }

    @Step
    public void looks_for(String term) {
        enters(term);
        starts_search();
    }
}