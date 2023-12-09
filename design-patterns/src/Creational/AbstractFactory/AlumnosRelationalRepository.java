package Creational.AbstractFactory;

import java.util.ArrayList;
import java.util.List;

public class AlumnosRelationalRepository implements AlumnosRepositoryInterface{
    @Override
    public List<String> getListaAlumnos() {
        List<String> stringList = new ArrayList<>();

        stringList.add("Eduardo A.F Com");
        stringList.add("Droopy");
        stringList.add("Chris A.F.");
        stringList.add("Dayana A.F.");
        stringList.add("Alvaro S.F.");
        stringList.add("Arturo M.F.");
        return stringList;
    }
}