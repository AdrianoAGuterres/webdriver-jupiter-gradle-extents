package com.automationpractice.tasks;

import com.automationpractice.appObjects.ItemPageAppObject;
import com.automationpractice.utils.selenium.ElementsTools;
import org.openqa.selenium.WebElement;

public class ItemPageTasks{
    private final ItemPageAppObject itemPageAppObject;
    
    public ItemPageTasks(){
        this.itemPageAppObject = new ItemPageAppObject();
    }
    
    public void addFirstItemDressesCart(){
        clickAddCartButton();
        clickProceedToCheckoutButton();
    }
    
    public void clickAddCartButton(){
        WebElement element = this.itemPageAppObject.getAddCartButton();
        ElementsTools.clickElement(element, "ADD");
    }
    
    public void clickProceedToCheckoutButton(){
        WebElement element = this.itemPageAppObject.getProceedToCheckoutButton();
        ElementsTools.clickElement(element, "Proceed To Checkout");
    }
}