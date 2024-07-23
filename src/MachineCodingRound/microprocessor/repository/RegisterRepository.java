package MachineCodingRound.microprocessor.repository;

import MachineCodingRound.microprocessor.dto.Register;

import java.util.*;

public class RegisterRepository {
    Map<String, Register> registers ;

    public RegisterRepository() {
        registers = new HashMap<>();
        registers.put("A", new Register("A",0));
        registers.put("B", new Register("B",0));
        registers.put("C", new Register("C",0));
        registers.put("D", new Register("D",0));
    }

  public void addRegister(Register register){
        registers.put(register.getName(),register);
  }
  public void updateRegister(Register updatedRegister){

        if(!registers.containsKey(updatedRegister.getName())){
            throw new RuntimeException("Register not found");
        }
        registers.put(updatedRegister.getName(),updatedRegister);
         System.out.println("Register value changed");
  }

    public  Register getRegister(String name) {
        return registers.get(name);
    }
    public boolean isAlreadyPresent(String name) {
        return registers.containsKey(name);
    }

}
