package Primero;
import java.util.*;
public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		Vector <Coche> vehiculo =new Vector();
		int opc;
		do {
			System.out.println("1.Entra coche\n2.Sale coche\n3.Mostrar coches de la cola\n4.Buscar\n5.Salir");
			opc=sc.nextInt();
			switch(opc) {
			case 1 :
				sc.nextLine();
				 System.out.println("Escriba su matricula");
				 String matricula=sc.nextLine();
				 vehiculo.add(new Coche(matricula));
			
					
				 break;
			
			case 2 :
				 if(vehiculo.size()>0) {
					Coche salir=vehiculo.remove(0);
					 System.out.println(salir);
				 }
				 else
					 System.out.println("No hay coches en la cola");
					break;
			case 3:
				 System.out.println(vehiculo);
			case 4:
				System.out.println("Anota matricula coche a buscar:");
				matricula=sc.nextLine();
				for(int i=0;i<vehiculo.size();i++) {
				if(vehiculo.get(i).getMaticula().equalsIgnoreCase(matricula)) {
				System.out.println("Encontrado en la poscion "+ i);
				}
				break;
				}
				
			case 5: 
				default: System.out.println("Opcion incorrecta");
				 
			}
			
		}while(opc!=5);
	}

}

