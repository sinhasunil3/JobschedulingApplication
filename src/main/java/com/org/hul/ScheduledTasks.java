package com.org.hul;

import java.util.Date;
import java.text.SimpleDateFormat;
import java.util.Date;

import org.springframework.scheduling.annotation.Scheduled;
import org.springframework.stereotype.Component;
import org.springframework.scheduling.annotation.Scheduled;
@Component
public class ScheduledTasks {
	
	private static final SimpleDateFormat dateFormat = new SimpleDateFormat(
			"MM/dd/yyyy HH:mm:ss");
	
	/*
	 * @Scheduled(initialDelay = 1000, fixedRate = 10000) public void
	 * performDelayedTask() {
	 * 
	 * System.out.println("Delayed Regular task performed at " +
	 * dateFormat.format(new Date()));
	 * 
	 * }
	 */
	
	@Scheduled(cron = "*/7 * * * * *")
	public void performTaskUsingCron() {

		System.out.println("Regular task performed using Cron at "
				+ dateFormat.format(new Date()));

	}
	
}
