package pages;

import static com.codeborne.selenide.Condition.text;
import static com.codeborne.selenide.Condition.visible;
import static com.codeborne.selenide.Selenide.$x;
import static widgets.RepositoryPageWidgets.REPO_TITLE;
import static widgets.RepositoryPageWidgets.VERSION_TITLE;

public class RepositoryPage {
    public RepositoryPage checkVersionVisible(String repoName) {
        $x(String.format("//h2[@class='im-title']/a[contains(text(), '%s')]", repoName)).shouldBe(visible);
        return this;
    }

    public RepositoryPage repoPageOpen(String repoName) {
        REPO_TITLE.shouldHave(text(repoName)).shouldBe(visible);
        return this;
    }

    public RepositoryPage getVersion(String version) {
        VERSION_TITLE.shouldBe(visible).shouldHave(text(version));
        return this;
    }

    public RepositoryPage findTotalPublishByYear(String year, String total) {
        $x(String.format("//th[contains(text(), '%s')]/following::td/div/div[@class='pbt']", year)).shouldHave(text(total));
        return this;
    }
}
