import java.util.*;
public class Dineros3
{
public static void main(String[] args)
{
System.out.println("Ingrese una Cantidad:");
Scanner entrada=new Scanner(System.in);
double dinero=entrada.nextDouble();

int euros=(int)dinero;
System.out.println("TIENES EN TOTAL: "+euros+  " Euros.");
System.out.println("-----------------------------------");

int d1000=euros/1000;
System.out.println("Tienes: "+d1000+ " billetes de Mil (1.000);");

int r1000=euros%1000;

int d500=r1000/500;
System.out.println("Tienes: "+d500+ " billetes de Quini (500);");

int r500=r1000%500;

int d200=r500/200;
int r200=r500%200;
System.out.println("Tienes: "+d200+ " billetes de Doscientos (200);");

int d100=r500/100;
int r100=r500%100;
System.out.println("Tienes: "+d100+ " billetes de Cien (100);");

int d50=r100/50;
int r50=r100%50;
System.out.println("Tienes: "+d50+ " billetes de Cincuenta (50);");

int d20=r50/20;
int r20=r50%20;
System.out.println("Tienes: "+d20+ " billetes de Veinte (20);");

int d10=r20/10;
int r10=r20%10;
System.out.println("Tienes: "+d10+ " billetes de Diez (10);");

int d5=r10/5;
int r5=r10%5;
System.out.println("Tienes: "+d5+ " billetes de Cinco (5) ;");

int d2=r5/2;
int r2=r5%2;
System.out.println("Tienes: "+d2+ " monedas de Dos (2) ;");

int d1=r2/1;
int r1=r2%1;
System.out.println("Tienes: "+d1+ " monedas de Un (1) ;");


}
}
