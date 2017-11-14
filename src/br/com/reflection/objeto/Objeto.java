package br.com.reflection.objeto;

import java.lang.reflect.Constructor;

public class Objeto {

	@SuppressWarnings("unchecked")
	public <E> E getInstancia(final Class<?> classe) throws Exception {
		return (E) classe.newInstance();
	}

	@SuppressWarnings("unchecked")
	public <E> E getInstancia(final Class<?> classe, final Object... params) throws Exception {
		final Class<?>[] paramType = new Class<?>[params.length];
		for (int i = 0; i < params.length; i++) {
			paramType[i] = params[i].getClass();
		}

		final Constructor<?> constructor = classe.getConstructor(paramType);

		return (E) constructor.newInstance(params);
	}

}
