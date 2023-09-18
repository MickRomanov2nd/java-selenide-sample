package tests;

import com.codeborne.selenide.logevents.SelenideLogger;
import constants.Constants;
import io.qameta.allure.selenide.AllureSelenide;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import steps.Steps;

import static com.codeborne.selenide.Selenide.open;
import static constants.Constants.*;


class SearchTests {
    Steps steps = new Steps();

    @BeforeEach
    public void setConfig() {
        SelenideLogger.addListener("allure", new AllureSelenide());
        open("https://mvnrepository.com/");
    }


    @Test
    @DisplayName("Проверка версии у репозитория Allure Selenide")
    void checkRepoVersion() {
        steps.searchRepository(REPOSITORY_NAME)
                .getRepoFromList(REPOSITORY_NAME)
                .getLastRepoVersion()
                .repoPageOpened(REPOSITORY_NAME)
                .getVersion(REPOSITORY_NAME, REPOSITORY_VERSION)
                .returnToMainPage();
    }

    @Test
    @DisplayName("Поиск Retrofit в популярных категориях")
    void searchInPopularCategories() {
        steps.getCategoryFromPopularCategories(CATEGORY)
                .getRepoFromList(Constants.CATEGORY_REPO_NAME)
                .getLastRepoVersion()
                .repoPageOpened(Constants.CATEGORY_REPO_NAME)
                .getVersion(Constants.CATEGORY_REPO_NAME, CATEGORY_REPO_VERSION)
                .returnToMainPage();
    }

    @Test
    @DisplayName("Просмотр количества публикаций Spring Plugins Repository в 2016 году")
    void searchTotalPublishInYear() {
        steps.getRepoFromIndexedRepositories(INDEXED_REPOSITORY_NAME)
                .repoPageOpened(INDEXED_REPO_NAME_PAGE)
                .checkPublishingByYear("2016", "713,464")
                .returnToMainPage();
    }
}
