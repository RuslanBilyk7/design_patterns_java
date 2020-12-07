package com.patterns.template.assignment;

public abstract class ComputerManufacture {

	public void buildComputer() {
		final String data = addHardDisk();
		final String ramData = addRam(data);
		final String keyboardData = addKeyboard(ramData);
		System.out.println(keyboardData);
	}

	public abstract String addHardDisk();

	public abstract String addRam(String data);

	public abstract String addKeyboard(String data);

}
