
package com.mycompany.e4;

public class E4 {

    public static void main(String[] args) {
        Alumno[] alumnos = new Alumno[5];

        alumnos[0] = new Alumno("Juan", 20);
        alumnos[0].agregarAsignatura(new Asignatura("Matemáticas", 8.5));
        alumnos[0].agregarAsignatura(new Asignatura("Física", 7.2));


        for (Alumno alumno : alumnos) {
            if (alumno != null) {
                System.out.println(alumno);
                alumno.mostrarAsignaturas();
            }
        }
    }
}
