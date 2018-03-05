package com.tecsup.practica1.clases;

import javax.swing.JOptionPane;

public class Dama {
	String nombre="pantalón";
	String descripcion="Para adolescentes";
	String talla= "S";
	String precio= "$50.00";
	
	public void ejerciciodama() {
		JOptionPane.showMessageDialog(null, "El nombre del producto es:  "+ nombre + "\n" + "Descripción:  " +
	descripcion + "\n" + "Talla : " + talla + "\n" + "Precio: " + precio  );
	}
	
}
