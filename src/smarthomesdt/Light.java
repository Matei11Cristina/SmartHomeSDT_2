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
public class Light implements SensorType {
    @Override
    public void set() {
        System.out.println("Light Sensor Set.");
        
    }
}
