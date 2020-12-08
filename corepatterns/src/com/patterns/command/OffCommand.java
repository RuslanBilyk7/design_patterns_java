package com.patterns.command;

public class OffCommand implements Command {

	Television television;

	public OffCommand(final Television television) {
		this.television = television;
	}

	@Override
	public void execute() {
		television.off();
	}
}
