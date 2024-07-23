package main.java.org.opcode.Instructions;

import main.java.org.opcode.model.RegisterState;

public class RSTInstruction implements Instruction {
    RegisterState microprocessor;

    public RSTInstruction(RegisterState microprocessor) {
        this.microprocessor = microprocessor;
    }
    @Override
    public void execute() {
       microprocessor.reset();
    }
}

