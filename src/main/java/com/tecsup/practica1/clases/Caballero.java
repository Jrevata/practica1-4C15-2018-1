package com.tecsup.practica1.clases;
import javax.swing.JOptionPane;

public class Caballero {
	double precio= 350;
	String nombrePrenda= "Camisa";
	String descripción="Color blanco";
	String talla= "M";
	String foto="fotocaballero";
	
	
	public void ejerciciocaballero() {
		

		
		JOptionPane.showMessageDialog(null, "El nombre del producto es: " + nombrePrenda + 
				"\n"+ "Descripción: "+ descripción + "\n" + "Talla: "+ talla + "\n" + 
				"Foto: "+ foto + "\n" + "Precio: " + precio);
		
		
	}
	
	
	
	

}
