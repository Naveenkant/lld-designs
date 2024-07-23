package main.java.org.opcode;

import main.java.org.opcode.Instructions.Instruction;
import main.java.org.opcode.Instructions.InstructionFactory;
import main.java.org.opcode.enums.Constants;
import main.java.org.opcode.exception.InvalidInstructionException;
import main.java.org.opcode.model.Register;
import main.java.org.opcode.model.RegisterState;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class MainClass {
    public static void main(String[] args) {

        List<Register>registers = initialize();

        RegisterState microprocessor = new RegisterState();
        Scanner scanner = new Scanner(System.in);

        while (true) {
            System.out.println("enter the input");
            String input = scanner.nextLine();
            input = input.trim();
            String[] inpArr = input.split(" ");
            try {
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
                        Instruction instruction = InstructionFactory.getRstInstruction(microprocessor);
                        microprocessor.executeInstruction(instruction);
                    }
                    default:
                        throw new InvalidInstructionException("Invalid Instruacion");
                }

            } catch (RuntimeException runtimeException) {
                System.out.println(runtimeException.getMessage());
            }
        }
    }
    public static List<Register> initialize() {

        List<Register> registers = new ArrayList<>();
        Register register1 = new Register('A');
        Register register2 = new Register('B');
        Register register3 = new Register('C');
        Register register4 = new Register('D');
        registers.add(register1);
        registers.add(register2);
        registers.add(register3);
        registers.add(register4);
        return registers;
    }
}