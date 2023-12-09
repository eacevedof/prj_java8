package Creational.AbstractFactory.Views;

import Creational.AbstractFactory.Enums.DbTypeEnum;
import Creational.AbstractFactory.Repositories.CursosNoSqlRepository;
import Creational.AbstractFactory.Repositories.CursosRelationalRepository;
import Infrastructure.Views.PrintView;

import java.util.ArrayList;
import java.util.List;

public final class CursosView extends PrintView {

    public static CursosView getInstance() {
        return new CursosView();
    }

    public void printCursos(DbTypeEnum dbTypeEnum) {

        List<String> listaCursos = new ArrayList<>();

        if (dbTypeEnum == DbTypeEnum.RELATIONAL)
            listaCursos = CursosRelationalRepository.getInstance().getListCursos();

        if (dbTypeEnum == DbTypeEnum.NOSQL)
            listaCursos = CursosNoSqlRepository.getInstance().getListCursos();

        this.pr("=== Lista de Cursos === ".concat(dbTypeEnum.getValue()));
        this.prList(listaCursos);
    }
}
