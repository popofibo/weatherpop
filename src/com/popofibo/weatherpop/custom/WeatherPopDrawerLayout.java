package com.popofibo.weatherpop.custom;

import android.content.Context;
import android.util.AttributeSet;
import android.view.Gravity;
import android.view.View;

/**
 * 
 * @author popofibo
 * 
 */
public class WeatherPopDrawerLayout extends DrawerLayout {

	public WeatherPopDrawerLayout(Context context) {
		super(context);
		// TODO Auto-generated constructor stub
	}

	public WeatherPopDrawerLayout(Context context, AttributeSet attrs) {
		super(context, attrs);
		// TODO Auto-generated constructor stub
	}

	public WeatherPopDrawerLayout(Context context, AttributeSet attrs,
			int defStyle) {
		super(context, attrs, defStyle);
		// TODO Auto-generated constructor stub
	}

	protected boolean isContentView(View child) {
		if (child == null) {
			return false;
		}
		return ((LayoutParams) child.getLayoutParams()).gravity == Gravity.NO_GRAVITY;
	}

}
