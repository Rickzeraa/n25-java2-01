package br.com.senaisp.bauru.secao08.aula15;

public class PessoaFisica extends Pessoa {
	
	public PessoaFisica() {
		super(); //Usando o constructor da classe pai
		setTipoPessoa('F');
	} //Fechando constructor
	//Constructor com
	public PessoaFisica(String nom, String doc,
			String ende, String dtNas) throws Exception {
		super(nom, doc, ende, dtNas);
		setTipoPessoa('F'); //Usando o constructor da classe pai		
	}
	@Override
	protected boolean isDocumentoValido(String documento2) {
		// TODO Auto-generated method stub
		return documento2.length()==11 || documento2.length()==11;
	}
}
