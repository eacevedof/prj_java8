package Creational.AbstractFactory.Repositories.Relational;

import Creational.AbstractFactory.Repositories.Interfaces.CursosRepositoryInterface;

import java.util.ArrayList;
import java.util.List;

public class CursosRelationalRepository implements CursosRepositoryInterface {
    public static CursosRelationalRepository getInstance() {
        return new CursosRelationalRepository();
    }
    @Override
    public List<String> getListCursos() {
        List<String> stringList = new ArrayList<>();

        stringList.add("Filosofía");
        stringList.add("Inglés");
        stringList.add("Matemáticas");
        stringList.add("Lengua");
        stringList.add("Física");
        stringList.add("Historia Universal");
        return stringList;
    }
}
