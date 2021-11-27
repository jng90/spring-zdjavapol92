package pl.sda.springzdjavapol92.controller;


import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import pl.sda.springzdjavapol92.dto.NewTodoDto;
import pl.sda.springzdjavapol92.model.Todo;

import java.sql.Timestamp;
import java.time.LocalDateTime;
import java.time.ZoneOffset;
import java.util.Optional;

@RestController
public class RestTodoController {

    @GetMapping("/api/v1/test")
    public String test () {
        return "test";
    }

    @PostMapping("/api/v1/todos/{id}")
    public ResponseEntity<Todo> addTodo(@RequestBody NewTodoDto dto){
        //TODO zapisac do bazy przeslanie zadanie
        final Todo todo = Todo.builder()
                .person(dto.getPerson())
                .title(dto.getTitle())
                .deadline(dto.getDeadline())
                .id(100)
                .created(Timestamp.from(LocalDateTime.now().toInstant(ZoneOffset.UTC)))
                .build();
        return ResponseEntity.status(HttpStatus.CREATED).body(todo);
    }

    @GetMapping("/api/v1/todos/{id}")
    public ResponseEntity<Todo> readTodo(@PathVariable long id) {
        final Todo todo = Todo.builder()
                .completed(false)
                .id(id)
                .title("Testowy")
                .person("Felek")
                .deadline("2021-12-12")
                .build();
        return ResponseEntity.of(id < 50 ? Optional.of(todo) : Optional.empty());
    }

    @PutMapping("/api/v1/todos/{id}")
    public ResponseEntity<Todo> updateTodo(@PathVariable long id, @RequestBody NewTodoDto todoUpdate){
        //TODO wyciagamy obiekt o danym id i zmieniamy w nim pola na wartosci w todoUpdate
        Todo todo = Todo.builder()
                .id(id)
                .person(todoUpdate.getPerson())
                .deadline(todoUpdate.getDeadline())
                .title(todoUpdate.getTitle())
                .build();
        return ResponseEntity.of(id < 10 ? Optional.of(todo) : Optional.empty());
    }

    @PatchMapping("/api/v1/todos/{id}")
    public ResponseEntity<Todo> setTodoAsCompleted(@PathVariable long id){

    }


}
