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
/*/
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
