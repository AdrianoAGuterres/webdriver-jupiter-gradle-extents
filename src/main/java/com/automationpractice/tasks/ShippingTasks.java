package com.automationpractice.tasks;

import com.automationpractice.appObjects.ShippingAppObject;
import com.automationpractice.utils.selenium.ElementsTools;
import org.openqa.selenium.WebElement;

public class ShippingTasks{
    private final ShippingAppObject shippingAppObject;
    
    public ShippingTasks(){
        this.shippingAppObject = new ShippingAppObject();
    }
    
    public void confirmShipping(){
        clickIGreeCheckbox();
        clickProceedCheckoutButton();
    }
    
    public void clickIGreeCheckbox(){
        WebElement element = this.shippingAppObject.getIGreeCheckbox();
        ElementsTools.clickElement(element, "I Gree");
    }
    
    public void clickProceedCheckoutButton(){
        WebElement element = this.shippingAppObject.getProceedCheckoutButton();
        ElementsTools.clickElement(element, "Proceed Checkout");
    }
}
