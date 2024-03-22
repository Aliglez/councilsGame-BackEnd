package aliGlez.councilsGameBack.interfaces;

import java.util.List;

import aliGlez.councilsGameBack.trails.Trail;



public interface IGenericFullService<T> {
    public List<T> getAll();
    public T getById(Long id) throws Exception;
    public T save(T obj);
    public Trail update(Long id, Trail trail) throws Exception;
    public void deleteById(Long id) throws Exception;
}