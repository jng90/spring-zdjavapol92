package pl.sda.springzdjavapol92.Service;

import pl.sda.springzdjavapol92.model.Todo;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class TodoServiceMemory implements TodoService {
    private Map<Integer, Todo> todos = new HashMap<>();

    @Override
    public void add(Todo todo) {

    }

    @Override
    public List<Todo> findAll() {
        return null;
    }

    @Override
    public void setAsCompleted(int id) {

    }
}
