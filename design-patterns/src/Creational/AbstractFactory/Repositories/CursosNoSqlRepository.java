package Creational.AbstractFactory.Repositories;

import java.util.ArrayList;
import java.util.List;

public class CursosNoSqlRepository implements CursosRepositoryInterface {
    public static CursosNoSqlRepository getInstance() {
        return new CursosNoSqlRepository();
    }

    @Override
    public List<String> getListCursos() {
        List<String> stringList = new ArrayList<>();

        stringList.add("Filosofía NoSQL");
        stringList.add("Inglés");
        stringList.add("Matemáticas");
        stringList.add("Lengua");
        stringList.add("Física");
        stringList.add("Historia Universal");
        return stringList;
    }
}
