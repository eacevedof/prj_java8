package Creational.AbstractFactory;

import Infrastructure.Views.PrintView;

import java.util.List;

public final class AlumnosView extends PrintView {

    public static AlumnosView getInstance() {
        return new AlumnosView();
    }

    public void printAlumnos() {
        this.pr("");
        this.pr("=== Lista de Alumnos ===");
        List<String> listaAlumnos = (new AlumnosRepository()).getListaAlumnos();
        for (int i=0; i<listaAlumnos.size(); i++) {
            var alumno = listaAlumnos.get(i);
            var message = "(".concat(String.valueOf(i+1)).concat(") ").concat(alumno);
            this.pr(message);
        }
    }
}
