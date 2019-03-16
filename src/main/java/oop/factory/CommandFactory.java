package oop.factory;

import java.util.ArrayList;
import java.util.List;

import oop.commands.Command;
import oop.commands.impl.EmptyCommand;
import oop.commands.impl.LoopCommand;
import oop.commands.impl.MinusCommand;
import oop.commands.impl.NextCommand;
import oop.commands.impl.PlusCommand;
import oop.commands.impl.PreviousCommand;
import oop.commands.impl.PrintCommand;

public class CommandFactory {

    public List<Command> createFor(String programCode) {
        List<Command> list = new ArrayList<Command>();
        int level = 0;
        int startLoopIndex = 0;
        char[] input = programCode.toCharArray();

        for (int i = 0; i < programCode.length(); i++) {
            if (input[i] == '[') {
                if (level == 0)
                    startLoopIndex = i;
                level++;
            } else if (input[i] == ']') {
                level--;
                if (level == 0) {
                    String loopInput = programCode.substring(startLoopIndex + 1, i);
                    list.add(new LoopCommand(createFor(loopInput)));
                }
            } else if (level == 0) {
                list.add(getSimpleCommand(input[i]));
            }

        }
        return list;
    }

    private Command getSimpleCommand(Character character) {
        if (character == '+') {
            return new PlusCommand();
        } else if (character == '>') {
            return new NextCommand();
        } else if (character == '<') {
            return new PreviousCommand();
        } else if (character == '-') {
            return new MinusCommand();
        } else if (character == '.') {
            return new PrintCommand();
        }
        return new EmptyCommand();
    }
}