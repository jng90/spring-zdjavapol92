package pl.sda.springzdjavapol92.Service;

import pl.sda.springzdjavapol92.model.Todo;

import java.util.List;

public interface TodoService {
    Todo add(Todo todo);
    List<Todo> findAll();
    void setAsCompleted(long id);
}
