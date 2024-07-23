package MachineCodingRound.microprocessor.services;

import MachineCodingRound.microprocessor.dto.Register;
import MachineCodingRound.microprocessor.repository.RegisterRepository;

public class RegisterServiceImpl implements RegisterService {

    RegisterRepository registerRepository;
    public RegisterServiceImpl(RegisterRepository registerRepository) {
        this.registerRepository = registerRepository;
    }
    /*
    SET
    INC
    MOVE
    DEC
    ADDR
     */
    public void SET(String name,int value){
        if(registerRepository.isAlreadyPresent(name)){
            System.out.println("Register already exists");
        }else{
            Register register = new Register(name,value);
            registerRepository.addRegister(register);
            System.out.println("Register added");
        }
    }
    public void INC(String name){
        if(registerRepository.isAlreadyPresent(name)){
           Register register = registerRepository.getRegister(name);
           int existingValue=register.getValue();
           register.setValue(existingValue+1);
           System.out.println("Register value increased");
        }else{
           throw new RuntimeException("Register not exists");
        }
    }
    public void MOVE(String register1,String register2){

        if(registerRepository.isAlreadyPresent(register1) && registerRepository.isAlreadyPresent(register2)){
            Register r1 = registerRepository.getRegister(register1);
            Register r2 = registerRepository.getRegister(register2);
            r1.setValue(r2.getValue());

            System.out.println("Register value moved from Register 2 to Register 1");
        }else{
            throw new RuntimeException("Register not exists");
        }
    }
    public void DEC(String name){
        if(registerRepository.isAlreadyPresent(name)){
            Register register = registerRepository.getRegister(name);
            int existingValue=register.getValue();
            register.setValue(existingValue-1);
            System.out.println("Register value decreased");
        }else{
            throw new RuntimeException("Register not exists");
        }
    }
    public void ADDR(String register1,String register2,int value){
        if(registerRepository.isAlreadyPresent(register1) &&
                registerRepository.isAlreadyPresent(register2)){
            Register r1 = registerRepository.getRegister(register1);
            Register r2 = registerRepository.getRegister(register2);
            int totalValue=r1.getValue()+r2.getValue();
            r1.setValue(totalValue);

            System.out.println("Register values added and transferred to Register 1 ");
        }else{
            throw new RuntimeException("Register not exists");
        }
    }
}
