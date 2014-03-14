package com.example;
import org.json.*;
public class SendHttpRequest {
	//
	public static void main(String[] args) {
		//解析Json
		// TODO Auto-generated method stub
//        String json ="{ \"store\": {" +
//        		" \"book\": [ " +
//        		"{ \"category\": \"reference\"," +
//        		"\"author\": \"Nigel Rees\"," +
//        		"\"title\": \"Sayings of the Century\"," +
//        		"\"price\": 8.95" +
//        		" }," +
//        		"{ \"category\": \"fiction\"," +
//        		"\"author\": \"Evelyn Waugh\"," +
//        		"\"title\": \"Sword of Honour\"," +
//        		"\"price\": 12.99," +
//        		"\"isbn\": \"0-553-21311-3\"" +
//        		"}" +
//        		"]," +
//        		" \"bicycle\": {" +
//        		" \"color\": \"red\"," +
//        		"\"price\": 19.95" +
//        		"}" +
//        		"}" +
//        		"}";
//        List<String> authors = JsonPath.read(json, "$.store.book[*].author");        
//        for(String a :authors)
//        {
//        	System.out.println(a);
//        }
        String a="http://192.168.82.83:8060/jsonp/getmetrictagnames?reqdata={\"version\":1,\"time-series-pattern\":{\"namespace\":null,\"metrics-name\":{\"equals\":\"esb.log.request.count\"},\"tag\":\"requesttype\"}}&callback:cQuery.tmp[\"dashboard_loadTags_uid_1369291746102639723558\"]";
        try
        {
        	String aa=WebClient.GetContent(a,"utf-8",null);
        	int Length=aa.length()-2;
        	String output =aa.substring(13, Length);
        	//System.out.println("json长度："+output.length());
        	//List<String> request = JsonPath.read(output, "$.time-series-list[*].tags.requesttype");
        	//System.out.println("数量"+request.size());
        	JSONObject jsonObj = new JSONObject(output);
        	//System.out.println(XML.toString(jsonObj));
        	JSONArray jsonarray =jsonObj.getJSONArray("time-series-list");
        	System.out.println("数量"+jsonarray.get(0));
        	JSONObject jsonObj1 = new JSONObject(jsonarray.get(0).toString());
        	System.out.println("数量"+jsonObj1.getString("metrics-name"));
        	JSONObject jTags=jsonObj1.getJSONObject("tags");
        	JSONArray Jrequesttype =jTags.getJSONArray("requesttype");
        	System.out.println("数量"+Jrequesttype.length());
        	for(int i=0;i<Jrequesttype.length();i++)
            {
          	 System.out.println(String.valueOf(i)+":"+Jrequesttype.get(i));
            }
        }
        catch(Exception e)
        {
        	System.out.println(e.getMessage());
        	
        }
        
        
	}
}
