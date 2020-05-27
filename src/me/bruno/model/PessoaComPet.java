package me.bruno.model;

public class PessoaComPet {
	
	private String nome;
	private int idade;
	private Cachorro cachorro;
	String[] videoGames = {"PS4","XBOX-ONE","MINI ARCADE"};

	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public int getIdade() {
		return idade;
	}
	public void setIdade(int idade) {
		this.idade = idade;
	}
	public Cachorro getCachorro() {
		return cachorro;
	}
	public void setCachorro(Cachorro cachorro) {
		this.cachorro = cachorro;
	}
	public String[] getVideoGames() {
		return videoGames;
	}
	public void setVideoGames(String[] videoGames) {
		this.videoGames = videoGames;
	}
}
