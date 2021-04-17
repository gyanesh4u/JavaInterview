package practise;

import java.net.MalformedURLException;
import java.net.URL;

public class URLCompare {
/*
 * What will be the output when you compare site URL with its ip address?
 */
	public static void main(String[] args) {
		
		try {
			System.out.println(new URL("https://app.hubspot.com/").equals(new URL("https://	104.19.154.83")));
		} catch (MalformedURLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
}
