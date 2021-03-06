package pl.sda.springzdjavapol92.model;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.sql.Timestamp;



@NoArgsConstructor
@AllArgsConstructor
@Builder
@Data
public class Todo {
    private long id;
    private String title;
    private String deadline;
    private String person;
    private boolean completed;
    private Timestamp created;
}
