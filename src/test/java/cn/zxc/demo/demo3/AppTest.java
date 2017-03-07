package cn.zxc.demo.demo3;

import java.io.InputStream;
import java.net.HttpURLConnection;

import java.net.URL;

import junit.framework.TestCase;

/**
 * Unit test for simple App.
 */
public class AppTest extends TestCase {
	public void testAdd() throws Exception {
		URL url = new URL("http://localhost:9081/userservice/download");
		HttpURLConnection connection = (HttpURLConnection) url.openConnection();
		connection.setRequestMethod("GET");
		connection.connect();
		InputStream inputStream = connection.getInputStream();
		String string = getStringFromInputStream(inputStream);
		System.out.println(string);
	}

	private String getStringFromInputStream(InputStream in) throws Exception {
		StringBuffer s = new StringBuffer();
		byte[] b = new byte[1024];
		int len = in.read(b);
		s.append(new String(b, 0, len));
		return s.toString();
	}
}
