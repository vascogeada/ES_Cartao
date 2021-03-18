package poo;

public class Cartao {
	/**
	 * A classe Cart�o cont�m m�todos para obter o nome do funcion�rio, escolher um servi�o, escolher um cargo, remover um servi�o, atribuir um novo servi�o, promover o cargo e despedir um funcion�rio. 
	 * 
	 * 
	 * <ul>
	 * <li>getNomeFuncionario</li>
	 * <li>setServico</li>
	 * <li>setCargo</li>
	 * <li>retirarServico</li>
	 * <li>atribuirNovoServico</li>
	 * <li>promoverNovoCargo</li>
	 * <li>despedirFuncionario</li>
	 * </ul>
	 * 
	 * @author Vasco Geada
	 *
	 */
	
	private String nomeFuncionario;
	private String servico;
	private String cargo;
	
	// Construtores 
	/**
	 * Construtor que recebe o nome do funcion�rio
	 * @param nomeFuncionario
	 */
	public Cartao(String nomeFuncionario) {
		super();
		this.nomeFuncionario = nomeFuncionario;
	}

	/**
	 *  Construtor que recebe o nome, servi�o e o cargo do Funcion�rio
	 *  
	 * @param nomeFuncionario
	 * @param servico do funcion�rio
	 * @param cargo do funcion�rio
	 */
	public Cartao(String nomeFuncionario, String servico, String cargo) {
		super();
		this.nomeFuncionario = nomeFuncionario;
		this.servico = servico;
		this.cargo = cargo;
	}

	// Acessores
	
	/**
	 * Vai buscar o nome do funcion�rio
	 * 
	 * @return nome do funcion�rio
	 */
	public String getNomeFuncionario() {
		return nomeFuncionario;
	}

	/**
	 * Alterar o servi�o de um funcion�rio
	 * 
	 * @param servico para o qual querem alterar
	 */
	public void setServico(String servico) {
		this.servico = servico;
	}

	/**
	 * Alterar o cargo de um funcion�rio
	 * 
	 * @param cargo para o qual querem alterar
	 */
	public void setCargo(String cargo) {
		this.cargo = cargo;
	}
	
	// M�todos
	/**
	 * Retirar o servi�o atual de um funcion�rio
	 */
	public void retirarServico() {
		// servico = "";
		setServico("");
	}
	
	/**
	 * Atribui um novo servi�o a um funcion�rio
	 * 
	 * @param novoServico novo servi�o que o funcion�rio vai desempenhar
	 */
	public void atribuirNovoServico( String novoServico ) {
		//servico = novoServico;
		setServico( novoServico );
	}
	
	/**
	 * Promover o cargo de um funcion�rio, atribu� um novo cargo ao funcion�rio
	 * 
	 * @param novoCargo novo cargo do funcion�rio
	 */
	public void promoverNovoCargo( String novoCargo ) {
		//cargo = novoCargo;
		setCargo(novoCargo);
	}
	
	/**
	 * Despedir um funcion�rio, remove o servi�o e o cargo
	 */
	public void despedirFuncionario() {
		retirarServico();
		setCargo("");
	}
	
}
