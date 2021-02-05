/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package design.adapter;

/**
 *
 * @author harsh vaghani
 */
public interface SocketAdapter {

    public Voltage get5V();

    public Voltage get3V();

    public Voltage get12V();
}
