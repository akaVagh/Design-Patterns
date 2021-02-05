/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package design.facade;

/**
 *
 * @author harsh vaghani
 */
public class DigitalWatchRepairer implements RepairGadget {

    @Override
    public void repair(Gadget gadget) {
        DigitalWatch digitalWatch = (DigitalWatch) gadget;
        System.out.println("Repairing your " + digitalWatch.getClass().getName());
        digitalWatch.setStatus("Working");
        System.out.println("Your " + digitalWatch.getClass().getName() + " now working");
    }
}
