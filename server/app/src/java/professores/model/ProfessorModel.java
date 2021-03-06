package professores.model;


public class ProfessorModel {
	private long idProf;
	private String emailProf, senha, nome, descricaoApresentacao, foto;
	private double avaliacao, precoHora;
	private int numeroAvaliacoes, idMunicipio, idUf, idMateria, numeroAlunosMin, numeroAlunosMax;

	public ProfessorModel(long idProf, String emailProf, String senha, String nome, String descricaoApresentacao, double avaliacao, double precoHora, int numeroAvaliacoes, int idMunicipio, int idUf, int idMateria, int numeroAlunosMin, int numeroAlunosMax, String foto) {
		this.idProf = idProf;
		this.emailProf = emailProf;
		this.senha = senha;
		this.nome = nome;
		this.descricaoApresentacao = descricaoApresentacao;
		this.avaliacao = avaliacao;
		this.precoHora = precoHora;
		this.numeroAvaliacoes = numeroAvaliacoes;
		this.idMunicipio = idMunicipio;
		this.idUf = idUf;
		this.idMateria = idMateria;
		this.numeroAlunosMin = numeroAlunosMin;
		this.numeroAlunosMax = numeroAlunosMax;
		this.foto = foto;
	}
	
	public long getIdProf() {
		return idProf;
	}

	public void setIdProf(long idProf) {
		this.idProf = idProf;
	}

	public String getEmailProf() {
		return emailProf;
	}

	public void setEmailProf(String emailProf) {
		this.emailProf = emailProf;
	}

	public String getSenha() {
		return senha;
	}

	public void setSenha(String senha) {
		this.senha = senha;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public String getDescricaoApresentacao() {
		return descricaoApresentacao;
	}

	public void setDescricaoApresentacao(String descricaoApresentacao) {
		this.descricaoApresentacao = descricaoApresentacao;
	}

	public double getAvaliacao() {
		return avaliacao;
	}

	public void setAvaliacao(double avaliacao) {
		this.avaliacao = avaliacao;
	}

	public double getPrecoHora() {
		return precoHora;
	}

	public void setPrecoHora(double precoHora) {
		this.precoHora = precoHora;
	}

	public int getNumeroAvaliacoes() {
		return numeroAvaliacoes;
	}

	public void setNumeroAvaliacoes(int numeroAvaliacoes) {
		this.numeroAvaliacoes = numeroAvaliacoes;
	}

	public int getIdMunicipio() {
		return idMunicipio;
	}

	public void setIdMunicipio(int idMunicipio) {
		this.idMunicipio = idMunicipio;
	}

	public int getIdUf() {
		return idUf;
	}

	public void setIdUf(int idUf) {
		this.idUf = idUf;
	}

	public int getIdMateria() {
		return idMateria;
	}

	public void setIdMateria(int idMateria) {
		this.idMateria = idMateria;
	}

	public int getNumeroAlunosMin() {
		return numeroAlunosMin;
	}

	public void setNumeroAlunosMin(int numeroAlunosMin) {
		this.numeroAlunosMin = numeroAlunosMin;
	}

	public int getNumeroAlunosMax() {
		return numeroAlunosMax;
	}

	public void setNumeroAlunosMax(int numeroAlunosMax) {
		this.numeroAlunosMax = numeroAlunosMax;
	}
	
	public String getFoto(){
		return foto;
	}
	
	public void setFoto(String foto){
		this.foto = foto;
	}
	
}
