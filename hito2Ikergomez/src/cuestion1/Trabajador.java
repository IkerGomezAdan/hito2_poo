package cuestion1;

public class Trabajador {
//tipo de datos de la clase Trabajador
	String nombre;
	String ciudad;
	float salarioBruto;
	String contratoTemporal;
	
//constructor
	
public Trabajador(String Tnombre, String Tciudad, float TsalarioBruto, String TcontratoTemporal) {
	
	nombre = Tnombre;
	ciudad = Tciudad;
	salarioBruto = TsalarioBruto;
	contratoTemporal = TcontratoTemporal;
	
	
	
}

//Setters & getters

public String getNombre() {
	return nombre;
}

public void setNombre(String nombre) {
	this.nombre = nombre;
}

public String getCiudad() {
	return ciudad;
}

public void setCiudad(String ciudad) {
	this.ciudad = ciudad;
}

public float getSalarioBruto() {
	return salarioBruto;
}

public void setSalarioBruto(float salarioBruto) {
	this.salarioBruto = salarioBruto;
}

public String isContratoTemporal() {
	return contratoTemporal;
}

public void setContratoTemporal(String contratoTemporal) {
	this.contratoTemporal = contratoTemporal;
}
	
//comando print
public void generico() {
	System.out.println("El nombre del trabajador es "+nombre+", vive en "+ciudad+", su salario es "+salarioBruto+" y su contrato dura: "+contratoTemporal);
}
}