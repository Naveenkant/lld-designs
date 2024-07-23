package MachineCodingRound.microprocessor;
import MachineCodingRound.microprocessor.constants.Constants;
import MachineCodingRound.microprocessor.repository.RegisterRepository;
import MachineCodingRound.microprocessor.services.RegisterServiceImpl;

import java.util.Scanner;

public class DemoClass {
    public static void main(String[] args) {
        RegisterRepository registerRepository = new RegisterRepository();
        RegisterServiceImpl registerService = new RegisterServiceImpl(registerRepository);
        Scanner scanner = new Scanner(System.in);
        while (true) {
            System.out.println("enter the input");
            String input = scanner.nextLine();
            input = input.trim();
            String[] inpArr = input.split(" ");
            try {
                switch (inpArr[0]) {
                    case Constants.SET: {
                        registerService.SET(inpArr[1], Integer.parseInt(inpArr[2]));
                    }
                    case Constants.INC: {
                        registerService.INC(inpArr[1]);
                    }
                    case Constants.DEC: {
                        registerService.DEC(inpArr[1]);
                    }
                    case Constants.MOVE: {
                        registerService.MOVE(inpArr[1], inpArr[2]);
                    }
                    case Constants.ADDR: {
                        registerService.ADDR(inpArr[1], inpArr[2], Integer.parseInt(inpArr[3]));
                    }
                }
            } catch (RuntimeException runtimeException) {
                System.out.println(runtimeException);
            }

        }

    }
}