package smarthomesdt;
import java.time.LocalDate;
import java.util.ArrayList;
import java.util.Random;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author cristina
 */

public class Sensor extends Thread {
	private LoggingService log;
	private ArrayList<NotificationService> ns;

	public Sensor(LoggingService lg, ArrayList<NotificationService> ns) {
		super();
		this.log = lg;
		this.ns = ns;
		for (int i = 0; i < ns.size() - 1; i++) {
			ns.get(i).setNext(ns.get(i + 1));
		}
	}

	/*public void run() {
		try {
			while (true) {
				SensorEvent se = new SensorEvent(SensorEventType.getRandomSensorEventType(), LocalDate.of(2011, 11, 22),
						"ROOM " + new Random().nextInt(5));
				System.out.println("-----------");
				log.process(se);
				ns.get(0).process(se);
				System.out.println("///////////");
				Thread.sleep(1000);
			}
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
	}*/

}