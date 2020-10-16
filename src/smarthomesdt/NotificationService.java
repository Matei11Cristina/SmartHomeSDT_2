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
public interface NotificationService {
	public abstract void setNext(NotificationService nextInChain);

	public abstract void process(SensorEvent request);
}
