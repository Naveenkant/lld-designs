package main.java.org.opcode.service;

import main.java.org.opcode.Instructions.Instruction;
import main.java.org.opcode.Instructions.InstructionFactory;
import main.java.org.opcode.enums.Constants;
import main.java.org.opcode.exception.InvalidInstructionException;
import main.java.org.opcode.model.Register;
import main.java.org.opcode.model.RegisterState;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class MainService implements OpcodeSimulator {

    public static void main(String[] args) {

    }
    @Override
    public RegisterState execute(List<String> instructions) {
        RegisterState microprocessor = new RegisterState();
        try {
            for (String instructionString : instructions) {
                String inpArr[] = instructionString.split(" ");
                System.out.println(Arrays.toString(inpArr));
                switch (inpArr[0]) {
                    case Constants.SET: {
                        char registerName = inpArr[1].charAt(0);
                        Integer value = Integer.parseInt(inpArr[2]);
                        Instruction instruction = InstructionFactory.getSetInstruction(microprocessor, registerName, value);
                        microprocessor.executeInstruction(instruction);
                    }
                    break;
                    case Constants.ADR: {
                        char register1 = inpArr[1].charAt(0);
                        char register2 = inpArr[2].charAt(0);
                        Instruction instruction = InstructionFactory.getAdrInstruction(microprocessor, register1, register2);
                        microprocessor.executeInstruction(instruction);
                    }
                    break;
                    case Constants.ADD: {
                        char register = inpArr[1].charAt(0);
                        int value = Integer.parseInt(inpArr[2]);
                        Instruction instruction = InstructionFactory.getAddInstruction(microprocessor, register, value);
                        microprocessor.executeInstruction(instruction);
                    }
                    break;
                    case Constants.MOV: {
                        char register1 = inpArr[1].charAt(0);
                        char register2 = inpArr[2].charAt(0);
                        Instruction instruction = InstructionFactory.getMoveInstruction(microprocessor, register1, register2);
                        microprocessor.executeInstruction(instruction);
                    }
                    break;
                    case Constants.INR: {
                        char registerName = inpArr[1].charAt(0);
                        Instruction instruction = InstructionFactory.getInrInstruction(microprocessor, registerName);
                        microprocessor.executeInstruction(instruction);
                    }
                    break;
                    case Constants.DCR: {
                        char registerName = inpArr[1].charAt(0);
                        Instruction instruction = InstructionFactory.getDecInstruction(microprocessor, registerName);
                        microprocessor.executeInstruction(instruction);
                    }
                    break;
                    case Constants.RST: {
                        System.out.println("hello");
                        Instruction instruction = InstructionFactory.getRstInstruction(microprocessor);
                        microprocessor.executeInstruction(instruction);
                    }
                    break;
                    default:
                        throw new InvalidInstructionException("Invalid Instruction");
                }
            }
        } catch (InvalidInstructionException runtimeException) {
            System.out.println(runtimeException.getMessage());
        }

        return microprocessor;
    }
}
