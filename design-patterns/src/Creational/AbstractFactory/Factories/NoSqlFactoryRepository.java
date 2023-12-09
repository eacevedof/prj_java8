package Creational.AbstractFactory.Factories;


import Creational.AbstractFactory.Repositories.NoSql.AlumnosNoSqlRepository;
import Creational.AbstractFactory.Repositories.Interfaces.AlumnosRepositoryInterface;
import Creational.AbstractFactory.Repositories.NoSql.CursosNoSqlRepository;
import Creational.AbstractFactory.Repositories.Interfaces.CursosRepositoryInterface;

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
