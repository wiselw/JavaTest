package com.framework;

import java.io.UnsupportedEncodingException;
import java.util.ResourceBundle;

public class Config {
	private static final String BUNDLE_NAME = "conf"; 

    private static final ResourceBundle RESOURCE_BUNDLE = ResourceBundle
            .getBundle(BUNDLE_NAME);

    private Config() {
    }

    public static String getConfBykey(String key) {
    	//System.out.println(RESOURCE_BUNDLE.keySet().size());
        String value = RESOURCE_BUNDLE.getString(key);
            try {
                String keyValue = new String(value.getBytes("ISO-8859-1"), "GBK");
                return keyValue;
            } catch (UnsupportedEncodingException e) {
                return '!' + key + '!';
            } 
    }

}
