package com.patterns.abstractfactory;

abstract class DaoAbstractFactory {

	public abstract Dao createDao(String type);
}
