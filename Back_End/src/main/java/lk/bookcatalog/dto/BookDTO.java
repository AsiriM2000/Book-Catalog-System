package lk.bookcatalog.dto;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.ToString;

/**
 * @author : Asiri Madhusanka
 * @since : 0.1.0
 **/
@NoArgsConstructor
@AllArgsConstructor
@Data
@ToString
public class BookDTO {
    private String id;
    private String name;
    private String category;
    private String price;
    private String author;
    private String qty;
}
