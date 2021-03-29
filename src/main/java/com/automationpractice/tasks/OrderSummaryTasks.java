package com.automationpractice.tasks;


import com.automationpractice.appObjects.OrderSummaryAppObject;
import com.automationpractice.utils.selenium.ElementsTools;
import org.openqa.selenium.WebElement;

public class OrderSummaryTasks{
    
    private final OrderSummaryAppObject orderSummaryAppObject;
    
    public OrderSummaryTasks(){
        this.orderSummaryAppObject = new OrderSummaryAppObject();
    }
    
    public void clickIConfirmButton(){
        WebElement element = this.orderSummaryAppObject.getIConfirmButton();
        ElementsTools.clickElement(element, "I Confirm");
    }
}
