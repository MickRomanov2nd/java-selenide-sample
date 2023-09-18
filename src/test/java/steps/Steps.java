package steps;

import io.qameta.allure.Step;
import pages.MainPage;
import pages.RepositoryPage;
import pages.SearchPage;

public class Steps {
    MainPage mainPage = new MainPage();
    SearchPage searchPage = new SearchPage();
    RepositoryPage repositoryPage = new RepositoryPage();

    @Step("Ищем репозиторий {repoName}")
    public Steps searchRepository(String repoName){
        mainPage.fillSearchInput(repoName)
                .submitButtonClick();
        return this;
    }

    @Step("Выбираем репозиторий из списка")
    public Steps getRepoFromList(String repoName) {
        searchPage.getRepoFromList(repoName);
        return this;
    }

    @Step("Выбираем последнюю версию репозитория")
    public Steps getLastRepoVersion() {
        searchPage.getLastVersion();
        return this;
    }

    @Step("Открылась страница репозитория {repoName}")
    public Steps repoPageOpened(String repoName) {
        repositoryPage.repoPageOpen(repoName);
        return this;
    }

    @Step("Последняя версия пакета {version}")
    public Steps getVersion(String repoName, String version) {
        repositoryPage.
                checkVersionVisible(repoName)
                .getVersion(version);
        return this;
    }

    @Step("Возврат на главную страницу")
    public Steps returnToMainPage() {
        mainPage.returnToMainPage();
        return this;
    }

    @Step("Выбор категории из списка популярных категорий")
    public Steps getCategoryFromPopularCategories(String category) {
        mainPage.getCategoryFromPopularCategories(category);
        return this;
    }

    @Step("Выбор репозитория из Indexed Repositories")
    public Steps getRepoFromIndexedRepositories(String repoName) {
        mainPage.getRepoFromIndexedRepos(repoName);
        return this;
    }

    @Step("Проверяем, что в {year} году было {total} публикаций")
    public Steps checkPublishingByYear(String year, String total) {
        repositoryPage.findTotalPublishByYear(year, total);
        return this;
    }
}
