package main.java.org.opcode.Instructions;

import main.java.org.opcode.model.Register;
import main.java.org.opcode.model.RegisterState;

public class MOVEInstruction implements Instruction {
    RegisterState microprocessor;
    Register register1;
    Register register2;

    public MOVEInstruction(RegisterState microprocessor, char register1, char register2) {
        this.microprocessor = microprocessor;
        this.register1 = this.microprocessor.getRegister(register1);
        this.register2 = this.microprocessor.getRegister(register2);
    }
    @Override
    public void execute() {
        int value2=this.register2.getValue();
        this.register1.setValue(value2);
    }

}
