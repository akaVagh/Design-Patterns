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
public class Test {

    public static void main(String[] args) {
        RepairShop repairShop = new RepairShop();
        SmartPhone sp1 = new SmartPhone();
        sp1.setName("Samsung Note 3");
        sp1.setStatus("Working");
        DigitalWatch dw1 = new DigitalWatch();
        dw1.setName("Sony SpeedX");
        dw1.setStatus("Working");
        System.out.println("Using devices");
        System.out.println("Devices' Status:");
        System.out.println(sp1.getName() + " is " + sp1.getStatus());
        System.out.println(dw1.getName() + " is " + dw1.getStatus());
        System.out.println("Devices got problem");
        sp1.setStatus("Not Working");
        dw1.setStatus("Not Working");
        System.out.println("Devices' Status:");
        System.out.println(sp1.getName() + " is " + sp1.getStatus());
        System.out.println(dw1.getName() + " is " + dw1.getStatus());
        System.out.println("Devices sent for repairing");
        repairShop.repairSmartPhone(sp1);
        repairShop.repairDigitalWatch(dw1);
        System.out.println("Devices' Status after repairing");
        System.out.println(sp1.getName() + " is " + sp1.getStatus());
        System.out.println(dw1.getName() + " is " + dw1.getStatus());
    }

}
