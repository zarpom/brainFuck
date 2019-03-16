package oop.commands.impl;

import oop.commands.Command;
import oop.model.Memory;

public class EmptyCommand implements Command {

    public void execute(Memory memory) {
        System.out.println("We have no this command!"); 
    }

}
