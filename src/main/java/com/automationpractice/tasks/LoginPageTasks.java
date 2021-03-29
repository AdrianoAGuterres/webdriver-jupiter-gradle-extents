package com.automationpractice.tasks;

import com.automationpractice.appObjects.LoginPageAppObject;
import com.automationpractice.utils.selenium.ElementsTools;
import org.openqa.selenium.WebElement;

public class LoginPageTasks{
    
    private final LoginPageAppObject loginPageAppObject;
    
    public LoginPageTasks(){
        this.loginPageAppObject = new LoginPageAppObject();
    }
    
    public void CreateAccount(String email){
        fillEmailAddressTextfield(email);
        clickCreateAccountButton();
    }
    
    public void fillEmailAddressTextfield(String email){
        WebElement element = this.loginPageAppObject.getEmailAddressTextfield();
        ElementsTools.fillTextField(element, "Email", email);
    }
    
    public void clickCreateAccountButton(){
            WebElement element = this.loginPageAppObject.getCreateAccountButton();
            ElementsTools.clickElement(element, "Create Account");
    }
}
