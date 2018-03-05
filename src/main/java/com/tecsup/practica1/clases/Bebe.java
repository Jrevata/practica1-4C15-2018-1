package com.tecsup.practica1.clases;

import javax.swing.JOptionPane;

public class Bebe {
	String nombre="Enterizo";
	String descripcion="De 0-5 meses";
	String talla="2";
	
	public void ejerciciobebes() {
		JOptionPane.showMessageDialog(null, "El nombre del producto es:  "+ nombre + "/n" + "Descripción:  " +
	descripcion + "/n" + "Talla : " + talla );
	}
}
