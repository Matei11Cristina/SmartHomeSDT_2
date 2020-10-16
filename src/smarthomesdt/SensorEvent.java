/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package smarthomesdt;
import java.time.LocalDate;
/**
 *
 * @author cristina
 */


public class SensorEvent {
	private SensorEventType eventType;
	private LocalDate timeStamp;
	private String location;

	public SensorEvent(SensorEventType eventType, LocalDate timeStamp, String location) {
		super();
		this.eventType = eventType;
		this.timeStamp = timeStamp;
		this.location = location;
	}

	public SensorEventType getEventType() {
		return eventType;
	}

	public void setEventType(SensorEventType eventType) {
		this.eventType = eventType;
	}

	public LocalDate getTimeStamp() {
		return timeStamp;
	}

	public void setTimeStamp(LocalDate timeStamp) {
		this.timeStamp = timeStamp;
	}

	public String getLocation() {
		return location;
	}

	public void setLocation(String location) {
		this.location = location;
	}

	@Override
	public String toString() {
		return "[eventType=" + eventType + ", timeStamp=" + timeStamp + ", location=" + location + "]";
	}

}
