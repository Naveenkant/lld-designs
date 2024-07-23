package main.java.org.opcode.Instructions;

import main.java.org.opcode.model.Register;
import main.java.org.opcode.model.RegisterState;

public class DECInstruction implements Instruction {
    RegisterState microprocessor;
    Register register;

    public DECInstruction(RegisterState microprocessor, char registerName) {
        this.microprocessor = microprocessor;
        this.register = this.microprocessor.getRegister(registerName);
    }

    @Override
    public void execute() {
        int existingValue = this.register.getValue();
        this.register.setValue(existingValue - 1);

    }

}
