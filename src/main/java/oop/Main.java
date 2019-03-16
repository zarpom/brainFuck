package oop;

import java.util.List;

import oop.commands.Command;
import oop.factory.CommandFactory;
import oop.model.Memory;

public class Main {
    
    public static void main(String[] args) {
        String hello = "++++++++[>++++[>++>+++>+++>+<<<<-]>+>+>->>+[<]<-]>>.>---.+++++++..+++.>>.<-.<.+++.------.--------.>>+.>++.";

        Memory memory = Memory.getInstance();
        CommandFactory commandFactory = new CommandFactory();
        List<Command> commands = commandFactory.createFor(hello);
        for (Command command : commands) {
            command.execute(memory);
        }
    }
}