package MachineCodingRound.microprocessorWithCMDpattern;

import MachineCodingRound.microprocessor.repository.RegisterRepository;
import MachineCodingRound.microprocessor.services.RegisterServiceImpl;
import MachineCodingRound.microprocessorWithCMDpattern.Instructions.Instruction;
import MachineCodingRound.microprocessorWithCMDpattern.Instructions.InstructionFactory;
import MachineCodingRound.microprocessorWithCMDpattern.enums.Constants;
import MachineCodingRound.microprocessorWithCMDpattern.exception.InvalidInstructionException;

import java.util.Scanner;

public class App {
    public static void main(String[] args) {
        Microprocessor microprocessor = new Microprocessor();
        Scanner scanner = new Scanner(System.in);

        while (true) {
            System.out.println("enter the input");
            String input = scanner.nextLine();
            input = input.trim();
            String[] inpArr = input.split(" ");
            try {
                switch (inpArr[0]) {
                    case Constants.SET: {
                        String registerName = inpArr[1];
                        Integer value = Integer.parseInt(inpArr[2]);
                        Instruction instruction = InstructionFactory.getSetInstruction(microprocessor, registerName, value);
                        microprocessor.executeInstruction(instruction);
                    }
                    break;
                    case Constants.INC:{
                        String registerName = inpArr[1];
                        Instruction instruction = InstructionFactory.getIncInstruction(microprocessor, registerName);
                        microprocessor.executeInstruction(instruction);
                    }
                    break;
                    case Constants.DEC:{
                        String registerName = inpArr[1];
                        Instruction instruction = InstructionFactory.getDecInstruction(microprocessor, registerName);
                        microprocessor.executeInstruction(instruction);
                    }
                    case Constants.MOVE:{
                        String register1 = inpArr[1];
                        String register2 = inpArr[2];
                        Instruction instruction = InstructionFactory.getMoveInstruction(microprocessor, register1, register2);
                        microprocessor.executeInstruction(instruction);
                    }
                    break;
                    case Constants.ADDR:{
                        String register1 = inpArr[1];
                        String register2 = inpArr[2];
                        Instruction instruction= InstructionFactory.getAdrInstruction(microprocessor, register1, register2);
                        microprocessor.executeInstruction(instruction);
                    }
                    default:
//                        throw new RuntimeException("Invalid Instruction!");
                        throw new InvalidInstructionException("Invalid Instruacion");
                }

            } catch (RuntimeException runtimeException) {
                System.out.println(runtimeException.getMessage());
            }
        }
    }
}
