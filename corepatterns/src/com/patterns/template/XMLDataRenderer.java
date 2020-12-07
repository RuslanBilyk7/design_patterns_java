package com.patterns.template;

public class XMLDataRenderer extends DataRenderer {

	@Override
	public String readData() {
		return "XML data";
	}

	@Override
	public String processData(final String data) {
		return "Processed " + data;
	}
}
