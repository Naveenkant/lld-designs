package adapterPattern.client;

import adapterPattern.adaptee.WeightMachineForBabies;
import adapterPattern.adaptee.WeightMachine;
import adapterPattern.adapter.WMAdapterImpl;
import adapterPattern.adapter.WeightMachineAdapter;

public class Client1 {
    public static void main(String[] args) {
        WeightMachine weightMachineBaby=new WeightMachineForBabies();
        WeightMachineAdapter weightMachineAdapter=new WMAdapterImpl(weightMachineBaby);
        weightMachineAdapter.getWeightInKg();
    }
}
