package DAO;

import Model.UserModel;
import exception.UserNotFoundException;

import java.time.format.DateTimeFormatter;
import java.util.ArrayList;
import java.util.List;

public class UserDAOv2 {

    private long nextId = 1L;

    private final List<UserModel> models = new ArrayList<>();

    public UserModel save(final UserModel model){
        model.setId(nextId++);
        this.models.add(model);
        return model;
    }

    public UserModel update(final UserModel model){
       var toUpdate = findById(model.getId());
        models.remove(toUpdate);
        models.add(model);
        return model;
    }

    public void deleteById(final long id){
        var toDelete = findById(id);
        this.models.remove(toDelete);
    }

    public UserModel findById(final long id){
        String message = String.format("user ID %s do not exist", id);
        return models.stream().filter(u -> u.getId() == id)
                .findFirst()
                .orElseThrow(() -> new UserNotFoundException(message));
    }

    public List<UserModel> findAll(){
        System.out.println("Listing all users");
        return models;
    }

}
