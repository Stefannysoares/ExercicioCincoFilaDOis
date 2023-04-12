package controller;
import model.Pessoa;
import br.edu.fateczl.filaobj.Fila;

public class ParqueController {
		
	public static void brinquedo (Fila f) {
		while (!f.isEmpty()) {
			Pessoa ap = new Pessoa();
			
			try {
				ap = (Pessoa)f.remove();
				if (ap.Altura > 1.60 && ap.Idade>16) {
					System.out.println("Pessoa: "+ ap.Nome + " Está Apta para ir ao brinquedo");
				} else {
					System.out.println("Pessoa: "+ ap.Nome + " Não está Apta para ir ao brinquedo");
				}
				
				
			}catch (Exception e ) {
				e.printStackTrace();
			}
		}
	}
		
}
