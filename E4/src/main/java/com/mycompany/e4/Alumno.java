
package com.mycompany.e4;

public class Alumno {
    
    private String nombre;
    private int edad;
    private Asignatura[] asignaturas = new Asignatura[5];
    private int numAsignaturas = 0;

    public Alumno(String nombre, int edad) {
        this.nombre = nombre;
        this.edad = edad;
    }
    
    public String getNombre() {
        return nombre;
    }
    
    public void agregarAsignatura(Asignatura asignatura) {
        if (numAsignaturas < asignaturas.length) {
            //El operador ++ incrementa el valor despues de utilizarlo como indice.
            asignaturas[numAsignaturas++] = asignatura;
        } else {
            System.out.println("Imposible agregar más asignaturas");
        }
    }
    
    public void mostrarAsignaturas() {
        for (int t = 0; t < numAsignaturas; t++) {
            System.out.println(asignaturas[t]);
        }
    }
    
    public double calcularPromedio() {
        if (numAsignaturas == 0)  {
            return 0;
        }
        
        double sumaNotas = 0;
        for (int t = 0; t < numAsignaturas; t++) {
            sumaNotas += asignaturas[t].getNota();
        }
        return sumaNotas / numAsignaturas;
    }
    
    @Override
    public String toString() {
        return "Alumno{" +
                "nombre='" + nombre + '\'' +
                ", edad=" + edad +
                ", promedio=" + calcularPromedio() +
                '}';
    }
}
