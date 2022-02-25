package com.ngs.Row40;

//import java.sql.Date;
import java.util.Calendar;
import java.util.Timer;
import java.util.TimerTask;
import java.util.Calendar;
import java.util.Timer;
//import java.util.concurrent.ScheduledFuture;
import java.util.concurrent.*;
import java.util.TimerTask;
import java.util.Date;
import java.util.*;
/**
 * @author NGS017
 *
 */
public class ExecuteCretainstatement   
{

	public static void main(String[] args) throws InterruptedException{
		// TODO Auto-generated method stub

		/*Calendar calendar = Calendar.getInstance();
		calendar.set(Calendar.HOUR_OF_DAY, 48);
		calendar.set(Calendar.MINUTE, 19);
		calendar.set(Calendar.SECOND, 0);
		java.util.Date time = calendar.getTime();
		System.out.println(time);
		Timer timer = new Timer();
		System.out.println(timer);
		ScheduledTask st = new ScheduledTask();
		timer.schedule(new RemindTask(),0,time);*/
		/*Timer time = new Timer(); // Instantiate Timer Object
		ScheduledTask st = new ScheduledTask(); // Instantiate SheduledTask class
		
		time.schedule(st, 0, 1000); // Create Repetitively task for every 1 secs

		//for demo only.
		for (int i = 0; i <= 5; i++) {
			System.out.println("Execution in Main Thread...." + i);
			Thread.sleep(2000);
			if (i == 5) {
				System.out.println("Application Terminates");
				System.exit(0);
			}
		}
		
		 
		Timer timer = new Timer(); // Instantiate Timer Object
		ScheduledFuture st1 = new ScheduledTask(); // Instantiate 
		//SheduledTask class
		time.schedule((TimerTask) st1, 0, 1000); // Create Repetitively task for every 1*/
		


		 
		 
				Timer time = new Timer(); // Instantiate Timer Object
				ScheduledTask st = new ScheduledTask(); // Instantiate SheduledTask class
				time.schedule(st, 0, 1000); // Create Repetitively task for every 1 secs

				//for demo only.
				for (int i = 0; i <= 5; i++) {
					System.out.println("Execution in Main Thread...." + i);
					Thread.sleep(2000);
					if (i == 5) {
						System.out.println("Application Terminates");
						System.exit(0);
					}
				}
			}
		
		  
	
	}
}
