package com.automationpractice.tasks;

import com.automationpractice.appObjects.MyAccountPageAppObject;
import com.automationpractice.utils.enuns.SelectBy;
import com.automationpractice.utils.report.Report;
import com.automationpractice.utils.selenium.ElementsTools;
import com.aventstack.extentreports.Status;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;

public class MyAccountTasks{
    
    private final MyAccountPageAppObject accountPageAppObject;
    
    public MyAccountTasks(){
        this.accountPageAppObject = new MyAccountPageAppObject();
    }
    
    public void fillCostumerForm(String firstName,
                                 String lastName,
                                 String email,
                                 String password,
                                 String day,
                                 String month,
                                 String year,
                                 String company,
                                 String address,
                                 String city,
                                 String state,
                                 String postCode,
                                 String country,
                                 String phone){
        clickTitleMisterRadioButton();
        fillFirstNameTextfield(firstName);
        fillLastNameTextfield(lastName);
        fillEmailTextfield(email);
        fillPasswordTextfield(password);
        selectDayBirthdayCombobox(day);
        selectMonthBirthdayCombobox(month);
        selectYearBirthdayCombobox(year);
        fillCompanyTextfield(company);
        fillAddressTextfield(address);
        fillCityTextfield(city);
        fillStateTextfield(state);
        fillPostCodeTextfield(postCode);
        fillCountryTextfield(country);
        fillPhoneTextfield(phone);
        
        Report.log(Status.PASS, "O formulário foi preenchido sem erros.", true);
    }
    
    public void clickTitleMisterRadioButton(){
        WebElement element = this.accountPageAppObject.getTitleMisterRadioButton();
        ElementsTools.clickElement(element, "Mister");
    }
    
    public void clickRegisterButton(){
        WebElement element = this.accountPageAppObject.getRegisterButton();
        ElementsTools.clickElement(element, "Register");
    }
    
    public void fillFirstNameTextfield(String firstName){
        WebElement element = this.accountPageAppObject.getFirstNameTexfield();
        ElementsTools.fillTextField(element, "First Name", firstName);
    }
    
    public void fillLastNameTextfield(String lastName){
        WebElement element = this.accountPageAppObject.getLastNameTexfield();
        ElementsTools.fillTextField(element, "Last Name", lastName);
    }
    
    public void fillEmailTextfield(String email){
        WebElement element = this.accountPageAppObject.getEmailTexfield();
        element.clear();
        ElementsTools.fillTextField(element, "EMAIL", email);
    }
    
    public void fillPasswordTextfield(String password){
        WebElement element = this.accountPageAppObject.getPasswordTexfield();
        ElementsTools.fillTextField(element, "Password", password);
    }
    
    public void selectDayBirthdayCombobox(String day){
        Select element = this.accountPageAppObject.getDayBirthdayCombobox();
        ElementsTools.selectOption(element, "Day Birthday", SelectBy.SELECT_BY_VALUE, day);
    }
    
    public void selectMonthBirthdayCombobox(String month){
        Select element = this.accountPageAppObject.getMonthBirthdayCombobox();
        ElementsTools.selectOption(element, "Month Birthday", SelectBy.SELECT_BY_VALUE, month);
    }
    
    public void selectYearBirthdayCombobox(String year){
        Select element = this.accountPageAppObject.getYearBirthdayCombobox();
        ElementsTools.selectOption(element, "Year Birthday", SelectBy.SELECT_BY_VALUE, year);
    }
    
    public void fillCompanyTextfield(String company){
        WebElement element = this.accountPageAppObject.getCompanyTextfield();
        ElementsTools.fillTextField(element, "Company", company);
    }
    
    public void fillAddressTextfield(String address){
        WebElement element = this.accountPageAppObject.getAddressTextfield();
        ElementsTools.fillTextField(element, "Address", address);
    }
    
    public void fillCityTextfield(String city){
        WebElement element = this.accountPageAppObject.getCityTextfield();
        ElementsTools.fillTextField(element, "City", city);
    }
    
    public void fillStateTextfield(String state){
        Select element = this.accountPageAppObject.getStateCombobox();
        ElementsTools.selectOption(element, "State", SelectBy.SELECT_BY_VISIBLE_TEXT, state);
    }
    
    public void fillPostCodeTextfield(String postCode){
        WebElement element = this.accountPageAppObject.getPostCodeTextfield();
        ElementsTools.fillTextField(element, "Post Code", postCode);
    }
    
    public void fillCountryTextfield(String country){
        Select element = this.accountPageAppObject.getCountryCombobox();
        ElementsTools.selectOption(element, "Country", SelectBy.SELECT_BY_VISIBLE_TEXT, country);
    }
    
    public void fillPhoneTextfield(String phone){
        WebElement element = this.accountPageAppObject.getPhoneTextfield();
        ElementsTools.fillTextField(element, "Phone", phone);
    }
}
