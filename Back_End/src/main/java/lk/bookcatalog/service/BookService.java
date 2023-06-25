package lk.bookcatalog.service;

import lk.bookcatalog.dto.BookDTO;

import java.util.ArrayList;

/**
 * @author : Asiri Madhusanka
 * @since : 0.1.0
 **/
public interface BookService {
    public void saveBook(BookDTO bookDTO);
    public void deleteBook(String id);
    ArrayList<BookDTO> getAllBook();
    String generateBookId();
}
