package com.patterns.abstractfactory;

class DaoFactoryProducer {

	private DaoFactoryProducer() {
	}

	public static DaoAbstractFactory produce(final String factoryType) {
		DaoAbstractFactory daf = null;

		if (factoryType.equals("xml")) {
			daf = new XMLDaoFactory();
		}
		else if (factoryType.equals("db")) {
			daf = new DBDaoFactory();
		}

		return daf;

	}
}
