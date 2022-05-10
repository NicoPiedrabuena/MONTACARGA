package test;
import static org.junit.Assert.*;

import org.junit.Test;

import src.Carga;
import src.MontaCargas;

public class testMontacarga {

	@Test
	public void queSePuedaCrearUnMontaCargas() {
		
		MontaCargas montaCarga = new MontaCargas();
		assertNotNull(montaCarga);
	}
	@Test 
	public void queSePuedaAgregarUnaCarga() {
		MontaCargas montaCarga = new MontaCargas();
		Carga carga = new Carga(1);
		montaCarga.agregarCarga(carga);
	}
	
	

}
