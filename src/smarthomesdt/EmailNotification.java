package smarthomesdt;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author cristina
 */
public class EmailNotification implements NotificationService {
	private NotificationService nextInChain;

	@Override
	public void setNext(NotificationService nextInChain) {
		this.nextInChain = nextInChain;

	}

	@Override
	public void process(SensorEvent request) {
		System.out.println("Email was sent for event " + request.toString());
		nextInChain.process(request);

	}

}
