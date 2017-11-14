package br.com.reflection.classe;

import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.List;
import java.util.Map;

public class Principal {

	public static void main(final String[] args) throws FileNotFoundException, ClassNotFoundException, IOException {
		final Classe classe = new Classe();
		classe.carregar("interfaces.properties");

		final Class<?> implList = classe.getImplementacao(List.class);
		final Class<?> implMap = classe.getImplementacao(Map.class);

		System.out.println(implList.getName());
		System.out.println(implMap.getName());
	}

}
