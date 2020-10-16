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
public class LightOn extends LightDecorator {

	public LightOn(Light l) {
		super(l);
	}

	@Override
	public void set(){
		super.set();
		System.out.print(" Light on");
	}
}

