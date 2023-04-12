package view;
import br.edu.fateczl.filaobj.Fila;
import model.Pessoa;
import controller.ParqueController;
public class Principal {

	public static void main(String[] args) {
		Fila f = new Fila ();
		
		for (int i = 0; i<30;i++) {
			Pessoa p = new Pessoa();
			p.Nome = "Pessoa"+i;
			p.Idade = (int)((Math.random()*31)+10);
			p.Altura = (float)((Math.random()*0.66)+1.35);
			f.insert(p);
		}
		
		ParqueController.brinquedo(f);
	}

}
