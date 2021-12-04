package pl.sda.springzdjavapol92;

import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import pl.sda.springzdjavapol92.entity.AppUser;
import pl.sda.springzdjavapol92.entity.Article;
import pl.sda.springzdjavapol92.entity.Author;
import pl.sda.springzdjavapol92.entity.EntityBook;
import pl.sda.springzdjavapol92.repository.*;

import java.util.*;

@SpringBootApplication
public class SpringZdjavapol92Application implements CommandLineRunner {
    final TodoRepository todoRepository;
    final BookRepository bookRepository;
    final ArticleRepository articleRepository;
    final AuthorRepository authorRepository;
    final AppUserRepository appUserRepository;

    public SpringZdjavapol92Application(TodoRepository todoRepository, BookRepository bookRepository, ArticleRepository articleRepository, AuthorRepository authorRepository, AppUserRepository appUserRepository) {
        this.todoRepository = todoRepository;
        this.bookRepository = bookRepository;
        this.articleRepository = articleRepository;
        this.authorRepository = authorRepository;
        this.appUserRepository = appUserRepository;
    }

    public static void main(String[] args) {
        SpringApplication.run(SpringZdjavapol92Application.class, args);
    }

    @Override
    public void run(String... args) throws Exception {
//        EntityTodo todo = new EntityTodo();
//        todo.setPerson("Adam");
//        todo.setTitle("Test");
//        todo.setDeadline(LocalDate.of(2021, 12, 12));
//        todoRepository.save(todo);
//        todo = new EntityTodo();
//        todo.setPerson("Ewa");
//        todo.setTitle("Java");
//        todo.setDeadline(LocalDate.of(2021, 12, 16));
//        todoRepository.save(todo);
        bookRepository.save(EntityBook.builder()
                .author("Bloch")
                .title("Java")
                .build());
        bookRepository.save(EntityBook.builder()
                .author("Bloch")
                .title("Effective Java")
                .build());
        bookRepository.save(EntityBook.builder()
                .author("Freeman")
                .title("Asp.NET")
                .build());
        bookRepository.save(EntityBook.builder()
                .author("Freeman")
                .title("Java for greens")
                .build());
        bookRepository.flush();
        appUserRepository.save(
                AppUser.builder()
                        .email("karol@op.pl")
                        .password("$2a$12$rZaMF9qvM5yw1mNIMeNbjeIiSLUL/p9Jf8jlFEUtGaqhS9zJWtOH.")
                        .enabled(true)
                        .role("ROLE_USER")
                        .build()
        );
        //Dodaj uzytkownika z rola admin
        appUserRepository.save(
                AppUser.builder()
                        .email("admin@admin.pl")
                        .password("$2a$12$8oCEcOcaLQ3TQzLV9bYv/.FtpzCInluEz8G0z/av6c9xkxPMHhrmm")
                        .enabled(true)
                        .role("ROLE_ADMIN")
                        .build()
        );
    }
}