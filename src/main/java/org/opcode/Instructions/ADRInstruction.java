
package main.java.org.opcode.Instructions;

import main.java.org.opcode.model.Register;
import main.java.org.opcode.model.RegisterState;

public class ADRInstruction implements Instruction {
    RegisterState microprocessor;
    Register register1;
    Register register2;

    public ADRInstruction(RegisterState microprocessor, char register1, char register2) {
        this.microprocessor = microprocessor;
        this.register1 = this.microprocessor.getRegister(register1);
        this.register2 = this.microprocessor.getRegister(register2);

    }

    @Override
    public void execute() {
        int value1 = register1.getValue();
        int value2 = register2.getValue();
        register1.setValue(value1 + value2);
    }

}
