package MachineCodingRound.microprocessorWithCMDpattern.enums;

public enum InstructionKeywords {
        ADR_INSTRUCTION("ADR"),
        ADD_INSTRUCTION("ADD"),
        DCR_INSTRUCTION("DCR"),
        INR_INSTRUCTION("INR"),
        MOV_INSTRUCTION("MOV"),
        RST_INSTRUCTION("RST"),
        SET_INSTRUCTION("SET");

        private final String name;
        private InstructionKeywords(String name){
            this.name = name;
        }

        public String getName() {
            return name;
        }


}
