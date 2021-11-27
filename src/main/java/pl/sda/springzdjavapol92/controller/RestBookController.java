package pl.sda.springzdjavapol92.controller;


import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import pl.sda.springzdjavapol92.model.Book;

import java.util.Optional;

@RequestMapping("/api/v1")
@RestController
public class RestBookController {

    @PostMapping("/books")
    public ResponseEntity<Book> addBook (@RequestBody Book book){
        book.setId(100);
          return ResponseEntity.status(HttpStatus.CREATED).body(book);
    }

    @GetMapping("/books/{id}")
    public ResponseEntity<Book> readBook(@PathVariable long id){
        final Book book = Book.builder()
                .title("Pan Tadeusz")
                .author("Adam Mickiewicz")
                .id(id)
                .build();
        return ResponseEntity.of(id < 20 ? Optional.of(book) : Optional.empty());
    }
}
