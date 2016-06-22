package main;

import java.util.Scanner;

import javax.swing.JOptionPane;

import Dao.PessoaDao;
import comando.ComandoFor;
import comando.ComandoJOptionPane;
import comando.ComandoWhile;
import modelo.Pessoa;

public class Principal {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		/*
		 * MENU PARA ESCOLHA DE OPÇÃO
		 */
		Scanner in = new Scanner(System.in);
		int op = 0;
		System.out.println("DIGITE SUA OPÇÃO");
		try {
			
			 op = in.nextInt();
			
		} catch (Exception e) {
			
			System.out.println("favor digite apenas número");
		}
		
		switch (op) {
		case 1:
			System.out.println("digite sua idade");
			Pessoa p = new Pessoa();
			p.setIdade(in.nextInt());
			System.out.println("digite seu nome");
			p.setNome(in.next());
			PessoaDao pdao = new PessoaDao();
			pdao.addPessoa(p);
			break;
		case 2 :
			ComandoWhile cw = new ComandoWhile();
			cw.menu();
			break;
			
		case 3 :
			ComandoFor cf = new ComandoFor();
			cf.EscreveNumero();
			break;
		case 4 :
			ComandoJOptionPane cjop = new ComandoJOptionPane();
			String nome = JOptionPane.showInputDialog("digite seu nome");
			cjop.MostraNome(nome);
			break;

		default:
			break;
		}
	}

}
