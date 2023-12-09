package Creational.AbstractFactory.Factories;


import Creational.AbstractFactory.Repositories.AlumnosRelationalRepository;
import Creational.AbstractFactory.Repositories.AlumnosRepositoryInterface;
import Creational.AbstractFactory.Repositories.CursosRelationalRepository;
import Creational.AbstractFactory.Repositories.CursosRepositoryInterface;

public class RelationalFactoryRepository implements AbstractFactoryRepositoryInterface {
    @Override
    public AlumnosRepositoryInterface getAlumnosRepository() {
        return AlumnosRelationalRepository.getInstance();
    }

    @Override
    public CursosRepositoryInterface getCursosRepository() {
        return CursosRelationalRepository.getInstance();
    }
}