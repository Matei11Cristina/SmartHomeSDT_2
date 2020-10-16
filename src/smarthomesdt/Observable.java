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

public interface Observable {

    void register(Observer observer);

    void unregister(Observer observer);

    void updateObservers();

}