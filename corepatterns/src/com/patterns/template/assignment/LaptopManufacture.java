package com.patterns.template.assignment;

public class LaptopManufacture extends ComputerManufacture {

	@Override
	public String addHardDisk() {
		return "added hard disk to laptop\n";
	}

	@Override
	public String addRam(final String data) {
		return "added ram to laptop\n " + data;
	}

	@Override
	public String addKeyboard(final String data) {
		return "added keyboard to laptop\n" + data;
	}
}
