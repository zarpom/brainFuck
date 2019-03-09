package oop.factory;

import oop.commands.Command;
import oop.commands.impl.EmptyCommand;
import oop.commands.impl.MinusCommand;
import oop.commands.impl.NextCommand;
import oop.commands.impl.PlusCommand;
import oop.commands.impl.PreviousCommand;
import oop.commands.impl.PrintCommand;

public class CommandsFactory {

    public Command getInstance(char symbol) {
        if (symbol == '>') {
            return new NextCommand();
        } else if (symbol == '<') {
            return new PreviousCommand();
        } else if (symbol == '+') {
            return new PlusCommand();
        } else if (symbol == '-') {
            return new MinusCommand();
        } else if (symbol == '.') {
            return new PrintCommand();
        } else if (symbol == '[' || symbol == ']') {
            return new EmptyCommand();
        } else {
            throw new RuntimeException("Wrong symbol: " + symbol);
        }
    }
}