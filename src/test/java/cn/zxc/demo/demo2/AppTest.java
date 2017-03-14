package cn.zxc.demo.demo2;

import java.io.InputStream;
import java.net.HttpURLConnection;
import java.net.MalformedURLException;
import java.net.URL;
import java.net.URLConnection;

import junit.framework.Test;
import junit.framework.TestCase;
import junit.framework.TestSuite;

/**
 * Unit test for simple App.
 */
public class AppTest   extends TestCase
{
	String basicPath="http://localhost:9001/customerService";
	String addPathGet="/customer/0";
	String addPathPost="/addcustomer";
	String addPathPut="/putcustomer";
	String addPathDelete="/deletecustomer";
	
	public void testGet() throws Exception{
		URL url=new URL(basicPath+addPathGet);
		HttpURLConnection openConnection = (HttpURLConnection) url.openConnection();
		openConnection.setRequestMethod("GET");
		InputStream inputStream = openConnection.getInputStream();
		String string = getStringFromInputStream(inputStream);
		System.out.println(string);
	}
	public void testPut() throws Exception{
		URL url=new URL(basicPath+addPathPut);
		HttpURLConnection openConnection = (HttpURLConnection) url.openConnection();
		openConnection.setRequestMethod("PUT");
		InputStream inputStream = openConnection.getInputStream();
		String string = getStringFromInputStream(inputStream);
		
		System.out.println(string);
	}
	public void testPost() throws Exception{
		URL url=new URL(basicPath+addPathPost);
		HttpURLConnection openConnection = (HttpURLConnection) url.openConnection();
		openConnection.setRequestMethod("POST");
		InputStream inputStream = openConnection.getInputStream();
		String string = getStringFromInputStream(inputStream);
		System.out.println(string);
	}
	public void testDelete() throws Exception{
	URL url=new URL(basicPath+addPathDelete);
	HttpURLConnection openConnection = (HttpURLConnection) url.openConnection();
	openConnection.setRequestMethod("DELETE");
	InputStream inputStream = openConnection.getInputStream();
	String string = getStringFromInputStream(inputStream);
	System.out.println(string);
	}
	  private  String getStringFromInputStream(InputStream in) throws Exception {
	    	StringBuffer s=new StringBuffer();
	        byte[] b=new byte[1024];
	        int len = in.read(b);
	        s.append(new String(b,0,len));
	        return s.toString() ;
	    }
}
