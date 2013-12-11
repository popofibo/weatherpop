/**
DO WHAT THE FUCK YOU WANT TO PUBLIC LICENSE 
                    Version 2, December 2004 

 Copyright (C) 2013 http://popofibo.com <popo.fibo@gmail.com> 

 Everyone is permitted to copy and distribute verbatim or modified 
 copies of this code, and changing it is allowed as long 
 as the name is changed. 

            DO WHAT THE FUCK YOU WANT TO PUBLIC LICENSE 
   TERMS AND CONDITIONS FOR COPYING, DISTRIBUTION AND MODIFICATION 

  0. You just DO WHAT THE FUCK YOU WANT TO.
**/
package com.popofibo.weatherpop.util;

import java.io.BufferedReader;
import java.io.ByteArrayOutputStream;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.net.HttpURLConnection;
import java.net.URL;

public class WeatherPopHttpClient {

	private static String BASE_URL = "http://api.openweathermap.org/data/2.5/weather?q=";
	private static String IMG_URL = "http://openweathermap.org/img/w/";

	public String getWeatherData(String location, String lang) {
		HttpURLConnection con = null;
		InputStream is = null;

		try {

			String url = BASE_URL + location;
			if (lang != null)
				url = url + "&lang=" + lang;

			con = (HttpURLConnection) (new URL(url)).openConnection();
			con.setRequestMethod("GET");
			con.setDoInput(true);
			con.setDoOutput(true);
			con.connect();

			StringBuffer buffer = new StringBuffer();
			is = con.getInputStream();
			BufferedReader br = new BufferedReader(new InputStreamReader(is));
			String line = null;
			while ((line = br.readLine()) != null) {
				System.out.println("Response: " + line);
				buffer.append(line + "\r\n");
			}

			is.close();
			con.disconnect();

			return buffer.toString();
		} catch (Throwable t) {
			t.printStackTrace();
		} finally {
			try {
				is.close();
			} catch (Throwable t) {
				t.printStackTrace();
			}
			try {
				con.disconnect();
			} catch (Throwable t) {
				t.printStackTrace();
			}
		}

		return null;

	}

	public byte[] getImage(String code) {
		HttpURLConnection con = null;
		InputStream is = null;
		try {
			con = (HttpURLConnection) (new URL(IMG_URL + code))
					.openConnection();
			con.setRequestMethod("GET");
			con.setDoInput(true);

			// Setting it to false ensure GET method is not implicitly converted
			// to POST
			con.setDoOutput(false);
			con.connect();

			is = con.getInputStream();
			byte[] buffer = new byte[1024];
			ByteArrayOutputStream baos = new ByteArrayOutputStream();

			while (is.read(buffer) != -1) {
				baos.write(buffer);
			}

			return baos.toByteArray();
		} catch (Throwable t) {
			t.printStackTrace();
		} finally {
			try {
				is.close();
			} catch (Throwable t) {
			}
			try {
				con.disconnect();
			} catch (Throwable t) {
			}
		}

		return null;

	}
}
