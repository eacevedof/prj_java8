package Creational.AbstractFactory.Repositories;

public class NoSqlFactoryRepository implements AbstractFactoryRepositoryInterface {
    @Override
    public AlumnosRepositoryInterface getAlumnosRepository() {
        return AlumnosNoSqlRepository.getInstance();
    }

    @Override
    public CursosRepositoryInterface getCursosRepository() {
        return CursosNoSqlRepository.getInstance();
    }
}
