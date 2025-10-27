
package gestiontaller;

import java.util.ArrayList;
import java.util.Objects;
import java.util.Scanner;

public class Vehiculo implements Comparable<Vehiculo>{
//atributos    
     String matricula;
     String marca;
    String modelo;
    int fecha;
    int reparaciones;
//getter and setter    
    public String getMatricula() {
        return matricula;
    }
    public void setMatricula(String matricula) {
        this.matricula = matricula;
    }
    public String getMarca() {
        return marca;
    }
    public void setMarca(String marca) {
        this.marca = marca;
    }
    public String getModelo() {
        return modelo;
    }
    public void setModelo(String modelo) {
        this.modelo = modelo;
    }
    public int getFecha() {
        return fecha;
    }
    public void setFecha(int fecha) {
        this.fecha = fecha;
    }
    public int getReparaciones() {
        return reparaciones;
    }
    public void setReparaciones(int reparaciones) {
        this.reparaciones = reparaciones;
    }
//constructores    
    public Vehiculo() {
    }
    public Vehiculo(String matricula) {
        this.matricula = matricula;
    }
    public Vehiculo(String matricula, String marca, String modelo, int fecha, int reparaciones) {
        this.matricula = matricula;
        this.marca = marca;
        this.modelo = modelo;
        this.fecha = fecha;
        this.reparaciones = reparaciones;
    }
//toString
    @Override
    public String toString() {
        return "Vehiculo: " + matricula + ", " + marca + ", " 
                + modelo + ", " + fecha + "; " + reparaciones;
    }
//hashCode and Equals    
    @Override
    public int hashCode() {
        int hash = 3;
        hash = 37 * hash + Objects.hashCode(this.matricula);
        return hash;
    }
    @Override
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null) {
            return false;
        }
        if (getClass() != obj.getClass()) {
            return false;
        }
        final Vehiculo other = (Vehiculo) obj;
        if (!Objects.equals(this.matricula, other.matricula)) {
            return false;
        }
        return true;
    }
//compareTo    
    @Override
    public int compareTo(Vehiculo objeto){
        return this.matricula.compareTo(objeto.matricula);
    }
//otro métodos    
    //comprobar si ya está la matrícula
    public void compMatr(ArrayList<Vehiculo> col){
        int pos=-1;
        for(int i=0;i<col.size()-1;i++){
            if(col.get(i).matricula.equals(matricula)){
                col.remove(i);
                i--;
            }
        }
       
    }
    //agregar matrícula
    public void agrMatr(ArrayList<Vehiculo> col){
        Scanner entrada = new Scanner(System.in);
        boolean camino=false;
        for(int i=0;i<col.size();i++){
            if(col.get(i).matricula.equals(matricula)){
                marca = col.get(i).marca;
                modelo = col.get(i).modelo;
                fecha = col.get(i).fecha;
                reparaciones = col.get(i).reparaciones+1;
                camino=true;
            }
        }
        if (camino==false){
            System.out.print("\n\n\tIntroduzca la marca del Vehiculo: ");
            marca=entrada.next();
            System.out.print("\n\tIntroduzca la modelo del Vehiculo: ");
            modelo=entrada.next();
            System.out.print("\n\tIntroduzca el año de matriculación del Vehiculo: ");
            fecha=entrada.nextInt();
            reparaciones = 1;
        }
    }
}
