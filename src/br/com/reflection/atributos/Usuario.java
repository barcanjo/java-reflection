package br.com.reflection.atributos;

public class Usuario {

	private String email;
	private String login;
	private String nome;
	private String senha;

	public Usuario() {
	}

	public Usuario(final String email, final String login, final String nome, final String senha) {
		this.email = email;
		this.login = login;
		this.nome = nome;
		this.senha = senha;
	}

	@Override
	public String toString() {
		return "Usuario [email=" + this.email + ", login=" + this.login + ", nome=" + this.nome + ", senha=" + this.senha + "]";
	}

}
