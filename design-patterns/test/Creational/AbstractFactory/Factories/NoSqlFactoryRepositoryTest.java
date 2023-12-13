package Creational.AbstractFactory.Factories;

import Creational.AbstractFactory.Repositories.Interfaces.AlumnosRepositoryInterface;

import static org.hamcrest.Matchers.instanceOf;
import static org.hamcrest.junit.MatcherAssert.assertThat;
import static org.junit.jupiter.api.Assertions.*;

final class NoSqlFactoryRepositoryTest {

    @org.junit.jupiter.api.BeforeEach
    void setUp() {
    }

    @org.junit.jupiter.api.AfterEach
    void tearDown() {
    }

    @org.junit.jupiter.api.Test
    void getInstance() {
        assertThat(
            NoSqlFactoryRepository.getInstance(),
            instanceOf(NoSqlFactoryRepository.class)
        );
    }

    @org.junit.jupiter.api.Test
    void wrongInstance() {
        assertNotEquals(
            new Object(),
            instanceOf(AlumnosRepositoryInterface.class)
        );
    }

    @org.junit.jupiter.api.Test
    void getAlumnosRepository() {
        assertThat(
            NoSqlFactoryRepository.getInstance().getAlumnosRepository(),
            instanceOf(AlumnosRepositoryInterface.class)
        );
    }

    @org.junit.jupiter.api.Test
    void getCursosRepository() {
        assertThat(
            NoSqlFactoryRepository.getInstance().getAlumnosRepository(),
            instanceOf(AlumnosRepositoryInterface.class)
        );
    }
}