package pages;

import static com.codeborne.selenide.Condition.text;
import static com.codeborne.selenide.Condition.visible;
import static widgets.MainPageWidgets.*;

public class MainPage {
    public MainPage fillSearchInput(String value){
        SEARCH_INPUT.shouldBe(visible).val(value);
        return this;
    }

    public MainPage submitButtonClick() {
        SEARCH_BUTTON.shouldBe(visible).click();
        return this;
    }

    public MainPage returnToMainPage() {
        LOGO.shouldBe(visible).click();
        return this;
    }

    public MainPage getCategoryFromPopularCategories(String category) {
        CATEGORIES_LIST.findBy(text(category)).click();
        return this;
    }

    public MainPage getRepoFromIndexedRepos(String repoName) {
        REPOSITORIES_LIST.findBy(text(repoName)).click();
        return this;
    }
}
