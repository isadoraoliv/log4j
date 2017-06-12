package teste;

import org.apache.log4j.Logger;


public class Pessoa {

    private String nome;
    private int idade;
    static final Logger logger = Logger.getLogger(Pessoa.class);

    public Pessoa(String nome, int idade){

        this.nome = nome;
        this.idade = idade;

    }
	private void logger() {
		logger.info("Definindo funções acessadoras e modificadoras");

	}

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome=nome;
    }

    public int getIdade() {
        return idade;
    }

    public void setIdade(int idade) {
        this.idade=idade;
    }

    public String toString(){
        return nome + " " + idade;
    }

}