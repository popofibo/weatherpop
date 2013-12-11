package com.popofibo.weatherpop;

import android.os.Bundle;
import android.support.v4.app.FragmentActivity;
import android.view.Menu;
import android.widget.EditText;
import android.widget.LinearLayout;
import android.widget.ListView;
import android.app.SearchManager;
import android.content.Intent;
import android.content.res.Configuration;
import android.support.v4.view.GravityCompat;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.Toast;

import com.popofibo.weatherpop.constants.WeatherPopConstants;
import com.popofibo.weatherpop.custom.ActionBarDrawerToggle;
import com.popofibo.weatherpop.custom.WeatherPopDrawerLayout;

/**
 * 
 * @author popofibo
 * 
 */
public class MainActivity extends FragmentActivity {

	/**
	 * New changes for navigation drawer
	 */
	private WeatherPopDrawerLayout drawLayout;
	private ListView drawerList;
	private LinearLayout linearLayout;
	private ActionBarDrawerToggle drawToggle;

	private CharSequence drawTitle;
	private CharSequence newTitle;
	private String[] options;
	private String option;
	private static String message;

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_main);

		/*
		 * New changes for navigation drawer start
		 */
		newTitle = drawTitle = getTitle();
		options = getResources().getStringArray(R.array.options_array);
		drawLayout = (WeatherPopDrawerLayout) findViewById(R.id.drawer_layout);

		linearLayout = (LinearLayout) findViewById(R.id.left_drawer);

		for (int i = 0; i < linearLayout.getChildCount(); i++) {
			if (linearLayout.getChildAt(i) instanceof ListView) {
				drawerList = (ListView) linearLayout.getChildAt(i);
			}
		}

		drawLayout.setDrawerShadow(R.drawable.drawer_shadow,
				GravityCompat.START);
		drawerList.setAdapter(new ArrayAdapter<String>(this,
				R.layout.drawer_list_item, options));
		drawerList.setOnItemClickListener(new DrawerItemClickListener());

		getActionBar().setDisplayHomeAsUpEnabled(true);
		getActionBar().setHomeButtonEnabled(true);

		drawToggle = new ActionBarDrawerToggle(this, drawLayout,
				R.drawable.ic_drawer, R.string.drawer_open,
				R.string.drawer_close) {

			public void onDrawerClosed(View view) {
				try {
					getActionBar().setTitle(newTitle);
					invalidateOptionsMenu();
				} catch (Exception e) {
					// Keeping it blank just to catch the navigation drawer NPE
				}
			}

			public void onDrawerOpened(View drawerView) {
				getActionBar().setTitle(drawTitle);
				invalidateOptionsMenu();
			}
		};
		drawLayout.setDrawerListener(drawToggle);

		if (savedInstanceState == null) {
			selectItem(0);
		}
		/*
		 * Navigation drawer ends
		 */

	}

	@Override
	public boolean onCreateOptionsMenu(Menu menu) {
		MenuInflater inflater = getMenuInflater();
		inflater.inflate(R.menu.main, menu);
		return super.onCreateOptionsMenu(menu);
	}

	@Override
	public boolean onPrepareOptionsMenu(Menu menu) {
		boolean drawerOpen = drawLayout.isDrawerOpen(linearLayout);
		menu.findItem(R.id.action_websearch).setVisible(!drawerOpen);
		return super.onPrepareOptionsMenu(menu);
	}

	@Override
	public boolean onOptionsItemSelected(MenuItem item) {
		if (drawToggle.onOptionsItemSelected(item)) {
			return true;
		}

		switch (item.getItemId()) {
		case R.id.action_websearch:
			Intent intent = new Intent(Intent.ACTION_WEB_SEARCH);
			intent.putExtra(SearchManager.QUERY, getActionBar().getTitle());

			if (intent.resolveActivity(getPackageManager()) != null) {
				startActivity(intent);
			} else {
				Toast.makeText(this, R.string.app_not_available,
						Toast.LENGTH_LONG).show();
			}
			return true;
		case R.id.action_refresh:
			intent = new Intent(this, WeatherPopDisplayActivity.class);

			intent.putExtra(WeatherPopConstants.EXTRA_MESSAGE, message);
			intent.putExtra(WeatherPopConstants.EXTRA_OPTION, option);
			startActivity(intent);
		default:
			return super.onOptionsItemSelected(item);
		}
	}

	private class DrawerItemClickListener implements
			ListView.OnItemClickListener {
		@Override
		public void onItemClick(AdapterView<?> parent, View view, int position,
				long id) {
			selectItem(position);
		}
	}

	private void selectItem(int position) {
		drawerList.setItemChecked(position, true);
		setTitle(options[position]);
		option = options[position];
		// drawLayout.closeDrawer(linearLayout);
	}

	@Override
	public void setTitle(CharSequence title) {
		newTitle = title;
		getActionBar().setTitle(newTitle);
	}

	@Override
	protected void onPostCreate(Bundle savedInstanceState) {
		super.onPostCreate(savedInstanceState);
		drawToggle.syncState();
	}

	@Override
	public void onConfigurationChanged(Configuration newConfig) {
		super.onConfigurationChanged(newConfig);
		drawToggle.onConfigurationChanged(newConfig);
	}

	public void sendMessage(View view) {
		Intent intent = new Intent(this, WeatherPopDisplayActivity.class);
		EditText editText = (EditText) findViewById(R.id.city_input);
		message = editText.getText().toString();
		intent.putExtra(WeatherPopConstants.EXTRA_MESSAGE, message);
		intent.putExtra(WeatherPopConstants.EXTRA_OPTION, option);
		startActivity(intent);
	}
}
