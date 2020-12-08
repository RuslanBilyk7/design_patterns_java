package com.patterns.command;

public class RemoteControl {
	private Command command;

	public void pressBtutton(){
		command.execute();
	}

	public Command getCommand() {
		return command ;
	}

	public void setCommand(final Command command) {
		this.command = command;
	}
}
