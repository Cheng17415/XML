
package gestiontaller;

import java.util.ArrayList;
import java.util.Scanner;

public class GestionTaller {
    static Scanner dato = new Scanner(System.in);
    static ArrayList<Vehiculo> col = new ArrayList<>();
  
    public static void main(String[] args) {
        System.out.println("BIENVENIDOS A LA GESTION DEL TALLER\n");
    //crear un objeto
        /*Vehiculo v1 = new Vehiculo("1234AAA","Volvo","V20",2010,1);
        System.out.println(v1.toString());*/
        vehiculosIniciales();
        menu();
    }
    public static void vehiculosIniciales(){
        Vehiculo v1 = new Vehiculo("1234AAA","Volvo","V20",2010,1);
        Vehiculo v2 = new Vehiculo("2345BBB","Citroen","C3",2015,1);
        Vehiculo v3 = new Vehiculo("3456CCC","Reanult","R5",2016,1);
        Vehiculo v4 = new Vehiculo("1234AAA","Volvo","V20",2010,2);
        Vehiculo v5 = new Vehiculo("4567DDD","Mercedes","C200",2020,1);
        Vehiculo v6 = new Vehiculo("2345BBB","Citroen","C3",2015,2);
    //añadir al ArrayList
        col.add(v1);
        v1.compMatr(col);
        col.add(v2);
        v2.compMatr(col);
        col.add(v3);
        v3.compMatr(col);
        col.add(v4);
        v4.compMatr(col);
        col.add(v5);
        v5.compMatr(col);
        col.add(v6);
        v6.compMatr(col);
    }
    public static void visualizar(){
        System.out.println("\n\n\tLista de Vehículos del Taller\n");
    //ver todos los vehículos    
        for(Vehiculo v: col){
            System.out.println(v);
        }
        System.out.println("");
    }
    
    public static void agregar(){
        String matr;
        System.out.print("Indique la matrícula que quiere añadir: ");
        matr=dato.next();
        Vehiculo v = new Vehiculo(matr);
        v.agrMatr(col);
        col.add(v);
        v.compMatr(col);
    }
    public static void menu(){//procedimiento
        int opcion=-1;
        while(opcion!=0){//estructura MIENTRAS
            System.out.println("MENÚ");
            System.out.println("====\n");
            System.out.println("\t(1) Visualizar datos.-");
            System.out.println("\t(2) Agregar datos.-");
            System.out.println("\t(3) Ejercicio 3.-");
            System.out.println("\t(4) Ejercicio 4.-");
            System.out.println("\t(5) Ejercicio 5.-");
            System.out.println("\t(6) Ejercicio 6.-");
            System.out.println("\t(7) Ejercicio 7.-");
            System.out.println("\t(8) Ejercicio 8.-");
            System.out.println("\t(0) SALIR");
            System.out.print("\nSeleccione la opción elegida: ");
            opcion=dato.nextInt();
            switch(opcion){//estructura CONDICIONAL MÚLTIPLE
                case 1:
                    visualizar();
                    break;
                case 2:
                    agregar();
                    break;
                case 3:
                    //ejercicio_3();
                    break;
                case 4:
                    //ejercicio_4();
                    break;
                case 5:
                    //ejercicio_5();
                    break;
                case 6:
                    //ejercicio_6(3);
                    break;
                case 7:
                    //ejercicio_7(4);
                    break;
                case 8:
                    //ejercicio_8(2);
                    break;
                case 0:
                    System.out.println("\n*****Gracias por utilizar la aplicación*****");
                    break;
                default:
                    System.out.println("Elija un número entre 1 y 8");
                    //break;
            }
            for(int i=1;i<=3;i++){//estructura PARA
                System.out.println("");
            }
        }
    }
}
