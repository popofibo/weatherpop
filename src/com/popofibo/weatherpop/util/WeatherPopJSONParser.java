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

import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

import com.popofibo.weatherpop.model.Location;
import com.popofibo.weatherpop.model.Weather;

public class WeatherPopJSONParser {

	public static Weather getWeather(String data, String option)
			throws JSONException {
		Weather weather = new Weather(option);
		System.out.println("Data [" + data + "]");

		Location loc = new Location();

		try {
			JSONObject jObj = new JSONObject(data);
			JSONObject coordObj = getObject("coord", jObj);
			loc.setLatitude(getFloat("lat", coordObj));
			loc.setLongitude(getFloat("lon", coordObj));

			JSONObject sysObj = getObject("sys", jObj);
			loc.setCountry(getString("country", sysObj));
			loc.setSunrise(getInt("sunrise", sysObj));
			loc.setSunset(getInt("sunset", sysObj));
			loc.setCity(getString("name", jObj));
			weather.location = loc;

			JSONArray jArr = jObj.getJSONArray("weather");

			JSONObject JSONWeather = jArr.getJSONObject(0);
			weather.currentCondition.setWeatherId(getInt("id", JSONWeather));
			weather.currentCondition.setDescr(getString("description",
					JSONWeather));
			weather.currentCondition
					.setCondition(getString("main", JSONWeather));
			weather.currentCondition.setIcon(getString("icon", JSONWeather));

			JSONObject mainObj = getObject("main", jObj);
			weather.currentCondition.setHumidity(getInt("humidity", mainObj));
			weather.currentCondition.setPressure(getInt("pressure", mainObj));
			weather.temperature.setTemp(getFloat("temp", mainObj));

			JSONObject wObj = getObject("wind", jObj);
			weather.wind.setSpeed(getFloat("speed", wObj));
			weather.wind.setDeg(getFloat("deg", wObj));

			JSONObject cObj = getObject("clouds", jObj);
			weather.clouds.setPerc(getInt("all", cObj));
		} catch (Exception e) {
			// System.out.println(e.getMessage());
		}

		return weather;

	}

	private static JSONObject getObject(String tagName, JSONObject jObj) {
		JSONObject subObj = null;
		try {
			subObj = jObj.getJSONObject(tagName);
		} catch (JSONException e) {
			System.out.println(e.getMessage());
		}
		return subObj;
	}

	private static String getString(String tagName, JSONObject jObj)
			throws JSONException {
		return jObj.getString(tagName);
	}

	private static float getFloat(String tagName, JSONObject jObj)
			throws JSONException {
		return (float) jObj.getDouble(tagName);
	}

	private static int getInt(String tagName, JSONObject jObj)
			throws JSONException {
		return jObj.getInt(tagName);
	}
}
