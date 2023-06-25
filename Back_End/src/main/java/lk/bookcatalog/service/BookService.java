package lk.bookcatalog.service;

import lk.bookcatalog.dto.BookDTO;

import java.util.ArrayList;

/**
 * @author : Asiri Madhusanka
 * @since : 0.1.0
 **/
public interface BookService {
    public void saveBook(BookDTO bookDTO);
    ArrayList<BookDTO> getAllBook();
    String generateBookId();
}
