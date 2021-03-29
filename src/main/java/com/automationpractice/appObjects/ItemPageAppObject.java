package com.automationpractice.appObjects;

import com.automationpractice.utils.selenium.ElementsTools;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

public class ItemPageAppObject{
    
    public WebElement getAddCartButton(){
        return ElementsTools.waitForElement(By.cssSelector("button[name='Submit'] > span"));
    }
    
    public WebElement getProceedToCheckoutButton(){
        return ElementsTools.waitForElement(By.cssSelector("a.button-medium > span"));
    }
}
