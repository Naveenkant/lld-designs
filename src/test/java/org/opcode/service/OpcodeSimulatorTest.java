package test.java.org.opcode.service;

import static org.junit.jupiter.api.Assertions.assertEquals;
import java.util.*;

import main.java.org.opcode.model.RegisterState;
import main.java.org.opcode.service.*;
import org.junit.jupiter.api.*;


@TestInstance (TestInstance.Lifecycle.PER_CLASS)
class OpcodeSimulatorTest {
    private OpcodeSimulator simulator;

    @BeforeEach
    void setup() {
       simulator=new MainService();
    }

    @Test
    void testSetInstructions() {
        List<String> instructions = new ArrayList<>();
        instructions.add("RST");
        instructions.add("SET A 1");
        instructions.add("SET B -2");
        instructions.add("SET C 3");
        instructions.add("SET D 4");
        final RegisterState state = simulator.execute(instructions);
        System.out.println(state.getRegister('A').getValue());
        assertEquals(1, state.getRegister('A').getValue());
        assertEquals(-2, state.getRegister('B').getValue());
        assertEquals(3, state.getRegister('C').getValue());
        assertEquals(4, state.getRegister('D').getValue());
    }

    @Test
    void testAddValueInstructions() {
        //      testing for subtraction
        List<String> instructions = new ArrayList<>();
        instructions.add("RST");
        instructions.add("SET A 11");
        instructions.add("ADD A -12");
        final RegisterState state = simulator.execute(instructions);
        assertEquals(-1, state.getRegister('A').getValue());
    }

    @Test
    void testAddRegisterInstructions() {
        List<String> instructions = new ArrayList<>();
        instructions.add("RST");
        instructions.add("SET C 5");
        instructions.add("SET D 2");
        instructions.add("ADR C D");
        final RegisterState state = simulator.execute(instructions);
        assertEquals(7, state.getRegister('C').getValue());
    }

    @Test
    void testMoveRegisterInstructions() {
        List<String> instructions = new ArrayList<>();
        instructions.add("RST");
        instructions.add("SET A 5");
        instructions.add("SET B 2");
        instructions.add("SET D 12");
        instructions.add("MOV B A");
        instructions.add("MOV D B");

        final RegisterState state = simulator.execute(instructions);
        System.out.println(state.getRegister('A').getValue());
        System.out.println(state.getRegister('B').getValue());
        System.out.println(state.getRegister('D').getValue());
        assertEquals(5, state.getRegister('B').getValue());
        assertEquals(5, state.getRegister('D').getValue());
    }

    @Test
    void testIncrementDecrementRegisterInstructions() {
        List<String> instructions = new ArrayList<>();
        instructions.add("RST");
        instructions.add("SET A 5");
        instructions.add("SET B 2");
        instructions.add("INR A");
        instructions.add("DCR B");
        final RegisterState state = simulator.execute(instructions);
        assertEquals(6, state.getRegister('A').getValue());
        assertEquals(1, state.getRegister('B').getValue());
    }

    @Test
    void testResetRegisterInstructions() {
        List<String> instructions = new ArrayList<>();
        instructions.add("RST");
        instructions.add("SET A 5");
        instructions.add("SET B 2");
        instructions.add("SET C 3");
        instructions.add("SET D 4");
        instructions.add("RST");
        final RegisterState state = simulator.execute(instructions);
        assertEquals(0, state.getRegister('A').getValue());
        assertEquals(0, state.getRegister('B').getValue());
        assertEquals(0, state.getRegister('C').getValue());
        assertEquals(0, state.getRegister('D').getValue());
    }

    @Test
    void testMultipleInstructionsWithNOOP() {
        List<String> instructions = new ArrayList<>();
        instructions.add("RST");
        instructions.add("SET A 10");
        instructions.add("SET B 14");
        instructions.add("ADD B 12");
        instructions.add("INR A");
        instructions.add("DCR B");
        final RegisterState state = simulator.execute(instructions);
        assertEquals(11, state.getRegister('A').getValue());
        assertEquals(25, state.getRegister('B').getValue());
    }
}
