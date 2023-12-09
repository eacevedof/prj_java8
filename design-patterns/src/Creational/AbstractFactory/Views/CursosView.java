package Creational.AbstractFactory.Views;

import java.util.ArrayList;
import java.util.List;

import Creational.AbstractFactory.Enums.DbTypeEnum;
import Creational.AbstractFactory.Factories.NoSqlFactoryRepository;
import Creational.AbstractFactory.Factories.RelationalFactoryRepository;
import Infrastructure.Views.PrintView;

public final class CursosView extends PrintView {

    public static CursosView getInstance() {
        return new CursosView();
    }

    public void printCursos(DbTypeEnum dbTypeEnum) {

        List<String> listaAlumnos = new ArrayList<>();
        List<String> listaCursos = new ArrayList<>();

        if (dbTypeEnum == DbTypeEnum.RELATIONAL) {
            listaAlumnos = RelationalFactoryRepository.getInstance().getAlumnosRepository().getListaAlumnos();
            listaCursos = RelationalFactoryRepository.getInstance().getCursosRepository().getListCursos();
        }


        if (dbTypeEnum == DbTypeEnum.NOSQL) {
            listaAlumnos = NoSqlFactoryRepository.getInstance().getAlumnosRepository().getListaAlumnos();
            listaCursos = NoSqlFactoryRepository.getInstance().getCursosRepository().getListCursos();
        }

        this.pr("\n=== Lista de Alumns === ".concat(dbTypeEnum.getValue()));
        this.prList(listaAlumnos);

        this.pr("\n=== Lista de Cursos === ".concat(dbTypeEnum.getValue()));
        this.prList(listaCursos);
    }
}
