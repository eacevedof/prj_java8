package Creational.AbstractFactory.Factories;

import Creational.AbstractFactory.Repositories.AlumnosRepositoryInterface;
import Creational.AbstractFactory.Repositories.CursosRepositoryInterface;

public interface AbstractFactoryRepositoryInterface {
     AlumnosRepositoryInterface getAlumnosRepository();
     CursosRepositoryInterface getCursosRepository();
}
