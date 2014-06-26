package com.test.hellorest;

import javax.ws.rs.core.Application;
import java.util.HashSet;
import java.util.Set;

public class RSApplication extends Application {
	private Set<Object> singletons = new HashSet<Object>();
	private Set<Class<?>> empty = new HashSet<Class<?>>();

	public RSApplication() {
		singletons.add(new TextosResource());
	}

	@Override
	public Set<Class<?>> getClasses() {
		return empty;
	}

	@Override
	public Set<Object> getSingletons() {
		return singletons;
	}
}