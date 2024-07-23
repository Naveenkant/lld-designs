package MachineCodingRound.microprocessorWithCMDpattern.Instructions;

import MachineCodingRound.microprocessor.dto.Register;
import MachineCodingRound.microprocessorWithCMDpattern.Microprocessor;

public class SetInstruction implements Instruction {
    Microprocessor microprocessor;
    Register register;
    int value;

    public SetInstruction(Microprocessor microprocessor, String registerName,int value) {
        this.microprocessor = microprocessor;
        this.register = this.microprocessor.getRegister(registerName);
        this.value = value;
    }
    @Override
    public void execute() {
        this.register.setValue(value);
    }

    @Override
    public boolean validate() {
        return false;
    }
}
