package Creational.AbstractFactory.Factories;


import Creational.AbstractFactory.Repositories.Relational.AlumnosRelationalRepository;
import Creational.AbstractFactory.Repositories.Interfaces.AlumnosRepositoryInterface;
import Creational.AbstractFactory.Repositories.Relational.CursosRelationalRepository;
import Creational.AbstractFactory.Repositories.Interfaces.CursosRepositoryInterface;

public class RelationalFactoryRepository implements AbstractFactoryRepositoryInterface {

    public static RelationalFactoryRepository getInstance() {
        return new RelationalFactoryRepository();
    }

    @Override
    public AlumnosRepositoryInterface getAlumnosRepository() {
        return AlumnosRelationalRepository.getInstance();
    }

    @Override
    public CursosRepositoryInterface getCursosRepository() {
        return CursosRelationalRepository.getInstance();
    }
}
