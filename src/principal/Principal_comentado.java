package principal;

import modelo.Vehiculo_comentado;

public class Principal_comentado {

	// ********* MÉTODO MAIN PARA EJECUCIÓN DEL PROGRAMA *********
	
	public static void main(String[] args) {

		
		// Creamos un objetos de la clase Vehiculo_comentado
		Vehiculo_comentado miVehiculo = new Vehiculo_comentado("5455-GFC", "SEAT", "IBIZA");
		
		// Asignamos un valor a la variable comentario
		String comentario = "En buenas condiones, para más información llama al 606 077 999";
		
		// Invocamos al método pasándole como parámetro un String como comentario y nos
		// devuelve un Stringo con los datos del vehículo y el comentario añadido
		String comentarioConVehiculo =miVehiculo.crearComentarioVehiculo(comentario);
		
		// mostramos el resultado que nos devuelve la llamada al método crearComentarioVehiculo();
		System.out.println(comentarioConVehiculo);

	}

}
