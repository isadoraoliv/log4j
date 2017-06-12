package teste;

import java.util.ArrayList;
import java.util.Scanner;


import org.apache.log4j.Logger;
import org.apache.log4j.PropertyConfigurator;


public class Funcionario {

	private static Scanner s;
	static final Logger logger = Logger.getLogger(Funcionario.class);

	public static void main(String[] args) {
		
		PropertyConfigurator.configure("log4j.properties");
		
		s = new Scanner(System.in);
		ArrayList<Pessoa> listaPessoa = new ArrayList<Pessoa>();	
		
		logger.info("Iniciando for");
		
		for(int i=0; i < 4; i++){	
			
			System.out.println("\nDigite o nome:");
			String nome = s.next();
			System.out.println("\nDigite a idade:");
			int idade = s.nextInt();
			listaPessoa.add(new Pessoa(nome, idade));
	     
		}
		logger.info("Imprimindo lista de pessoas");
		System.out.println(listaPessoa.get(1));
		
		
	}
	
}
