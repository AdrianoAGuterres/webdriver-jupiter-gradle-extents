package com.automationpractice.tasks;

import com.automationpractice.appObjects.HomePageAppObject;
import com.automationpractice.utils.selenium.ElementsTools;
import org.openqa.selenium.WebElement;

public class HomePageTasks{
    private final HomePageAppObject homePageAppObject;
    
    public HomePageTasks(){
        this.homePageAppObject = new HomePageAppObject();
    }
    
    public void selectFirstItemDresses(){
        selectDresses();
        selectFirstItem();
    }
    
    public void selectDresses(){
        WebElement element = this.homePageAppObject.getTitlesMenuDresses();
        ElementsTools.clickElement(element, "Dresses options");
    }
    
    public void selectFirstItem(){
        WebElement element = this.homePageAppObject.getFirstItemBlock();
        ElementsTools.clickElement(element, "First Item");
    }
}
