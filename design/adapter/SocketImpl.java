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
public class SocketImpl implements Socket {

    Voltage volt;

    public SocketImpl() {
        volt = new Voltage(230);
    }

    @Override
    public Voltage getVolt() {
        return volt;
    }
}
