package oop.commands;

import oop.model.Memory;

public interface Command {
	public abstract void execute(Memory memory);
}
