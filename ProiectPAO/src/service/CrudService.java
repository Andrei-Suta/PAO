package service;

import java.util.Set;

public interface CrudService<T> {


    Set<T> getAll();
    T save(T obiect);
    void delete(T obiect);


}
