package Creational.AbstractFactory;

import java.util.List;

public final class AlumnosView {

    public static AlumnosView getInstance()
    {
        return new AlumnosView();
    }

    public void printAlumnos()
    {
        this.pr("");
        this.pr("=== Lista de Alumnos ===");
        List<String> listaAlumnos = (new AlumnosRepository()).getListaAlumnos();
        for (int i=0; i<listaAlumnos.size(); i++) {
            var alumno = listaAlumnos.get(i);
            var message = "(".concat(String.valueOf(i+1)).concat(") ").concat(alumno);
            this.pr(message);
        }
    }

    private void pr(String message)
    {
        System.out.println(message);
    }
}
