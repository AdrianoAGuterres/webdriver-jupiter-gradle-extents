package com.automationpractice.appObjects;

import com.automationpractice.utils.selenium.ElementsTools;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

public class ShippingAppObject{
    public WebElement getIGreeCheckbox(){
        return ElementsTools.waitForElement(By.cssSelector("#uniform-cgv"));
    }
    
    public WebElement getProceedCheckoutButton(){
        return ElementsTools.waitForElement(By.cssSelector("button[name='processCarrier'] > span"));
    }
}
