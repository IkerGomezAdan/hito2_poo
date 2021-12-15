package cuestion2;
//Extends 
public class Hija extends Padre {
//El super aquí se debe  a que Hija hereda de padre
	public Hija(String pnombre, int pedad) {
		super(pnombre, pedad);
		
	}
//Método saludar de la hija
	public void Saludar() {
		System.out.println("Hola soy la hija "+ nombre);
	 }
}
