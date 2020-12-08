package com.patterns.command;

public class Person {

	public static void main(String[] args) {
		Television television = new Television();
		RemoteControl remoteControl = new RemoteControl();

		OnCommand onCommand = new OnCommand(television);
		remoteControl.setCommand(onCommand);
		remoteControl.pressBtutton();

		OffCommand offCommand=new OffCommand(television);
		remoteControl.setCommand(offCommand);
		remoteControl.pressBtutton();
	}

}
