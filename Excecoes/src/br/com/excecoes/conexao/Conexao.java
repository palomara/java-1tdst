package br.com.excecoes.conexao;

import java.sql.Connection;
import java.sql.DriverManager;

public class Conexao {

	public static Connection abrir() throws Exception {
		return DriverManager.getConnection("");
	}
}
