package com.As.mMertTopal.weather.constants;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;


public class Constants {
    public static String API_URL;


    public static String API_KEY;
    public static String ACCES_KEY_PARAM="?access_key";
    public static String QUERY_KEY_PARAM="&query==";



    @Value("${weather-stack.api-url}")
    public void setApiUrl(String apiUrl) {
        Constants.API_URL = apiUrl;
    }
    @Value("${weather-stack.api-key}")
    public void setApiKey(String apiKey) {
        Constants.API_KEY = apiKey;
    }
}
