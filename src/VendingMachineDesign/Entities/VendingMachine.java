package VendingMachineDesign.Entities;

import VendingMachineDesign.Enums.Coins;
import VendingMachineDesign.States.IdleState;
import VendingMachineDesign.States.State;

import java.util.ArrayList;
import java.util.List;

public class VendingMachine {
    State state;
    Inventory inventory;
    List<Coins> coinList;

    public VendingMachine(int size) {
        state = new IdleState();
        coinList = new ArrayList<>();
        inventory = new Inventory(size);
    }

    public State getState() {
        return state;
    }

    public void setState(State state) {
        this.state = state;
    }

    public List<Coins> getCoinList() {
        return coinList;
    }

    public Inventory getInventory() {
        return inventory;
    }
}
