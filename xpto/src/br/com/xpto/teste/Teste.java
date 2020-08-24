package br.com.xpto.teste;

import javax.swing.JOptionPane;

public class Teste {

	public static String s(String msg) {
		return JOptionPane.showInputDialog(msg).toUpperCase();
	}
	
	public static int i(String msg) {
		return Integer.parseInt(s(msg));
	}
	
	public static void main(String[] args) {
		

	}

}
