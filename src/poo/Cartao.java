package poo;

public class Cartao {
	/**
	 * A classe Cartão contém métodos para obter o nome do funcionário, escolher um serviço, escolher um cargo, remover um serviço, atribuir um novo serviço, promover o cargo e despedir um funcionário. 
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
	 * Construtor que recebe o nome do funcionário
	 * @param nomeFuncionario
	 */
	public Cartao(String nomeFuncionario) {
		super();
		this.nomeFuncionario = nomeFuncionario;
	}

	/**
	 *  Construtor que recebe o nome, serviço e o cargo do Funcionário
	 *  
	 * @param nomeFuncionario
	 * @param servico do funcionário
	 * @param cargo do funcionário
	 */
	public Cartao(String nomeFuncionario, String servico, String cargo) {
		super();
		this.nomeFuncionario = nomeFuncionario;
		this.servico = servico;
		this.cargo = cargo;
	}

	// Acessores
	
	/**
	 * Vai buscar o nome do funcionário
	 * 
	 * @return nome do funcionário
	 */
	public String getNomeFuncionario() {
		return nomeFuncionario;
	}

	/**
	 * Alterar o serviço de um funcionário
	 * 
	 * @param servico para o qual querem alterar
	 */
	public void setServico(String servico) {
		this.servico = servico;
	}

	/**
	 * Alterar o cargo de um funcionário
	 * 
	 * @param cargo para o qual querem alterar
	 */
	public void setCargo(String cargo) {
		this.cargo = cargo;
	}
	
	// Métodos
	/**
	 * Retirar o serviço atual de um funcionário
	 */
	public void retirarServico() {
		// servico = "";
		setServico("");
	}
	
	/**
	 * Atribui um novo serviço a um funcionário
	 * 
	 * @param novoServico novo serviço que o funcionário vai desempenhar
	 */
	public void atribuirNovoServico( String novoServico ) {
		//servico = novoServico;
		setServico( novoServico );
	}
	
	/**
	 * Promover o cargo de um funcionário, atribuí um novo cargo ao funcionário
	 * 
	 * @param novoCargo novo cargo do funcionário
	 */
	public void promoverNovoCargo( String novoCargo ) {
		//cargo = novoCargo;
		setCargo(novoCargo);
	}
	
	/**
	 * Despedir um funcionário, remove o serviço e o cargo
	 */
	public void despedirFuncionario() {
		retirarServico();
		setCargo("");
	}
	
}
