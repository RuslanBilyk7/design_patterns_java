package com.patterns.command;

public class OnCommand implements Command {

	Television television;

	public OnCommand(final Television television) {
		this.television = television;
	}

	@Override
	public void execute() {
		television.on();
	}
}
