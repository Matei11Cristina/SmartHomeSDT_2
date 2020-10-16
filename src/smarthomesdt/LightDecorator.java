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
public class LightDecorator implements SensorType {

	protected Light light;
	
	public LightDecorator( Light l){
		this.light=l;
	}
	
	@Override
	public void set() {
		this.light.set();
	}

}

