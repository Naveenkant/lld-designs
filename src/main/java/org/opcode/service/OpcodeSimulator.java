package main.java.org.opcode.service;

import main.java.org.opcode.model.RegisterState;

import java.util.List;


public interface OpcodeSimulator {
    RegisterState execute(List<String> instructions);
}
