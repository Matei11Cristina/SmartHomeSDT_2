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
public abstract class SensorFactory {
    public static SensorType getType(SensorEnum type) {
        SensorType typeS = null;
        switch (type) {
            case TEMPERATURE:
                typeS = new Temperature();
                break;
            case NOISE:
                typeS = new Noise();
                break;
            case MOTION:
                typeS = new Motion();
                break;
            case LIGHT:
                typeS = new Light();
                break;
        }
        return typeS;
    }
}
