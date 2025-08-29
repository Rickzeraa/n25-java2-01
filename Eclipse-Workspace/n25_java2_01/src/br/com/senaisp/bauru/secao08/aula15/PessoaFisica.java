package br.com.senaisp.bauru.secao08.aula15;

public class PessoaFisica extends Pessoa {

	public PessoaFisica() {
		super(); //Usando o constructor da classe pai
		setTipoPessoa('F');
	} //Fechando constructor 
	//Constructor com parâmetros
	public PessoaFisica(String nom, String doc, 
						String ende, String dtNas) throws DocumentoException, EnderecoException {
		super(nom, doc, ende, dtNas);
		setTipoPessoa('F'); //Usando o constructor da classe pai
	}
	@Override
	protected boolean isDocumentoValido(String documento2) {
		//123.456.789-00
		return documento2.length()==14 || documento2.length()==11;
	}
}
