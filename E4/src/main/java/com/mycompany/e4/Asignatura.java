
package com.mycompany.e4;

public class Asignatura {
    
    private String nombre;
    private double nota;

    public Asignatura(String nombre, double nota) {
        this.nombre = nombre;
        this.nota = nota;
    }
    
    public String getNombre() {
        return this.nombre;
    }
    
    public double getNota() {
        return this.nota;
    }

    public void setNota(double nota) {
        this.nota = nota;
    }

    @Override
    public String toString() {
        return "Asignatura{" + "nombre=" + this.nombre + ", nota=" + this.nota + '}';
    }
    
}
