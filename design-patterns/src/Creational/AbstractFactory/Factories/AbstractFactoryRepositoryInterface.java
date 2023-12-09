package Creational.AbstractFactory.Factories;

import Creational.AbstractFactory.Repositories.Interfaces.AlumnosRepositoryInterface;
import Creational.AbstractFactory.Repositories.Interfaces.CursosRepositoryInterface;

public interface AbstractFactoryRepositoryInterface {
     AlumnosRepositoryInterface getAlumnosRepository();
     CursosRepositoryInterface getCursosRepository();
}
