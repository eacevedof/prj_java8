package Creational.AbstractFactory.Repositories;

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
