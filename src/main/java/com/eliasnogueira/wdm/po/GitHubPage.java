package com.eliasnogueira.wdm.po;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class GitHubPage {

    @FindBy(css = "[itemprop='about']")
    private WebElement description;

    public GitHubPage(WebDriver driver) {
        PageFactory.initElements(driver, this);
    }

    public String getDescription() {
        return description.getText();
    }
}
