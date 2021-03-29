package com.automationpractice.appObjects;

import com.automationpractice.utils.selenium.ElementsTools;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

public class PaymentAppObject{
    public WebElement getBankWireButton(){
        return ElementsTools.waitForElement(By.cssSelector(".bankwire"));
    }
}
