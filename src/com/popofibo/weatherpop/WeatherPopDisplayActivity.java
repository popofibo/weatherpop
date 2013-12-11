package com.popofibo.weatherpop;

import org.json.JSONException;
import com.popofibo.weatherpop.constants.WeatherPopConstants;
import com.popofibo.weatherpop.model.Weather;
import com.popofibo.weatherpop.util.WeatherPopJSONParser;
import com.popofibo.weatherpop.util.WeatherPopHttpClient;

import android.app.AlertDialog;
import android.app.AlertDialog.Builder;
import android.content.Intent;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.graphics.Color;
import android.graphics.Typeface;
import android.os.AsyncTask;
import android.os.Bundle;
import android.support.v4.app.FragmentActivity;
import android.widget.ImageView;
import android.widget.TextView;

/**
 * 
 * @author popofibo
 * 
 */
public class WeatherPopDisplayActivity extends FragmentActivity {

	private TextView cityText;
	private TextView condDescr;
	private TextView temp;
	private TextView press;
	private TextView windSpeed;
	private TextView windDeg;
	private TextView unitTemp;

	private TextView hum;
	private ImageView imgView;
	private String option;

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);

		setContentView(R.layout.activity_display_content);
		Intent intent = getIntent();
		String city = intent.getStringExtra(WeatherPopConstants.EXTRA_MESSAGE);
		option = intent.getStringExtra(WeatherPopConstants.EXTRA_OPTION);
		String lang = "en";

		if (city == null)
			city = "Gurgaon, IN";

		cityText = (TextView) findViewById(R.id.cityText);
		temp = (TextView) findViewById(R.id.temp);
		unitTemp = (TextView) findViewById(R.id.unittemp);
		unitTemp.setText("°C");
		unitTemp.setTextColor(Color.parseColor(WeatherPopConstants.TEXT_COLOR));

		imgView = (ImageView) findViewById(R.id.condIcon);
		condDescr = (TextView) findViewById(R.id.condDescr);
		hum = (TextView) findViewById(R.id.hum);
		press = (TextView) findViewById(R.id.press);
		windSpeed = (TextView) findViewById(R.id.windSpeed);
		windDeg = (TextView) findViewById(R.id.windDeg);
		try {
			JSONWeatherTask task = new JSONWeatherTask();
			task.execute(new String[] { city, lang });
		} catch (Exception ex) {
			// System.out.println(ex.getMessage());
			Builder alert = new AlertDialog.Builder(
					WeatherPopDisplayActivity.this);
			alert.setTitle("You made me crash, man!");
			alert.setMessage("Blast! Something went terribly wrong with the "
					+ "request. Check your connection and try again.");
			alert.setPositiveButton("OK", null);
			alert.show();
		}

	}

	private class JSONWeatherTask extends AsyncTask<String, Void, Weather> {

		@Override
		protected Weather doInBackground(String... params) {
			Weather weather = new Weather(option);
			String data = ((new WeatherPopHttpClient()).getWeatherData(
					params[0], params[1]));

			try {
				weather = WeatherPopJSONParser.getWeather(data, option);

				weather.iconData = ((new WeatherPopHttpClient())
						.getImage(weather.currentCondition.getIcon()));

			} catch (JSONException e) {
				e.printStackTrace();
			}
			return weather;

		}

		@Override
		protected void onPostExecute(Weather weather) {
			super.onPostExecute(weather);

			if (weather.iconData != null && weather.iconData.length > 0) {
				Bitmap img = BitmapFactory.decodeByteArray(weather.iconData, 0,
						weather.iconData.length);
				imgView.setImageBitmap(img);
			}

			try {
				Typeface type = null;
				if (option != null) {
					if (option.equalsIgnoreCase("Default")) {
						type = Typeface.createFromAsset(getAssets(),
								"fonts/Villa.ttf");
					}
					if (option.equalsIgnoreCase("Moronic")) {
						type = Typeface.createFromAsset(getAssets(),
								"fonts/timeburner_regular.ttf");
					}
					if (option.equalsIgnoreCase("Texter")) {
						type = Typeface.createFromAsset(getAssets(),
								"fonts/BrookeS8.ttf");
					}
				}

				cityText.setText(weather.location.getCity()
						+ ((weather.location.getCity() != null)
								&& (weather.location.getCity().length() > 0) ? ", "
								: "") + weather.location.getCountry());
				temp.setText(""
						+ Math.round((weather.temperature.getTemp() - 275.15)));
				temp.setShadowLayer(2, 2, 2, 0xFF303030);

				condDescr.setText(weather.currentCondition.getDescr() + "\n");
				press.setText("Pressure (hpa): "
						+ weather.currentCondition.getPressure());

				windSpeed
						.setText("Windspeed (m/s): " + weather.wind.getSpeed());
				windDeg.setText("Wind Degrees: " + weather.wind.getDeg());
				hum.setText("Humidity: "
						+ weather.currentCondition.getHumidity());

				cityText.setTextColor(Color
						.parseColor(WeatherPopConstants.TEXT_COLOR));
				cityText.setTypeface(null, Typeface.BOLD);
				cityText.setShadowLayer(2, 2, 2, 0xFF303030);

				condDescr.setTypeface(type);
				condDescr.setShadowLayer(2, 2, 2, 0xFF303030);

				press.setTextColor(Color
						.parseColor(WeatherPopConstants.TEXT_COLOR));
				press.setTypeface(null, Typeface.BOLD);

				windSpeed.setTextColor(Color
						.parseColor(WeatherPopConstants.TEXT_COLOR));
				windSpeed.setTypeface(null, Typeface.BOLD);

				windDeg.setTextColor(Color
						.parseColor(WeatherPopConstants.TEXT_COLOR));
				windDeg.setTypeface(null, Typeface.BOLD);

				hum.setTextColor(Color
						.parseColor(WeatherPopConstants.TEXT_COLOR));
				hum.setTypeface(null, Typeface.BOLD);
			} catch (Exception ex) {
				// System.out.println(ex.getMessage());
				Builder alert = new AlertDialog.Builder(
						WeatherPopDisplayActivity.this);
				alert.setTitle("You made me crash, man!");
				alert.setMessage("Blast! Something went terribly wrong with the "
						+ "request. Check your connection and try again.");
				alert.setPositiveButton("OK", null);
				alert.show();
			}

		}
	}

	public TextView getPress() {
		return press;
	}

	public void setPress(TextView press) {
		this.press = press;
	}

	public TextView getWindSpeed() {
		return windSpeed;
	}

	public void setWindSpeed(TextView windSpeed) {
		this.windSpeed = windSpeed;
	}

	public TextView getWindDeg() {
		return windDeg;
	}

	public void setWindDeg(TextView windDeg) {
		this.windDeg = windDeg;
	}

	public TextView getHum() {
		return hum;
	}

	public void setHum(TextView hum) {
		this.hum = hum;
	}

}
