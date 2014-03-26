package com.framework;

import java.text.SimpleDateFormat;
import java.util.Date;

public class Base {
	public final static int TIME_OUT = Integer.parseInt(Config.getConfBykey("element.find.timeout"));
    public final static String STR_NAV_JS=" return navigator.userAgent.toLowerCase() ; ";
    public static String getDate() {
        Date currentTime = new Date();
        SimpleDateFormat formatter = new SimpleDateFormat("yyyy-MM-dd-HH-mm-ss");
        String dateString = formatter.format(currentTime);
        return dateString;
    }

}
