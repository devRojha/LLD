package VendingMachineDesign.States;

import VendingMachineDesign.Entities.Item;
import VendingMachineDesign.Entities.VendingMachine;
import VendingMachineDesign.Enums.Coins;

import java.util.List;

public class ReadyState implements State {

    public ReadyState() {
        System.out.println("Currently at ReadyState");
    }
    @Override
    public void clickOnInsertCoin(VendingMachine vendingMachine) throws Exception {
        System.out.println("Clicked on insert coin changing state to ready state");
        vendingMachine.setState(new ReadyState());
    }

    @Override
    public void insertCoin(VendingMachine vendingMachine, Coins coins) throws Exception {
        vendingMachine.getCoinList().add(coins);
        System.out.println ("Added coin of value : " + coins.getValue() + " to my VendingMachine");
    }

    @Override
    public void clickProductSelectionButton(VendingMachine vendingMachine) throws Exception {
        System.out.println("Clicked on product selection state to Selection state");
        vendingMachine.setState(new Selection());
    }

    @Override
    public void selectProduct(VendingMachine vendingMachine, int productCode) throws Exception {
        throw new Exception("Select operation not allowed yet");
    }

    @Override
    public Item dispenseProduct(VendingMachine vendingMachine, int productCode) throws Exception {
        throw new Exception("Dispense operation not allowed yet");
    }

    @Override
    public int returnChange(VendingMachine vendingMachine, int changeAmount) throws Exception  {
        throw new Exception("Return operation not allowed yet");
    }

    @Override
    public List<Coins> refundCoins(VendingMachine vendingMachine) throws Exception {
        throw new  Exception("Refund operation not allowed yet");
    }
}
