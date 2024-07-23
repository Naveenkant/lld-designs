package main.java.org.opcode.Instructions;

import main.java.org.opcode.model.Register;
import main.java.org.opcode.model.RegisterState;

public class ADDInstruction implements  Instruction{
    RegisterState microprocessor;
    Register register1;
    int value;

    public ADDInstruction(RegisterState microprocessor, char register1, int  value) {
        this.microprocessor = microprocessor;
        this.register1 = this.microprocessor.getRegister(register1);
        this.value = value;

    }
    @Override
    public void execute() {
        int existingValue=register1.getValue();
        this.register1.setValue(existingValue+value);
    }

//    @Override
//    public boolean validation() {
//        return false;
//    }

}


