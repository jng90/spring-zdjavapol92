package pl.sda.springzdjavapol92.entity;

import org.hibernate.annotations.CreationTimestamp;

import javax.persistence.*;
import java.sql.Timestamp;
import java.time.LocalDate;

@Entity
@Table(name = "todos")
public class EntityTodo {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long id;
    @Column(nullable = false)
    private String title;
    @Column(nullable = false)
    private LocalDate deadline;
    @Column(nullable = false)
    private String person;
    private boolean completed;
    @CreationTimestamp
    private Timestamp created;
}
