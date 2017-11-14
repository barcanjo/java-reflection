package br.com.reflection.objeto;

public class Principal {

	public static void main(final String[] args) throws Exception {
		final Objeto objeto = new Objeto();

		final Usuario joao = objeto.getInstancia(Usuario.class);
		joao.setNome("Joao");

		final String email = "marcos@email.com";
		final String login = "m.marcos";
		final String nome = "Marcos";
		final String senha = "abc1234";

		final Usuario marcos = objeto.getInstancia(Usuario.class, email, login, nome, senha);

		System.out.println(joao);
		System.out.println(marcos);
	}

}
