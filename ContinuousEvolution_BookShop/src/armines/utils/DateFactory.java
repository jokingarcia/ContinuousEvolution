package armines.utils;

/********************************************************************************
 * Copyright (c) 2013 INRIA. 
 * All rights reserved. This program and the accompanying materials 
 * are made available under the terms of the Eclipse Public License v1.0 
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 *  
 * Contributors: 
 * 	INRIA - Initial implementation
 *********************************************************************************/


import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Date;

/**
 * 	@author <a href="mailto:matthieu.allon@gmail.com">Matthieu Allon</a>
 */
public enum DateFactory {
	INSTANCE;
	private Date actualDate = new Date();
	
	/**
	 * Get the actual year
	 * Format example : "2013"
	 * */
	public static String getActualYear(){
		DateFormat dateFormat = new SimpleDateFormat("yyyy");
		return dateFormat.format(INSTANCE.actualDate);
	}
	
	/**
	 * Get the actual month and year
	 * Format example : "july 2013"
	 * */
	public static String getActualMonthAndYear(){
		DateFormat dateFormat = new SimpleDateFormat("MMMM yyyy");
		return dateFormat.format(INSTANCE.actualDate);
	}
	
	/**
	 * Get the actual date and time
	 * Format example : "13_07_2013_14_40_25"
	 * */
	public static String getActualDate(){
		DateFormat dateFormat = new SimpleDateFormat("dd_MM_yyyy_HH_mm_ss");
		return dateFormat.format(INSTANCE.actualDate);
	}

}