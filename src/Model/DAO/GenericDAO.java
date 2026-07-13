package Model.DAO;

import Model.entities.GenerecDomain;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Optional;
import java.util.function.Predicate;

public abstract class GenericDAO<ID, T extends GenerecDomain<ID>> {

    private final List<T> db = new ArrayList<>();

    public boolean save(int batch, T ... domains){
        System.out.printf("Salvando em lote (%s) \n", batch);
        return db.addAll(Arrays.stream(domains).toList());
    }

    private T save(T domain){
        db.add(domain);
        return domain;
    }

    public T update(ID id, T domain){
        var storage = find(d -> d.getId().equals(id))
                .orElseThrow();
        db.remove(storage);
        return save(domain);
    }

    public boolean delete(T domain){
        return db.remove(domain);
    }

    public Optional<T> find(Predicate<T> filterCallBack){
        return db.stream().filter(filterCallBack).findFirst();
    }

    public List<T> findAll(){
        return db;
    }

    public int  count(){
        return db.size();
    }
}
