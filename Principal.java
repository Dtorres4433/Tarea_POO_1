import java.util.Scanner;

public class Principal {

	public static void main(String[] args) {
		Scanner sn = new Scanner(System.in);
		boolean salir = false;
		int opcion;
		while(!salir) {
			System.out.println("Bienvenidos a la Discografia POO \n");
			System.out.println("Se dispone de las siguientes opciones: \n");
			System.out.println("1: Mostrar todas las canciones disponibles en la Discografia \n");
			System.out.println("2: Agregar una cancion en la discografia \n");
			System.out.println("3:Componer CD \n");
			System.out.println("4: Salir de la Aplicacion \n");
			
			System.out.println("Ingrese una opcion: \n");
			opcion = sn.nextInt();
			
			switch(opcion){
				case 1: 
					System.out.println("Canciones disponibles en la Discografia: \n");
					break;
				case 2: 
					System.out.println("Agregar una cancion \n");
					break;
				case 3: 
					System.out.println("3:Componer CD \n");
					break;
				case 4:
					salir = true;
					break;
			}
		}


	}

}
