package br.com.reflection.atributos;

import java.lang.reflect.Field;

public class GeradorXML {

	public String get(final Object object) throws Exception {
		final Class<?> classe = object.getClass();

		final StringBuilder sb = new StringBuilder();
		sb.append(String.format("<%s>\n", classe.getSimpleName()));

		for (final Field campo : classe.getDeclaredFields()) {
			campo.setAccessible(true);
			sb.append(String.format("<%s>%s</%s>\n", campo.getName(), campo.get(object), campo.getName()));
		}

		sb.append(String.format("</%s>", classe.getSimpleName()));

		return sb.toString();
	}

	public void setValue(final Object obj, final String nomeCampo, final String valor) throws Exception {
		final Class<?> classe = obj.getClass();
		final Field campo = classe.getDeclaredField(nomeCampo);
		campo.setAccessible(true);
		campo.set(obj, valor);
	}
}
