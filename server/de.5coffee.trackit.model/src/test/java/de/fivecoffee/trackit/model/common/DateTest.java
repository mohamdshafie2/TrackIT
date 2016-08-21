package de.fivecoffee.trackit.model.common;

import java.util.Calendar;

import org.junit.Test;

import junit.framework.Assert;

public class DateTest {
	@Test
	public void createFromJavaDate() {
		Calendar calendar = Calendar.getInstance();
		Integer year = 2016;
		Integer month = 8;
		Integer day = 21;
		calendar.set(year, month, day);
		java.util.Date javaDate = calendar.getTime();
		Date date = Date.fromJavaData(javaDate);
		Assert.assertEquals(year, date.getYear());
		Assert.assertEquals(month, date.getMonth());
		Assert.assertEquals(day, date.getDay());
	}
	
	@Test
	public void testConstructor() {
		Integer year = 2016;
		Integer month = 8;
		Integer day = 21;
		Date date = new Date(day, month, year);
		Assert.assertEquals(year, date.getYear());
		Assert.assertEquals(month, date.getMonth());
		Assert.assertEquals(year, date.getYear());
	}
}
