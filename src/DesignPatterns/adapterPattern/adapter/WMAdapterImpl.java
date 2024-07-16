package DesignPatterns.adapterPattern.adapter;

import DesignPatterns.adapterPattern.adaptee.WeightMachine;

public class WMAdapterImpl implements WeightMachineAdapter{
    WeightMachine weightMachine;
    public WMAdapterImpl(WeightMachine weightMachine) {
        this.weightMachine = weightMachine;
    }
    @Override
    public double getWeightInKg() {
        System.out.println("weight in kg from pounds");
        return weightMachine.getWeightInPounds()*.49;
    }
}
