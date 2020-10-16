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
import javax.swing.*;
import java.awt.event.*;
import java.time.LocalDate;
import java.util.ArrayList;
import java.util.Random;
import java.util.Scanner;
import java.util.logging.Level;
import java.util.logging.Logger;

public class Button extends JFrame{

public static void main(String[] args) {
    	
        
        
        SensorReceiver sensorReceiver = new SensorReceiver();
        SensorLogger sensorLogger = new SensorLogger();
        sensorReceiver.register(sensorLogger);
        sensorReceiver.addData(new SensorData("temperature",1.2));
        sensorReceiver.updateObservers();
        
        //LightOn LightOn = new LightOn(new Light());
	//LightOn.set();
	//System.out.println("Light is set ON");
	//LightHigh LightHigh = new LightOn(new LightHigh(new Light()));
	//LightHigh.set();
       
        FilterCache cached = new FilterCache();
        cached.loadCache();
        Filter c = null;
        System.out.println("Write R to choose your severity type moderate or W for severe");
        Scanner scan = new Scanner(System.in);
        String line = scan.nextLine();
        if (line.equals("R")) {
                c = cached.getFilter("moderate");
        } else if (line.equals("W")) {
                c = cached.getFilter("severe");
        }
        System.out.println("What's your disability type?(Head Injuries/Vision Disability/Hearing Disabiliy");
        line = scan.nextLine();
        String val = String.valueOf(line);
        c.setSize(val);

        System.out.println("What's the sensor type you need for?");
        line = scan.nextLine();
        String type = line;
        c.setFileType(type);

        System.out.println("You chose " + c.setFilter());

new Button();              
                            
}
    
private JButton button1;
private JButton button2;
private JButton button3;
private JButton button4;

public Button()
{
       
this.setSize(400,200);
this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
this.setTitle("Click Event");
        
Clicklistener click= new Clicklistener();
        
JPanel panel1= new JPanel();
button1= new JButton ("Light sensor");
button1.addActionListener(click);
panel1.add(button1);
button2= new JButton ("Temperature sensor");
button2.addActionListener(click);
panel1.add(button2);
button3= new JButton ("Noise sensor");
button3.addActionListener(click);
panel1.add(button3);
button4= new JButton ("Motion sensor");
button4.addActionListener(click);
panel1.add(button4);
this.add(panel1);
this.setVisible(true);

}


private class Clicklistener implements ActionListener
{
public void actionPerformed(ActionEvent e)
{
    LightOn LightOn = new LightOn(new Light());
    ArrayList<NotificationService> ns = new ArrayList<>();
	ns.add(new EmailNotification());
	ns.add(new TelephoneNotification());
	LoggingService log = new LoggingService();
	new Sensor(log, ns).start();
if (e.getSource() == button1)
{
    LightOn.set();
button1.setText("Sensor for light has been turned on");

SensorType light = SensorFactory.getType(SensorEnum.LIGHT);
        if (light != null) {
            light.set();
        } else {
            System.out.println("This type can not be set.");
        }
        
        
        while (true) {
            SensorEvent se = new SensorEvent(SensorEventType.Light, LocalDate.of(2011, 11, 22),"ROOM " + new Random().nextInt(5));
            System.out.println("-----------");
            log.process(se);
            ns.get(0).process(se);
            System.out.println("///////////");
            try {
                Thread.sleep(1000);
            } catch (InterruptedException ex) {
                Logger.getLogger(Button.class.getName()).log(Level.SEVERE, null, ex);
            }
        }
      
}
if (e.getSource() == button2)
{
button2.setText("Sensor for temperature has been turned on");
  
SensorType temperature = SensorFactory.getType(SensorEnum.TEMPERATURE);
    
        if (temperature != null) {
            temperature.set();
        } else {
            System.out.println("This type can not be set.");
        }
        
    RemoteControl control = new RemoteControl();
    Temperature temperature1 = new Temperature();
    Command temperatureHigh = new TemperatureHighCommand(temperature1);
    Command temperatureLow = new TemperatureLowCommand(temperature1);
    control.setCommand(temperatureHigh);
    control.pressButton();
    control.setCommand(temperatureLow);
    control.pressButton();
        
        while (true) {
            SensorEvent se = new SensorEvent(SensorEventType.Temperature, LocalDate.of(2011, 11, 22),"ROOM " + new Random().nextInt(5));
            System.out.println("-----------");
            log.process(se);
            ns.get(0).process(se);
            System.out.println("///////////");
            try {
                Thread.sleep(1000);
            } catch (InterruptedException ex) {
                Logger.getLogger(Button.class.getName()).log(Level.SEVERE, null, ex);
            }
        }
}
if (e.getSource() == button3)
{
button3.setText("Sensor for noise has been turned on");


SensorType noise = SensorFactory.getType(SensorEnum.NOISE);
        if (noise != null) {
            noise.set();
        } else {
            System.out.println("This type can not be set.");
        }
        
        while (true) {
            SensorEvent se = new SensorEvent(SensorEventType.Noise, LocalDate.of(2011, 11, 22),"ROOM " + new Random().nextInt(5));
            System.out.println("-----------");
            log.process(se);
            ns.get(0).process(se);
            System.out.println("///////////");
            try {
                Thread.sleep(1000);
            } catch (InterruptedException ex) {
                Logger.getLogger(Button.class.getName()).log(Level.SEVERE, null, ex);
            }
        }
      
}
if (e.getSource() == button4)
{
button4.setText("Sensor for motion has been turned on");


SensorType motion = SensorFactory.getType(SensorEnum.MOTION);
        if (motion != null) {
            motion.set();
        } else {
            System.out.println("This type can not be set.");
        }
        
        while (true) {
            SensorEvent se = new SensorEvent(SensorEventType.Motion, LocalDate.of(2011, 11, 22),"ROOM " + new Random().nextInt(5));
            System.out.println("-----------");
            log.process(se);
            ns.get(0).process(se);
            System.out.println("///////////");
            try {
                Thread.sleep(1000);
            } catch (InterruptedException ex) {
                Logger.getLogger(Button.class.getName()).log(Level.SEVERE, null, ex);
            }
        }
      
}
}

}
}