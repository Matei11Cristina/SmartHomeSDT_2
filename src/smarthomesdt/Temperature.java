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
public class Temperature implements SensorType {
    @Override
    public void set() {
        System.out.println("Temperature Sensor Set.");
    }
   
        public void high() 
    { 
        System.out.println("Temperature is high"); 
    } 
    public void low() 
    { 
        System.out.println("Temperature is low"); 
    } 
}
