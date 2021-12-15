package cuestion2;
//La clase Padre es abstracta (no instanciada) ya que podee métodos en común.
public abstract class Padre {

	String nombre;
	int edad;
	
//Constructor
	
public Padre(String pnombre, int pedad) {
	
	nombre = pnombre;
	edad = pedad;

 
}
//saludos
public void Saludar() {
	System.out.println("Hola soy el padre"+ nombre);
 }

}