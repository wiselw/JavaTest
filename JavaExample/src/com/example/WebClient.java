package com.example;

import java.io.*;
import java.net.URL;
import java.net.URLConnection;

public class WebClient {
    private WebClient()
    {}
    public static String GetContent(String url, String oriEncoding, String targetEncoding)throws IOException{
    	URL u = new URL(url);
        URLConnection uc = u.openConnection();
        BufferedReader in;

        if(oriEncoding == null || oriEncoding.length() == 0){ 
            in = new BufferedReader(new InputStreamReader(uc.getInputStream()));
        } else {
            in = new BufferedReader(new InputStreamReader(uc.getInputStream(), oriEncoding));
        }
        String line;
        StringBuilder sb = new StringBuilder();
        while((line = in.readLine()) != null) { 
            sb.append(line);
        }
        if(targetEncoding == null || targetEncoding.length() == 0) { 
            return sb.toString();
        }
        return new String(sb.toString().getBytes(), targetEncoding);

    }
}
