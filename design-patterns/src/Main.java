import Creational.AbstractFactory.AlumnosView;
import Creational.AbstractFactory.CursosView;

public final class Main {
    public static void main(String[] args) {
        AlumnosView.getInstance().printAlumnos();
        CursosView.getInstance().printCursos();
    }
}