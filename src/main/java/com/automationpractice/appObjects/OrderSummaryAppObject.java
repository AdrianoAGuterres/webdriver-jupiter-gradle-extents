package com.automationpractice.appObjects;

import com.automationpractice.utils.selenium.ElementsTools;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

public class OrderSummaryAppObject{
    public WebElement getIConfirmButton(){
        return ElementsTools.waitForElement(By.cssSelector("button.button-medium > span"));
    }
}
