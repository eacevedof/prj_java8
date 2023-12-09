import Creational.AbstractFactory.Views.AlumnosView;
import Creational.AbstractFactory.Views.CursosView;

public final class Main {
    public static void main(String[] args) {
        AlumnosView.getInstance().printAlumnos();
        CursosView.getInstance().printCursos();
    }
}