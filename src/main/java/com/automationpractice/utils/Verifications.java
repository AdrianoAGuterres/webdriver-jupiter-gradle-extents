package com.automationpractice.utils;

import com.automationpractice.utils.report.Report;
import com.automationpractice.utils.selenium.ElementsTools;
import com.aventstack.extentreports.Status;
import org.openqa.selenium.WebElement;

public class Verifications{
    
    public static void compareElementWord(String fieldName, WebElement element, String expected){
        String obtained = element.getText();
        ElementsTools.highlightElement(element);
        compareWord(fieldName, obtained, expected);
        ElementsTools.unHighlightElement(element);
    }
    
    public static void compareWordByElementAttribute(String fieldName, String attribute, WebElement element, String expected){
        String obtained = element.getAttribute(attribute);
        ElementsTools.highlightElement(element);
        compareWord(fieldName, obtained, expected);
        ElementsTools.unHighlightElement(element);
    }
    
    public static void compareWord(String fieldName, String obtained, String expected){
        String separator = System.lineSeparator();
        if(obtained.equalsIgnoreCase(expected)){
            Report.log(Status.PASS, "O conteúdo do campo " + fieldName + " esta correto: " + expected + "!", true);
        }else{
            Report.log(Status.FAIL, "O conteúdo do campo " + fieldName + " não esta correto!" +separator+
                                            "Conteúdo esperado: " + expected  +separator+
                                            "Conteúdo obtido: " + obtained, true);
            throw new AssertionError();
        }
    }
}
