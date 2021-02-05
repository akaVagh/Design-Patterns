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
public class SmartPhoneRepairer implements RepairGadget {

    @Override
    public void repair(Gadget gadget) {
        SmartPhone smartPhone = (SmartPhone) gadget;
        System.out.println("Repairing your " + smartPhone.getClass().getName());
        smartPhone.setStatus("Working");
        System.out.println("Your " + smartPhone.getClass().getName() + " now working");
    }
}
