package widgets;

import com.codeborne.selenide.ElementsCollection;
import com.codeborne.selenide.SelenideElement;
import org.openqa.selenium.By;

import static com.codeborne.selenide.Selenide.*;


public class MainPageWidgets {
    public static final ElementsCollection CATEGORIES_LIST = $$(By.className("pb-categories"));
    public static final ElementsCollection REPOSITORIES_LIST = $$(By.className("pb-repos"));
    public static final SelenideElement POPULAR_TAGS_LIST = $(By.className("box-content"));
    public static final SelenideElement INDEXED_ARTIFACTS_BUTTON = $x("//a[contains(text(),'Indexed Artifacts')]");
    public static final SelenideElement INDEXED_REPOSITORIES_BUTTON = $x("//a[contains(text(),'Indexed Repositories')]");
    public static final SelenideElement POPULAR_CATEGORIES_BUTTON = $x("//a[contains(text(),'Popular Categories')]");
    public static final SelenideElement POPULAR_TAGS_BUTTON = $x("//a[contains(text(),'Popular Tags')]");
    public static final SelenideElement ABOUT_BUTTON = $x("//a[contains(text(),'About')]");
    public static final SelenideElement CATEGORIES_BUTTON = $x("//a[contains(text(),'Categories')]");
    public static final SelenideElement POPULAR_BUTTON = $x("//a[contains(text(),'Popular')]");
    public static final SelenideElement CONTACTS_BUTTON = $x("//a[contains(text(),'Contact Us')]");
    public static final SelenideElement SEARCH_INPUT = $(By.name("q"));
    public static final SelenideElement SEARCH_BUTTON = $x("//input[@type='submit']");
    public static final SelenideElement LAST_VERSION_WIDGET = $x("//a[@class='vbtn release'][1]");
    public static final SelenideElement LOGO = $(By.id("logo"));

}
