package com.tecsup.practica1.practica1_4C15_2018_1;

import javax.swing.JOptionPane;

import com.tecsup.practica1.clases.Bebe;
import com.tecsup.practica1.clases.Caballero;
import com.tecsup.practica1.clases.Dama;
import com.tecsup.practica1.clases.Niño;

public class App 
{
	Bebe 		bebe 		= new Bebe();
	Caballero 	caballero 	= new Caballero();
	Dama 		dama 		= new Dama();
	Niño 		niño 		= new Niño();
	
	
	public static void main( String[] args )
    {
	    while(true) {    
			int opcion = Integer.parseInt(JOptionPane.showInputDialog("Escoge la seccion de ropa:\n"
	        		+ "1. Bebes:\n2. Varones:\n3. Damas\n4. Niños\n5. Salir"));
	        
	        if(opcion == 1) {
	        	
	        }else if(opcion == 2) {
	        	
	        }else if(opcion == 3) {
	        	
	        }else if(opcion == 4) {
	        	
	        }
	        else if(opcion == 5) {
	        	JOptionPane.showMessageDialog(null, "Adios :v");
	        }
	        else {
	        	JOptionPane.showMessageDialog(null, "Elija una de las opciones, no otra cosa por favor :v");
	        }
	    }
    }
}
