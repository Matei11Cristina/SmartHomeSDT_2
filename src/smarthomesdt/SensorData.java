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
public class SensorData {

    private final String sensor;
    private final Double measure;

    public SensorData(String sensor, Double measure) {
        this.sensor = sensor;
        this.measure = measure;
    }

    public String getSensor() {
        return sensor;
    }

    public Double getMeasure() {
        return measure;
    }
}
