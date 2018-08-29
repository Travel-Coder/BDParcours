package be.evoliris.formation.bdparcours.database.dao;

import java.util.ArrayList;

public interface IDao<E> {

    long insert(E entity);

    ArrayList<E> getAll();
    E getById(long id);

    boolean update(E entity);

    void delete(long id);

}
