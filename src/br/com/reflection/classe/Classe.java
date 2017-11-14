package br.com.reflection.classe;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.HashMap;
import java.util.Map;
import java.util.Properties;

public class Classe {

	private final Map<Class<?>, Class<?>> mapa = new HashMap<Class<?>, Class<?>>();

	public void carregar(final String nomeArquivo) throws FileNotFoundException, IOException, ClassNotFoundException {
		final Properties props = new Properties();
		props.load(new FileInputStream(nomeArquivo));

		for (final Object key : props.keySet()) {
			final Class<?> interf = Class.forName(key.toString());
			final Class<?> impl = Class.forName(props.get(key).toString());

			if (!interf.isAssignableFrom(impl)) {
				throw new RuntimeException(String.format("%s nao implementa %s", impl.getName(), interf.getName()));
			}

			this.mapa.put(interf, impl);
		}
	}

	public Class<?> getImplementacao(final Class<?> interf) {
		return this.mapa.get(interf);
	}
}
