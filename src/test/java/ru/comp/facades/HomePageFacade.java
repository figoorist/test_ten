package ru.comp.facades;

import org.openqa.selenium.By;

public class HomePageFacade extends Facade {

    public By SearchButton = By.xpath("//*[@id='search-button']");

    public By SearchInput = By.xpath("//input[@id='search-input-field']");

    public By GoButton = By.xpath("//*[@id='search-button']");
}
