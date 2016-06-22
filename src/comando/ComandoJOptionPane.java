package comando;

import javax.swing.JOptionPane;

import modelo.Pessoa;

public class ComandoJOptionPane {
	
	
	public void MostraNome(String nome){
		
		Pessoa p = new Pessoa();
		p.setNome(nome);
		JOptionPane.showInputDialog(null, p.getNome());
	}

}
