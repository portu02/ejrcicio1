
public class Alumnos {
	//atributos
	private String nombre,apellido,dni;
	//constructores 
	public Alumnos(String a,String b, String c) {
		this.nombre=a;
		this.apellido=b;
		this.dni=c;
	}
	//getter
	public String getnombre() {
		return this.nombre;
	}
	public String getapellido() {
		return this.apellido;
	}
	public String getdni() {
		return this.dni;
	}
	//metodo 
	public String toString() {
		return "nombre: "+getnombre()+" apellido "+getapellido()+" dni "+this.dni;
		
	}
}
