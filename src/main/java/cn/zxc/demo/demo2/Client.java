package cn.zxc.demo.demo2;

import java.io.InputStream;
import java.net.HttpURLConnection;
import java.net.MalformedURLException;
import java.net.URL;
import java.net.URLConnection;

import org.apache.cxf.helpers.IOUtils;
import org.apache.cxf.io.CachedOutputStream;

public class Client {
	public static void main(String[] args) throws Exception {
		URL  url =new URL("http://localhost:9001/customerService/putcustomer");
		
		HttpURLConnection connection =(HttpURLConnection) url.openConnection();
		connection.setDoOutput(true);
		connection.setDoInput(true);
		connection.setUseCaches(false);
		connection.setRequestMethod("PUT");
		connection.connect();
		InputStream inputStream = connection.getInputStream();
		String string = getStringFromInputStream(inputStream);
		System.out.println(string);
		 
		 	}
    private static String getStringFromInputStream(InputStream in) throws Exception {
    	String s="";
        byte[] b=new byte[1024];
        int len = in.read(b);
        s=new String(b, 0, len);
        return s ;
    }
    
}
