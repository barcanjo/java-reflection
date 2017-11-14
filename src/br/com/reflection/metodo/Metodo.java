package br.com.reflection.metodo;

import java.lang.reflect.Method;

public class Metodo {

	public Object invocar(final Object object, final String nomeMetodo, final Class<?>[] tiposParametro, final Object[] valores) throws Exception {
		final Class<?> classe = object.getClass();

		final Method metodo = classe.getDeclaredMethod(nomeMetodo, tiposParametro);
		System.out.println(String.format("Executando metodo %s da classe %s", metodo.getName(), object.getClass().getName()));
		return metodo.invoke(object, valores);
	}
}
