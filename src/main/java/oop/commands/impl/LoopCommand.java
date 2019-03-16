package oop.commands.impl;

import java.util.List;

import oop.commands.Command;
import oop.model.Memory;

public class LoopCommand implements Command {
    List<Command> commands;

    public LoopCommand(List<Command> commands) {
        this.commands = commands;
    }

    public void execute(Memory memory) {
        do {
            for (Command command : commands) {
                command.execute(memory);
            }
        } while (memory.getCurrentMemoryByte() != 0);
    }

}
