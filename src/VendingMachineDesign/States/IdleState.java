package VendingMachineDesign.States;

import VendingMachineDesign.Entities.Item;
import VendingMachineDesign.Entities.VendingMachine;
import VendingMachineDesign.Enums.Coins;

import java.util.List;

public class IdleState implements State {

    public IdleState() {
        System.out.println("Currently at IdleState");
    }

    @Override
    public void clickOnInsertCoin(VendingMachine vendingMachine) {
        System.out.println("Clicked on insert coin changing state to ready state");
        vendingMachine.setState(new ReadyState());
    }

    @Override
    public void insertCoin(VendingMachine vendingMachine, Coins coins) throws Exception {
        throw new Exception("insertion of coin not allowed");
    }

    @Override
    public void clickProductSelectionButton(VendingMachine vendingMachine) throws Exception {
        throw new Exception("click product selection button not allowed");
    }

    @Override
    public void selectProduct(VendingMachine vendingMachine, int productCode) throws Exception {
        throw new Exception("selection of product not allowed");
    }

    @Override
    public Item dispenseProduct(VendingMachine vendingMachine, int productCode) throws Exception {
        throw new Exception("product dispense not allowed");
    }

    @Override
    public int returnChange(VendingMachine vendingMachine, int changeAmount) throws Exception {
        throw new Exception("return change not allowed");
    }

    @Override
    public List<Coins> refundCoins(VendingMachine vendingMachine) throws Exception {
        throw new Exception("No refund available");
    }
}
