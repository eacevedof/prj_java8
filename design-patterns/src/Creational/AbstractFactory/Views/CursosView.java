package Creational.AbstractFactory.Views;

import Creational.AbstractFactory.Repositories.CursosRelationalRepository;
import Infrastructure.Views.PrintView;

import java.util.List;

public final class CursosView extends PrintView {

    public static CursosView getInstance() {
        return new CursosView();
    }

    public void printCursos() {
        this.pr("");
        this.pr("=== Lista de Cursos ===");
        List<String> listaCursos = (new CursosRelationalRepository()).getListCursos();
        for (int i=0; i<listaCursos.size(); i++) {
            var alumno = listaCursos.get(i);
            var message = "(".concat(String.valueOf(i+1)).concat(") ").concat(alumno);
            this.pr(message);
        }
    }
}
