package MachineCodingRound.microprocessorWithCMDpattern;

import MachineCodingRound.microprocessor.dto.Register;
import MachineCodingRound.microprocessorWithCMDpattern.Instructions.Instruction;
import MachineCodingRound.microprocessorWithCMDpattern.exception.InvalidInstructionException;

import java.util.HashMap;

public class Microprocessor {

    HashMap<String, Register>registerHashMap;

    public Microprocessor() {
        registerHashMap = new HashMap<>();
        initializeRegisters();
    }
    public void initializeRegisters(){
        addRegister("A");
        addRegister("B");
        addRegister("C");
        addRegister("D");
    }
    public void executeInstruction(Instruction instruction){
        if(instruction.validate()){
            instruction.execute();
        }else{
            throw new InvalidInstructionException("Invalid Instruction");
        }

    }
    public void addRegister(String name ) {
        Register register=new Register(name,0);
        registerHashMap.put(name,register);
    }
    public Register getRegister(String name) {
        return registerHashMap.get(name);
    }
    public boolean isAvailableRegister(String name){
        return registerHashMap.containsKey(name);
    }
}
