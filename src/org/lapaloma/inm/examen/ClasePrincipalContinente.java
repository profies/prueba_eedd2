package org.lapaloma.inm.examen;

import org.palomafp.dam1.ed.inm.GestorContinentes;

/**
 * @author Isidoro Nevares Martín - Examen RA2  (Virgen de la Paloma) 
 * Fecha: 19 noviembre 2024
 *
 */
public class ClasePrincipalContinente {

	public static void main(String[] args) {
		String iniciales = args[0];
		GestorContinentes gestor = new GestorContinentes();

		gestor.imprimirInformacionContinente(iniciales);
	}

}
