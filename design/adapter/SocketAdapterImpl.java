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
public class SocketAdapterImpl implements SocketAdapter {

    Socket socket = new SocketImpl();
    Voltage providerVoltage;
    Voltage consumerVoltageMax;

    @Override
    public Voltage get5V() {
        return convertTo(5);
    }

    @Override
    public Voltage get3V() {
        return convertTo(3);
    }

    @Override
    public Voltage get12V() {
        return convertTo(12);
    }

    public SocketAdapterImpl() {
        providerVoltage = socket.getVolt();
        float downMaxVolt = 12.0f;
        float divisor = providerVoltage.getVolt() / downMaxVolt;
        int cVMax = (int) (providerVoltage.getVolt() / divisor);
        consumerVoltageMax = new Voltage(cVMax);
    }

    private Voltage convertTo(int oV) {
        int outputVoltValue = (int) ((consumerVoltageMax.getVolt() / consumerVoltageMax.getVolt()) * oV);
        return new Voltage(outputVoltValue);
    }
}
