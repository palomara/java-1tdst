package br.com.excecoes.teste;

import br.com.excecoes.beans.Aluno;
import br.com.excecoes.exception.Excecao;
import br.com.excecoes.tela.Magica;

public class TesteExcecao {

	public static void main(String[] args) {
		try {
			int numero = Magica.i("Digite um numero");
			System.out.println(numero);
			Aluno objeto = new Aluno();
			objeto.setNome(Magica.s("Nome: "));
			objeto.setRm(Magica.i("Digite o RM"));
			System.out.println(objeto.getNome().length());
		}catch(Exception e) {
			System.out.println(Excecao.tratarExcecao(e));	
		}finally {
			System.out.println("Até logo");
		}
		
		// Criando o objeto
		//Aluno aluno; 
		//aluno.setNome("1berto");
		
		//Instanciando o objeto
		//Aluno aluno = new Aluno();
		//aluno.setNome("1berto");
		
		//Pessoa pessoa;
		//if (usuarioescolher=="A") {
		//	pessoa=new Aluno();
		//}else {
		//	pessoa = new Professor();
		//}
	} // fechando o main
} // fechando a classe
