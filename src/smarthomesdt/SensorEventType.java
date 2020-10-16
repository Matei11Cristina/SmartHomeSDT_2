/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package smarthomesdt;

/**
 *
 * @author cristina
 */

import java.util.Random;

public enum SensorEventType {
        Light, Temperature, Noise, Motion;
	private static final SensorEventType[] VALUES = values();
	private static final int SIZE = VALUES.length;
	private static final Random RANDOM = new Random();

	//public static SensorEventType getRandomSensorEventType() {
		//return VALUES[RANDOM.nextInt(SIZE)];
                //return Light;

	//}

}
