package com.automationpractice.utils.selenium;

import com.automationpractice.utils.enuns.SelectBy;
import com.automationpractice.utils.config.ConfigurationTool;
import com.automationpractice.utils.exceptions.SelectTypeNotImplementedException;
import com.automationpractice.utils.report.Report;
import com.aventstack.extentreports.Status;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;

public class ElementsTools{
    
    public static WebElement waitForElement(By locator, int wait){
        WebDriverWait webDriverWait = new WebDriverWait(Driver.getInstance(), wait);
        return webDriverWait.until(ExpectedConditions.elementToBeClickable(locator));
    }
    
    public static WebElement waitForElement(By locator){
        return waitForElement(locator, Integer.parseInt(ConfigurationTool.getProperty("DEFAULT_WAIT")));
    }
    
    public static void highlightElement(WebElement element){
        centralizeElement(element);
        performJsExecutor("arguments[0].style.border='1px solid red'", element);
    }
    
    public static void unHighlightElement(WebElement element){
        centralizeElement(element);
        performJsExecutor("arguments[0].style.border=''", element);
    }
    
    public static void centralizeElement(WebElement element){
        int center = Driver.getInstance().manage().window().getSize().height / 2;
        performJsExecutor("scroll(0, " + center + ");", element);
    }
    
    public static void performJsExecutor(String script, WebElement element){
        ((JavascriptExecutor) Driver.getInstance()).executeScript(script, element);
    }
    
    public static void fillTextField(WebElement element, String elementName, String keys){
        try{
            element.clear();
            element.sendKeys(keys);
            Report.log(Status.INFO, "Campo de texto '"+elementName+"' preenchido com '"+keys+"'.", false);
        }catch(Exception error){
            Report.log(Status.FAIL, "Erro ao preencher o Campo de texto '"+elementName+"'!"+ System.lineSeparator() +
                                            "Erro encontrado = " + error, true);
            throw error;
        }
    }
    
    public static void clickElement(WebElement element, String elementName){
        try{
            element.click();
            Report.log(Status.INFO, "Clique realizado no botão '"+elementName+"'.", false);
        }catch(Exception error){
            Report.log(Status.FAIL, "Erro ao Clicar no botão '"+elementName+"'!" + System.lineSeparator() +
                                            "Erro encontrado = " + error, true);
            throw error;
        }
    }
    
    public static void selectOption(Select element, String elementName, SelectBy selectBy, String value){
        try{
            switch(selectBy){
                case SELECT_BY_VALUE:
                    element.selectByValue(value);
                    break;
                case SELECT_BY_INDEX:
                    element.selectByIndex(Integer.parseInt(value));
                    break;
                case SELECT_BY_VISIBLE_TEXT:
                    element.selectByVisibleText(value);
                    break;
                default:
                    throw new SelectTypeNotImplementedException("Não há implementação para esse tipo de Select "+selectBy.name()+"!");
            }
            Report.log(Status.INFO, "Foi selecionada a opção '"+value+"' do campo '"+elementName+"'.", false);
            
        }catch(Exception error){
            Report.log(Status.FAIL, "Erro ao selecionar a opção '"+value+"' do campo '"+elementName+"'!" + System.lineSeparator() +
                                            "Erro encontrado = " + error, true);
            throw error;
        }
    }
}
