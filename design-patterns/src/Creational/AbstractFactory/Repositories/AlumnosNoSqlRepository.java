package Creational.AbstractFactory.Repositories;

import java.util.ArrayList;
import java.util.List;

public class AlumnosNoSqlRepository implements AlumnosRepositoryInterface{
    @Override
    public List<String> getListaAlumnos() {
        List<String> stringList = new ArrayList<>();

        stringList.add("Eduardo A.F NoSQL");
        stringList.add("Droopy");
        stringList.add("Chris A.F.");
        stringList.add("Dayana A.F.");
        stringList.add("Alvaro S.F.");
        stringList.add("Arturo M.F.");
        return stringList;
    }
}
