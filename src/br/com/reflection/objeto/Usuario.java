package br.com.reflection.objeto;

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

	public String getEmail() {
		return this.email;
	}

	public String getLogin() {
		return this.login;
	}

	public String getNome() {
		return this.nome;
	}

	public String getSenha() {
		return this.senha;
	}

	public void setEmail(final String email) {
		this.email = email;
	}

	public void setLogin(final String login) {
		this.login = login;
	}

	public void setNome(final String nome) {
		this.nome = nome;
	}

	public void setSenha(final String senha) {
		this.senha = senha;
	}

	@Override
	public String toString() {
		return "Usuario [email=" + this.email + ", login=" + this.login + ", nome=" + this.nome + ", senha=" + this.senha + "]";
	}

}
