package Creational.AbstractFactory.Views;

import Creational.AbstractFactory.Repositories.CursosRelationalRepository;
import Infrastructure.Views.PrintView;

import java.util.List;

public final class CursosView extends PrintView {

    public static CursosView getInstance() {
        return new CursosView();
    }

    public void printCursos() {
        this.pr("=== Lista de Cursos ===");
        List<String> listaCursos = (new CursosRelationalRepository()).getListCursos();
        this.prList(listaCursos);
    }
}
