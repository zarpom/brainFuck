package oop.commands.impl;

import oop.Code;
import oop.commands.Command;
import oop.model.Memory;

public class PrintCommand implements Command {

    public void execute(Memory memory, Code code) {
        memory.printValue();

    }

}
