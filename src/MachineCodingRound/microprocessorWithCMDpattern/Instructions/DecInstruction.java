package MachineCodingRound.microprocessorWithCMDpattern.Instructions;

import MachineCodingRound.microprocessor.dto.Register;
import MachineCodingRound.microprocessorWithCMDpattern.Microprocessor;

public class DecInstruction implements Instruction {
    Microprocessor microprocessor;
    Register register;

    public DecInstruction(Microprocessor microprocessor, String registerName) {
        this.microprocessor = microprocessor;
        this.register = this.microprocessor.getRegister(registerName);
    }

    @Override
    public void execute() {
        int existingValue = this.register.getValue();
        this.register.setValue(existingValue - 1);

    }

    @Override
    public boolean validate() {
        return false;
    }
}
