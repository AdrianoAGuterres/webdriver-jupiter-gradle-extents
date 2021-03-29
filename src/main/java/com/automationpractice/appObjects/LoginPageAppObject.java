package com.automationpractice.appObjects;

import com.automationpractice.utils.selenium.ElementsTools;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

public class LoginPageAppObject{
    
    public WebElement getEmailAddressTextfield(){
        return ElementsTools.waitForElement(By.id("email_create"));
    }
    
    public WebElement getCreateAccountButton(){
        return ElementsTools.waitForElement(By.name("SubmitCreate"));
    }
}
