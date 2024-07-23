package main.java.org.opcode.model;

import main.java.org.opcode.Instructions.Instruction;
import main.java.org.opcode.exception.InvalidInstructionException;
import main.java.org.opcode.model.Register;
import main.java.org.opcode.service.OpcodeSimulator;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class RegisterState  {
    private Map<Character, Register> registersMap;

    public RegisterState() {
       registersMap = new HashMap<>();
       initialize();
    }
    public void initialize() {
        List<Register> registers = new ArrayList<>();
        Register register1 = new Register('A');
        Register register2 = new Register('B');
        Register register3 = new Register('C');
        Register register4 = new Register('D');
        registersMap.put('A', register1);
        registersMap.put('B', register2);
        registersMap.put('C', register3);
        registersMap.put('D', register4);
    }
    public void addRegister(char ch){
        registersMap.put(ch, new Register(ch));
    }

//    public void updateValue(Register register) {
//        if (!registers.containsKey(register.getName())) {
//            throw new RuntimeException(String.format("The register %s is not present", register.getName()));
//        }
//        registers.put(register.getName(), register);
//    }
    public void executeInstruction(Instruction instruction) {

            instruction.execute();


    }
    public Register getRegister(Character registerChar) {
        if (!registersMap.containsKey(registerChar)) {
            throw new RuntimeException(String.format("The register %s is not present", registerChar));
        }
        return registersMap.get(registerChar);
    }

    public void reset() {
       for(char c: registersMap.keySet()){
           Register register = registersMap.get(c);
           register.setValue(0);
           registersMap.put(c,register);
       }
    }

}
