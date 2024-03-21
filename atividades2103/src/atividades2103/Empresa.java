package atividades2103;

public class Empresa {
	public static void main(String[] args) {
		Gerente gerente = new Gerente("Icaro",54,1.500,"Desenvolvedores web");
		Funcionarioregular funcionario = new Funcionarioregular("Icaro", 55, 1.570);
		
		System.out.println(gerente.toString());
		System.out.println(funcionario.toString());
	}
}
