package com.cb.utils;

import java.text.DateFormat;
import java.util.Date;

public class Timer {
	public String getCurrentTime(){
		return new Date().toString().trim().substring(0,5);
	}
	public String getCurrentTime(DateFormat df){
		return df.format(new Date());
	}
	public void sTimer(){
		System.out.println("Started Stopwatch");
	}
}
