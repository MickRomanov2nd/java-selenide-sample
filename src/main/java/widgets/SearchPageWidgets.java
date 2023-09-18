package widgets;

import com.codeborne.selenide.ElementsCollection;
import org.openqa.selenium.By;

import static com.codeborne.selenide.Selenide.$$;

public class SearchPageWidgets {
    public static final ElementsCollection POSTS_LIST = $$(By.className("im"));

}
