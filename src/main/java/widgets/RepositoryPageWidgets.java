package widgets;

import com.codeborne.selenide.SelenideElement;

import static com.codeborne.selenide.Selenide.$x;

public class RepositoryPageWidgets {
    public static final SelenideElement VERSION_TITLE = $x("///h2[@class='im-title']/a[2]");
    public static final SelenideElement REPO_TITLE = $x("//h2[@class='im-title']");

}
