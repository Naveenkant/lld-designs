package MachineCodingRound.microprocessorWithCMDpattern.Instructions;

import MachineCodingRound.microprocessorWithCMDpattern.Microprocessor;

public class InstructionFactory {

    InstructionFactory() {
    }

    public static Instruction getAdrInstruction( Microprocessor microprocessor,String register1, String register2 ){
        return new AddRInstruction( microprocessor,register1, register2);
    }

    public static Instruction getDecInstruction(Microprocessor microProcessor,String register) {
        return new DecInstruction(microProcessor,register);
    }

    public static Instruction getIncInstruction(Microprocessor microProcessor,String register) {
        return new IncInstruction(microProcessor, register);
    }

    public static Instruction getMoveInstruction(Microprocessor microProcessor,String register1, String register2) {
        return new MoveInstruction(microProcessor,register1, register2);
    }

    public static Instruction getSetInstruction(Microprocessor microProcessor,String register, Integer value) {
        return new SetInstruction( microProcessor,register, value);
    }

}
