package ru.comp.pages;

import org.openqa.selenium.WebDriver;

/**
 * Abstract class representation of a Page in the UI. Page object pattern
 */
public abstract class Page<T> {

    protected WebDriver driver;
    protected T facade;

    /*
     * Constructor injecting the WebDriver interface
     *
     * @param webDriver
     */
    public Page(WebDriver driver) {
      this.driver = driver;
    }

    public String getTitle() {
      return driver.getTitle();
    }

}
