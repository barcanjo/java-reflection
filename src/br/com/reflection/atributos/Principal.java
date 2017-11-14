package br.com.reflection.atributos;

public class Principal {

	public static void main(final String[] args) throws Exception {
		final Usuario usuario = new Usuario();

		final GeradorXML geradorXML = new GeradorXML();
		geradorXML.setValue(usuario, "email", "usuario@email.com");
		geradorXML.setValue(usuario, "login", "usuario123");
		geradorXML.setValue(usuario, "nome", "Usuario");
		geradorXML.setValue(usuario, "senha", "abc1234");

		System.out.println(geradorXML.get(usuario));
	}

}
