package br.com.reflection.metodo;

public class Usuario {

	private String email;
	private String login;
	private String nome;
	private String senha;

	public boolean alterarSenha(final String login, final String senha) {
		if (this.login.equals(login)) {
			this.senha = senha;
			return true;
		}
		return false;
	}

	public void definirPadrao() {
		this.email = "usuario123@empresa.com";
		this.login = "usuario123";
		this.nome = "Usuario";
		this.senha = "4321";
	}

	@Override
	public String toString() {
		return "Usuario [email=" + this.email + ", login=" + this.login + ", nome=" + this.nome + ", senha=" + this.senha + "]";
	}

}
