package ru.comp.facades;

import org.openqa.selenium.By;

public class ResultsPageFacade extends Facade {

    public By ResultSearchItem = By.xpath("//*[contains(@class, 'cnn-search__result cnn-search__result--article')]");

    public By NoResultsBlock = By.xpath("//*[contains(@class, 'cnn-search__no-results')]");
}
