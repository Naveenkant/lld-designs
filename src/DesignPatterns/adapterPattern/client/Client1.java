package DesignPatterns.adapterPattern.client;

import DesignPatterns.adapterPattern.adaptee.WeightMachineForBabies;
import DesignPatterns.adapterPattern.adaptee.WeightMachine;
import DesignPatterns.adapterPattern.adapter.WMAdapterImpl;
import DesignPatterns.adapterPattern.adapter.WeightMachineAdapter;

public class Client1 {
    public static void main(String[] args) {
        WeightMachine weightMachineBaby=new WeightMachineForBabies();
        WeightMachineAdapter weightMachineAdapter=new WMAdapterImpl(weightMachineBaby);
        weightMachineAdapter.getWeightInKg();
    }
}
