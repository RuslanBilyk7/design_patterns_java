package com.patterns.template.assignment;

public class DesctopManufacture extends ComputerManufacture {

	@Override
	public String addHardDisk() {
		return "added hard disk to desctop\n";
	}

	@Override
	public String addRam(final String data) {
		return "added ram to desctop\n" + data;
	}

	@Override
	public String addKeyboard(final String data) {
		return "added keyboard to desctop\n " + data;
	}
}
