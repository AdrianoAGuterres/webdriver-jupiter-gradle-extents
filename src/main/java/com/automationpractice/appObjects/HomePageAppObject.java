package com.automationpractice.appObjects;

import com.automationpractice.utils.selenium.ElementsTools;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

public class HomePageAppObject{
    public WebElement getTitlesMenuDresses(){
        return ElementsTools.waitForElement(By.cssSelector("ul.sf-menu > li > [title='Dresses']"));
    }
    
    public WebElement getFirstItemBlock(){
        return ElementsTools.waitForElement(By.cssSelector(".first-item-of-tablet-line.first-in-line .product-name"));
    }
}
