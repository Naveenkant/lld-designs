package MachineCodingRound.microprocessorWithCMDpattern.Instructions;

import MachineCodingRound.microprocessor.dto.Register;
import MachineCodingRound.microprocessorWithCMDpattern.Microprocessor;

public class AddRInstruction  implements Instruction{
    Microprocessor microprocessor;
    Register register1;
    Register register2;

    public AddRInstruction(Microprocessor microprocessor, String register1,String register2) {
        this.microprocessor = microprocessor;
        this.register1 = this.microprocessor.getRegister(register1);
        this.register2=this.microprocessor.getRegister(register2);

    }
    @Override
    public void execute() {
        int value1 = register1.getValue();
        int value2 = register2.getValue();
        register1.setValue(value1+value2);
    }

    @Override
    public boolean validate() {
        return false;
    }
}
