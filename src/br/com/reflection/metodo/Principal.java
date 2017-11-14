package br.com.reflection.metodo;

public class Principal {

	public static void main(final String[] args) throws Exception {
		final Usuario usuario = new Usuario();

		final Metodo metodo = new Metodo();
		metodo.invocar(usuario, "definirPadrao", null, null);

		System.out.println(usuario);

		final Class<?>[] parametros = {String.class, String.class};
		final String[] valores = {"usuario123", "abc9878"};

		final boolean sucesso = (Boolean) metodo.invocar(usuario, "alterarSenha", parametros, valores);

		if (sucesso) {
			System.out.println("Sucesso!");
			System.out.println(usuario);
		} else {
			System.err.print("Erro");
		}
	}

}
