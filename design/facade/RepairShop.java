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
public class RepairShop {

    private RepairGadget smartPhoneRepairer;
    private RepairGadget digitalWatchRepairer;

    public RepairShop() {
        smartPhoneRepairer = new SmartPhoneRepairer();
        digitalWatchRepairer = new DigitalWatchRepairer();
    }

    public void repairSmartPhone(SmartPhone smartPhone) {
        smartPhoneRepairer.repair(smartPhone);
    }

    public void repairDigitalWatch(DigitalWatch digitalWatch) {
        digitalWatchRepairer.repair(digitalWatch);
    }
}
