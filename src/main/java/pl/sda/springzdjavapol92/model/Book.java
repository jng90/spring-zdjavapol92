package pl.sda.springzdjavapol92.model;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.hibernate.validator.constraints.Length;

import javax.validation.constraints.NotBlank;
import javax.validation.constraints.NotNull;

@Data
@Builder
@NoArgsConstructor
@AllArgsConstructor

public class Book {
        @NotBlank
        @Length(max = 120)
        private String title;
        @Length (min = 3, max = 15)
        private String author;
        private long id;
}
