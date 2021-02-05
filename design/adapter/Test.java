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
public class Test {

    public static void main(String[] args) {
        SocketAdapter adapter = new SocketAdapterImpl();
        Voltage volt3 = adapter.get3V();
        Voltage volt5 = adapter.get5V();
        Voltage volt12 = adapter.get12V();
        System.out.println("Getting 3V from adapter: OutputVolt = " + volt3.getVolt());
        System.out.println("Getting 5V from adapter: OutputVolt = " + volt5.getVolt());
        System.out.println("Getting 12V from adapter: OutputVolt = " + volt12.getVolt());
    }
}
