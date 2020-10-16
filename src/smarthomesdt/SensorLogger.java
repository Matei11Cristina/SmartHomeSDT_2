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
public class SensorLogger implements Observer {

    @Override
    public void update(SensorData sensorData) {

  
        System.out.println(String.format("Received sensor data %s: %f",sensorData.getSensor(),sensorData.getMeasure()));
    }

}

