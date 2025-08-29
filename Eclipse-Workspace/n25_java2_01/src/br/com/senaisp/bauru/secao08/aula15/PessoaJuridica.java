package br.com.senaisp.bauru.secao08.aula15;

public class PessoaJuridica extends Pessoa {
	public PessoaJuridica() {
		super(); //Usando o constructor da classe pai
		setTipoPessoa('J');
	} //Fechando constructor 
	//Constructor com parâmetros
	public PessoaJuridica(String nom, String doc, 
						String ende, String dtNas) throws DocumentoException, EnderecoException {
		super(nom, doc, ende, dtNas);
		setTipoPessoa('J'); //Usando o constructor da classe pai
	}
	@Override
	protected boolean isDocumentoValido(String documento2) {
		// 12.345.678/0001-00
		return documento2.length() == 18 || documento2.length() == 14;
	}
}
