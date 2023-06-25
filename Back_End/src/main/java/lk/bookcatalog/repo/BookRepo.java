package lk.bookcatalog.repo;

import lk.bookcatalog.entity.Book;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import java.util.List;

/**
 * @author : Asiri Madhusanka
 * @since : 0.1.0
 **/
public interface BookRepo extends JpaRepository<Book,String> {
    @Query(value = "SELECT id FROM Book ORDER BY id DESC LIMIT 1", nativeQuery = true)
    String generateBookId();

    @Query(value = "select * from Book where author=?",nativeQuery = true)
    List<Book> searchBookAuthor(String author);
}
