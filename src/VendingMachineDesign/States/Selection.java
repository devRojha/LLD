package VendingMachineDesign.States;

import VendingMachineDesign.Entities.Inventory;
import VendingMachineDesign.Entities.Item;
import VendingMachineDesign.Entities.VendingMachine;
import VendingMachineDesign.Enums.Coins;

import java.util.ArrayList;
import java.util.List;

public class Selection implements State{

    public Selection() {
        System.out.println("Currently at Selection");
    }

    @Override
    public void clickOnInsertCoin(VendingMachine vendingMachine) throws Exception {
        throw new Exception("Operation not allowed yet");
    }

    @Override
    public void insertCoin(VendingMachine vendingMachine, Coins coins) throws Exception {
        throw new Exception("Insert Coin operation not allowed yet");
    }

    @Override
    public void clickProductSelectionButton(VendingMachine vendingMachine) throws Exception {
        throw new Exception("Clicked on Product operation not allowed yet");
    }

    @Override
    public void selectProduct(VendingMachine vendingMachine, int productCode) throws Exception {
        List<Coins> coinsList = vendingMachine.getCoinList();

        Inventory inventory = vendingMachine.getInventory();
        int totalAmount = 0;
        for (Coins coin : coinsList) {
            totalAmount += coin.getValue();
        }

        Item item = inventory.getItemByCode(productCode);
        System.out.println("productCode : "+ productCode +  ", item price : " + item.getPrice() +  ", your amount : " + totalAmount);
        if (item.getPrice() <= totalAmount) {
            vendingMachine.setState(new Dispense(vendingMachine, productCode));
            int leftAmount = totalAmount - item.getPrice();
            returnChange(vendingMachine, leftAmount);
        }
        else {
            refundCoins(vendingMachine);
        }
    }

    @Override
    public Item dispenseProduct(VendingMachine vendingMachine, int productCode) throws Exception {
        throw new Exception("Dispense operation not allowed yet");
    }

    @Override
    public int returnChange(VendingMachine vendingMachine, int changeAmount) throws Exception {
        System.out.println("Return Change amount " + changeAmount);
        return changeAmount;
    }

    @Override
    public List<Coins> refundCoins(VendingMachine vendingMachine) throws Exception {
        System.out.println("Refund Coins initiated");
        for (int i = 0; i < vendingMachine.getCoinList().size(); i++) {
            System.out.println("Refunding coin " + vendingMachine.getCoinList().get(i));
        }
        return vendingMachine.getCoinList();
    }
}
