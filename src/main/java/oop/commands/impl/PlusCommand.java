package oop.commands.impl;

import oop.commands.Command;
import oop.model.Memory;

public class PlusCommand implements Command {

    public void execute(Memory memory) { 
        memory.increment(); 
    }
}
