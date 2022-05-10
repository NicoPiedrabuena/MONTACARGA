package src;
import java.util.ArrayList;

public class MontaCargas {
	private final Integer PESO_MAXIMO = 10;
	private ArrayList<Carga>cargas;
	
	public MontaCargas () {
		this.cargas = new ArrayList<Carga>();
		
	}

	public ArrayList<Carga> getCargas() {
		return cargas;
	}

	public void setCargas(ArrayList<Carga> cargas) {
		this.cargas = cargas;
	}

	public Integer getPESO_MAXIMO() {
		return PESO_MAXIMO;
	}
	public Boolean sobrepeso(Carga carga) {
		Integer pesoActual = 0;
		Boolean exceso = false;
		for (Carga carga1 : cargas) {
			pesoActual +=carga1.getPeso();
		}
		if(pesoActual + carga.getPeso() >PESO_MAXIMO ) {
			exceso = true;
		}
		return exceso;
		
	}

	public void agregarCarga(Carga carga) {
		cargas.add(carga);
	}

	@Override
	public String toString() {
		
		
		return "MontaCargas [PESO_MAXIMO=" + PESO_MAXIMO + ", cargas=" + cargas + "]";
	}
	
	
	
	
}
