package test;

import java.io.IOException;
import java.net.HttpURLConnection;
import java.net.MalformedURLException;
import java.net.URL;

public class VerifylinkBroken {

	public static void main(String[] args) throws MalformedURLException, IOException {
		// TODO Auto-generated method stub
		
		String url="https://www.guru99.com/find-broken-links-selenium-webdriver.html";
		HttpURLConnection con=(HttpURLConnection) new URL(url).openConnection();
			con.setRequestMethod("HEAD");
			con.connect();
			int respocode=con.getResponseCode();
			System.out.println(respocode);
			
			
			
		
	}

}
