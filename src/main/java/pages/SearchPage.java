package pages;

import static com.codeborne.selenide.Condition.text;
import static com.codeborne.selenide.Condition.visible;
import static widgets.MainPageWidgets.LAST_VERSION_WIDGET;
import static widgets.SearchPageWidgets.POSTS_LIST;


public class SearchPage {
    public SearchPage getRepoFromList(String repoName) {
        POSTS_LIST.findBy(text(repoName)).click();
        return this;
    }

    public SearchPage getLastVersion() {
        LAST_VERSION_WIDGET.shouldBe(visible).click();
        return this;
    }
}
