package Creational.AbstractFactory.Views;

import Creational.AbstractFactory.Repositories.AlumnosRelationalRepository;
import Infrastructure.Views.PrintView;

import java.util.List;

public final class AlumnosView extends PrintView {

    public static AlumnosView getInstance() {
        return new AlumnosView();
    }

    public void printAlumnos() {
        this.pr("=== Lista de Alumnos ===");
        List<String> listaAlumnos = (new AlumnosRelationalRepository()).getListaAlumnos();
        this.prList(listaAlumnos);
    }
}
