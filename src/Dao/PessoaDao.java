package Dao;

import java.util.ArrayList;
import java.util.List;

import modelo.Pessoa;

public class PessoaDao {

	private List<Pessoa> listaPessoa;
	
	public void addPessoa(Pessoa p){

		listaPessoa = new ArrayList<Pessoa>();
		listaPessoa.add(p);
		
		for (Pessoa pessoa : listaPessoa) {
			
			 System.out.println("Nome: " + pessoa.getNome() + " Idade: " + pessoa.getIdade());
		}
	}
}
