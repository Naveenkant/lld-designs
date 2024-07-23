package main.java.org.opcode.Instructions;


import main.java.org.opcode.model.Register;
import main.java.org.opcode.model.RegisterState;

public class SETInstruction implements Instruction {
    RegisterState microprocessor;
    Register register;
    int value;

    public SETInstruction(RegisterState microprocessor, char registerName, int value) {
        this.microprocessor = microprocessor;
        this.register = this.microprocessor.getRegister(registerName);
        this.value = value;
    }
    @Override
    public void execute() {

        this.register.setValue(value);
    }

}
