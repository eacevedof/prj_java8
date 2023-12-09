package Creational.AbstractFactory.Views;

import Creational.AbstractFactory.Enums.DbTypeEnum;
import Creational.AbstractFactory.Repositories.AlumnosNoSqlRepository;
import Creational.AbstractFactory.Repositories.AlumnosRelationalRepository;
import Infrastructure.Views.PrintView;

import java.util.ArrayList;
import java.util.List;

public final class AlumnosView extends PrintView {

    public static AlumnosView getInstance() {
        return new AlumnosView();
    }

    public void printAlumnos(DbTypeEnum dbTypeEnum) {

        List<String> listaAlumnos = new ArrayList<>();

        if (dbTypeEnum == DbTypeEnum.RELATIONAL)
            listaAlumnos = AlumnosRelationalRepository.getInstance().getListaAlumnos();

        if (dbTypeEnum == DbTypeEnum.NOSQL)
            listaAlumnos = AlumnosNoSqlRepository.getInstance().getListaAlumnos();

        this.pr("\n=== Lista de Alumnos === ".concat(dbTypeEnum.getValue()));
        this.prList(listaAlumnos);
    }
}
