package oop;

import oop.factory.CommandsFactory;
import oop.model.Memory;

public class Main {

    public static void main(String[] args) {
        String hello = "++++++++[>++++[>++>+++>+++>+<<<<-]>+>+>->>+[<]<-]>>.>---.+++++++..+++.>>.<-.<.+++.------.--------.>>+.>++.";

        Memory memory = Memory.getInstance();
        CommandsFactory commandsFactory = new CommandsFactory();

        Code code = new Code(hello, memory);

        for (Character character : code) {
            commandsFactory.getInstance(character).execute(memory, code);
        } 
    }
}
