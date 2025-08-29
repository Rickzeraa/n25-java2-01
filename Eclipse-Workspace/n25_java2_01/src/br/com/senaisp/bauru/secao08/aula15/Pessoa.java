package br.com.senaisp.bauru.secao08.aula15;

public abstract class Pessoa {
	private static int contador = 0;
	private String nome;
	private int id;
	private String documento;
	private String endereco;
	private String dataNascimento;
	private char tipoPessoa;
	//Constructor
	public Pessoa() {
		carregarId();
	}
	//Sobrecarga de Constructor
	public Pessoa(String nom, String doc, String ende, String dtNas) 
			throws DocumentoException, EnderecoException {
		carregarId();
		setNome(nom);
		setDocumento(doc);
		setEndereco(ende);
		setDataNascimento(dtNas);
	}
	private void carregarId() {
		id = ++contador;
	}
	protected char getTipoPessoa() {
		return tipoPessoa;
	}
	protected void setTipoPessoa(char tipoPessoa) {
		this.tipoPessoa = tipoPessoa;
	}
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public String getDocumento() {
		return documento;
	}
	public void setDocumento(String documento) throws DocumentoException {
		if (isDocumentoValido(documento)) {
			this.documento = documento;
		} else {
			throw new DocumentoException("Documento Inválido de acordo com o "
					+ "tipo de pessoa!");
		}
	}
	
	protected abstract boolean isDocumentoValido(String documento2);
	
	public String getEndereco() {
		return endereco;
	}
	public void setEndereco(String endereco) throws EnderecoException {
		if (!endereco.isEmpty()) {
			this.endereco = endereco;
		} else {
			throw new EnderecoException("Endereço deve ser preenchido!");
		}
	}
	public String getDataNascimento() {
		return dataNascimento;
	}
	public void setDataNascimento(String dataNascimento) {
		this.dataNascimento = dataNascimento;
	}
	public int getId() {
		return id;
	}
	//Métodos
	@Override
	public String toString() {
		return "=".repeat(20) + "\n" +
			   "Id: " + getId() + "\n" +
			   "Tipo: " + getTipoPessoa()+"\n"+
			   "Nome: " + getNome() + "\n" + 
			   "Endereço: " + getEndereco() + "\n" +
			   "Documento: " + getDocumento() + "\n" +
			   "Data Nascimento: " + getDataNascimento() + "\n";
	}
}
