package lk.bookcatalog.entity;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.Entity;
import javax.persistence.Id;

/**
 * @author : Asiri Madhusanka
 * @since : 0.1.0
 **/
@NoArgsConstructor
@AllArgsConstructor
@Data
@Entity
public class Book {
    @Id
    private String id;
    private String name;
    private String category;
    private String price;
    private String author;
    private String qty;
}
