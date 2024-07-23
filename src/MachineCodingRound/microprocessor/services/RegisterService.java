package MachineCodingRound.microprocessor.services;

import MachineCodingRound.microprocessor.dto.Register;

public interface RegisterService {
    public void SET(String name,int value);
    public void INC(String name);
    public void MOVE(String register1,String register2);
    public void DEC(String name);
    public void ADDR(String register1,String register2,int value);

}
