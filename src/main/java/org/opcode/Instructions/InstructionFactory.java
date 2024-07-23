package main.java.org.opcode.Instructions;

import main.java.org.opcode.model.RegisterState;

public class InstructionFactory {

    InstructionFactory() {
    }
    public static Instruction getAddInstruction(RegisterState microprocessor, char register, int value ){
        return new ADDInstruction( microprocessor,register, value);
    }

    public static Instruction getAdrInstruction(RegisterState microprocessor, char register1, char register2 ){
        return new ADRInstruction( microprocessor,register1, register2);
    }

    public static Instruction getDecInstruction(RegisterState microProcessor,char register) {
        return new DECInstruction(microProcessor,register);
    }

    public static Instruction getInrInstruction(RegisterState microProcessor,char register) {
        return new INRInstruction(microProcessor, register);
    }

    public static Instruction getMoveInstruction(RegisterState microProcessor,char register1, char register2) {
        return new MOVEInstruction(microProcessor,register1, register2);
    }

    public static Instruction getSetInstruction(RegisterState microProcessor,char register, Integer value) {
        return new SETInstruction( microProcessor,register, value);
    }

    public static Instruction getRstInstruction(RegisterState microProcessor) {
        return new RSTInstruction(microProcessor);
    }

}
