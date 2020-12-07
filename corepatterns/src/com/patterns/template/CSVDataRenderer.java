package com.patterns.template;

public class CSVDataRenderer extends DataRenderer {

	@Override
	public String readData() {
		return "CSV data";
	}

	@Override
	public String processData(final String data) {
		return "Processed " + data;
	}
}
