package com.automationpractice.utils.config;

import com.google.inject.Singleton;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;

@Singleton
public class ConfigurationTool{
    
    private static Properties PROPERTIES = null;
    
    private static void loadProperties(){
        try{
            FileInputStream file = new FileInputStream("configurations.properties");
            PROPERTIES = new Properties();
            PROPERTIES.load(file);
            
        }catch(IOException e){
            e.printStackTrace();
        }
    }
    
    public static String getProperty(String property){
        if(PROPERTIES == null){
            loadProperties();
        }
        return PROPERTIES.getProperty(property);
    }
    
    
}


