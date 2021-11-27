package pl.sda.springzdjavapol92.model;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;
@Data
@Builder
@NoArgsConstructor
@AllArgsConstructor

public class Book {
        private String title;
        private String author;
        private long id;
}
