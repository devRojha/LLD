package VendingMachineDesign;

import VendingMachineDesign.Entities.Item;
import VendingMachineDesign.Entities.ItemSelf;
import VendingMachineDesign.Entities.VendingMachine;
import VendingMachineDesign.Enums.Coins;
import VendingMachineDesign.Enums.ItemTypes;
import VendingMachineDesign.States.State;

public class DriverVendingMachine {
    public static void main(String[] args) {

        try {
            //1 create a vending machine object;
            int inventorySize = 10;
            VendingMachine vendingMachine = new VendingMachine(inventorySize);

            //2 populate the inventory
            populateInventory(vendingMachine);

            //3 click on insert Coin
            State currentState = vendingMachine.getState();
            currentState.clickOnInsertCoin(vendingMachine);

            //4 insert coin
            currentState = vendingMachine.getState();
            currentState.insertCoin(vendingMachine, Coins.FIVE);
            currentState.insertCoin(vendingMachine, Coins.FIVE);

            //5 click on product selection button
            currentState = vendingMachine.getState();
            currentState.clickProductSelectionButton(vendingMachine);

            //6 select product and despense product and return change
            currentState = vendingMachine.getState();
            currentState.selectProduct(vendingMachine, 101);


            //7 return change


            //8 return refund on cancelation
        }
        catch (Exception e) {
            System.out.println(e.getMessage());
        }

    }

    private static void populateInventory(VendingMachine vendingMachine) {
        ItemSelf[] inventory = vendingMachine.getInventory().getInventory();

        int size = inventory.length;
        for (int index = 0; index < size; index++) {
            Item item = new Item();
            if (index < 4) {
                item.setType(ItemTypes.PEPSI);
                item.setPrice(ItemTypes.PEPSI.getPrice());
            }
            else if (index < 8) {
                item.setType(ItemTypes.LAYS);
                item.setPrice(ItemTypes.LAYS.getPrice());
            }
            else {
                item.setType(ItemTypes.CHOCOLATE);
                item.setPrice(ItemTypes.CHOCOLATE.getPrice());
            }
            inventory[index].setItem(item);
            inventory[index].setAvailable(true);
        }
    }
}