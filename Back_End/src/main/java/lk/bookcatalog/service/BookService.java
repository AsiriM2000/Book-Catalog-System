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
    public void updateBook(BookDTO bookDTO);
    ArrayList<BookDTO> getAllBook();
    ArrayList<BookDTO> searchBookId(String id);
    String generateBookId();
}
