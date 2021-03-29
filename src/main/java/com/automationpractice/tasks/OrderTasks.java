package com.automationpractice.tasks;

import com.automationpractice.appObjects.OrderAppObject;
import com.automationpractice.utils.selenium.ElementsTools;
import org.openqa.selenium.WebElement;

public class OrderTasks{
    private final OrderAppObject orderAppObject;
    
    public OrderTasks(){
        this.orderAppObject = new OrderAppObject();
    }
    
    public void clickProceedToCheckoutButton(){
        WebElement element = this.orderAppObject.getProceedToCheckoutButton();
        ElementsTools.clickElement(element, "Proceed To Checkout");
    }
}
