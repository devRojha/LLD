package VendingMachineDesign.States;

import VendingMachineDesign.Entities.Item;
import VendingMachineDesign.Entities.VendingMachine;
import VendingMachineDesign.Enums.Coins;

import java.util.List;

public class Dispense implements State{

    public Dispense(VendingMachine vendingMachine, int productCode) throws Exception {
        System.out.println("Dispense constructor");
        dispenseProduct(vendingMachine, productCode);
    }

    @Override
    public void clickOnInsertCoin(VendingMachine vendingMachine) throws Exception {
        throw new Exception("Not supported yet.");
    }

    @Override
    public void insertCoin(VendingMachine vendingMachine, Coins coins) throws Exception {
        throw new Exception("Not supported yet.");
    }

    @Override
    public void clickProductSelectionButton(VendingMachine vendingMachine) throws Exception {
        throw new Exception("clickProductSelectionButton supported yet.");
    }

    @Override
    public void selectProduct(VendingMachine vendingMachine, int productCode) throws Exception {
        throw new Exception("selectProduct supported yet.");
    }

    @Override
    public Item dispenseProduct(VendingMachine vendingMachine, int productCode) throws Exception {
        System.out.println("Dispense product of code " + productCode);
        return vendingMachine.getInventory().getItemByCode(productCode);
    }

    @Override
    public int returnChange(VendingMachine vendingMachine, int changeAmount) throws Exception {
        throw new Exception("return change not allowed");
    }

    @Override
    public List<Coins> refundCoins(VendingMachine vendingMachine) throws Exception {
        throw new Exception("refund coins not allowed");
    }
}
