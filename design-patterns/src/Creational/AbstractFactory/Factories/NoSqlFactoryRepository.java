package Creational.AbstractFactory.Factories;


import Creational.AbstractFactory.Repositories.AlumnosNoSqlRepository;
import Creational.AbstractFactory.Repositories.AlumnosRepositoryInterface;
import Creational.AbstractFactory.Repositories.CursosNoSqlRepository;
import Creational.AbstractFactory.Repositories.CursosRepositoryInterface;

public class NoSqlFactoryRepository implements AbstractFactoryRepositoryInterface {
    public static NoSqlFactoryRepository getInstance() {
        return new NoSqlFactoryRepository();
    }
    @Override
    public AlumnosRepositoryInterface getAlumnosRepository() {
        return AlumnosNoSqlRepository.getInstance();
    }

    @Override
    public CursosRepositoryInterface getCursosRepository() {
        return CursosNoSqlRepository.getInstance();
    }
}
