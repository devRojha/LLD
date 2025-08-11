package VendingMachineDesign.States;

import VendingMachineDesign.Entities.Item;
import VendingMachineDesign.Entities.VendingMachine;
import VendingMachineDesign.Enums.Coins;

import java.util.List;

public interface State {

    public void clickOnInsertCoin(VendingMachine vendingMachine) throws Exception;

    public void insertCoin(VendingMachine vendingMachine, Coins coins) throws Exception;

    public void clickProductSelectionButton(VendingMachine vendingMachine) throws Exception;

    public void selectProduct(VendingMachine vendingMachine, int productCode) throws Exception;

    public Item dispenseProduct(VendingMachine vendingMachine, int productCode) throws Exception;

    public int returnChange(VendingMachine vendingMachine, int changeAmount) throws Exception;

    public List<Coins> refundCoins(VendingMachine vendingMachine) throws Exception;

}