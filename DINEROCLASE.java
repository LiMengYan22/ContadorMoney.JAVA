import java.util.Scanner;
public class DINEROCLASE {
		public static void main(String[] args){
		double billetes[] = {500,200,100,50,20,10,5,2,1,0.50,0.20,0.10, 0.050,0.020,0.010};	//el array de los naturales
		String mensaje=""; //valor de variable que cambia llamado mensaje
		String mensaje2="€"; 
		double dinero=0;		
		do {			
			dinero=obtenerDouble("INSERTA CANTIDAD: ");	//funcion, sale con el corrector eclipse
			if (dinero<0 ) {
			System.err.println("ERROR, debes introducir numero positivo o 0" );		
			}
		}while(dinero<0);		
		for (int i=0; i<billetes.length; i++){ //recorrer el array 
		  if (dinero >= billetes[i]) {
			  if (billetes[i]>2) {			 
			  mensaje="billetes"; //aqui cambia la variable mensaje si salen billetes o monedas
			  		}else if(billetes[i]<1){		  			
			  		   mensaje2="centimos";
		}		
		System.out.println("Tienes: " +(int) (dinero/billetes[i])+ " " +mensaje+ " de " +billetes[i]);		
		}
		dinero=dinero%billetes[i];
		/* System.out.println(dinero);*/
		}
		}
		private static double obtenerDouble(String mensaje) { // Funcion RECURSIVIDAD
			double valor=0;
			Scanner entrada=new Scanner(System.in);
			System.out.println(mensaje);		
			try {
				valor = entrada.nextDouble();
			} catch (Exception e) {
			   System.err.println("ERROR: Debes introducir una cifra.. "); //err  es una salida de error y sale en color
			   valor=obtenerDouble("Vuelve a intentar:"); //volver a introducir otra cifra (ROBUSTEZ)
			}		
			return valor;		   
		}
}	
