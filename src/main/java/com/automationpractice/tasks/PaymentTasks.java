package com.automationpractice.tasks;

import com.automationpractice.appObjects.PaymentAppObject;
import com.automationpractice.utils.selenium.ElementsTools;
import org.openqa.selenium.WebElement;

public class PaymentTasks{
    private final PaymentAppObject paymentAppObject;
    
    public PaymentTasks(){
        this.paymentAppObject = new PaymentAppObject();
    }
    
    public void clickBankWireButton(){
        WebElement element = this.paymentAppObject.getBankWireButton();
        ElementsTools.clickElement(element, "Bank Wire");
    }
}
