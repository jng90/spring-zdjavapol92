package pl.sda.springzdjavapol92.service;

import org.springframework.context.annotation.Profile;
import org.springframework.stereotype.Service;
import pl.sda.springzdjavapol92.model.Todo;

import java.sql.Timestamp;
import java.time.LocalDateTime;
import java.time.ZoneOffset;
import java.util.*;

@Service
@Profile("dev")
public class TodoServiceInMemory implements TodoService {
    private Map<Long, Todo> todos = new HashMap<>();
    private long currentId = 1;

    public TodoServiceInMemory(){
        Todo todo = Todo.builder()
                .person("Adam")
                .title("Spring")
                .deadline("2021-12-01")
                .build();
        add(todo);
        todo = Todo.builder()
                .person("Ola")
                .title("Programowanie Java")
                .deadline("2022-03-21")
                .build();
        add(todo);
        add(Todo.builder()
                .person("Zenek")
                .title("Koncert")
                .completed(true)
                .deadline("2022-11-01")
                .build());
    }

    @Override
    public Todo add(Todo todo) {
        todo.setId(currentId++);
        todo.setCreated(new Timestamp(LocalDateTime.now().toEpochSecond(ZoneOffset.UTC) * 1000));
        todos.put(todo.getId(), todo);
        return todo;
    }

    @Override
    public List<Todo> findAll() {
        return new ArrayList<>(todos.values());
    }

    @Override
    public void setAsCompleted(long id) {
        todos.get(id).setCompleted(true);


    }
}
