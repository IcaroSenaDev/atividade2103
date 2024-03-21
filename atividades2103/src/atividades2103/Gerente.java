package atividades2103;

public class Gerente extends Funcionarioregular{
	private String departamento;

	public Gerente(String nome, int id, double salario, String departamento) {
		super(nome, id, salario);
		this.departamento = departamento;
	}

	public String getDepartamento() {
		return departamento;
	}
	public void setDepartamento(String departamento) {
		this.departamento = departamento;
	}
	
	@Override
	public String toString() {
		return "Nome: " + getNome() + " Id: " + getId() + " Salario: " + getSalario() + " Departamento: " + departamento;
		
	}
}
