package lk.bookcatalog.service.impl;

import lk.bookcatalog.dto.BookDTO;
import lk.bookcatalog.entity.Book;
import lk.bookcatalog.repo.BookRepo;
import lk.bookcatalog.service.BookService;
import org.modelmapper.ModelMapper;
import org.modelmapper.TypeToken;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import javax.transaction.Transactional;
import java.util.ArrayList;

/**
 * @author : Asiri Madhusanka
 * @since : 0.1.0
 **/
@Service
@Transactional
public class BookServiceImpl implements BookService {

    @Autowired
    BookRepo repo;

    @Autowired
    ModelMapper mapper;

    @Override
    public void saveBook(BookDTO bookDTO) {
        if (repo.existsById(bookDTO.getId())){
            throw new RuntimeException("Book "+bookDTO.getId()+" Already Exist...!");
        }
        repo.save(mapper.map(bookDTO, Book.class));
    }

    @Override
    public void deleteBook(String id) {
        if (!repo.existsById(id)){
            throw new RuntimeException("Book "+id+" Not Available to Delete...!");
        }
        repo.deleteById(id);
    }

    @Override
    public void updateBook(BookDTO bookDTO) {
        if (!repo.existsById(bookDTO.getId())) {
            throw new RuntimeException("Book "+bookDTO.getId()+" Not Available To Update...!");
        }
        repo.save(mapper.map(bookDTO,Book.class));
    }

    @Override
    public ArrayList<BookDTO> getAllBook() {
        return mapper.map(repo.findAll(), new TypeToken<ArrayList<BookDTO>>(){}.getType());
    }

    @Override
    public ArrayList<BookDTO> searchBookId(String id) {
        if (!repo.existsById(id)) {
            throw new RuntimeException("Not Available This Book...!");
        }
        return mapper.map(repo.searchBookId(id), new TypeToken<ArrayList<BookDTO>>(){}.getType());
    }

    @Override
    public String generateBookId() {
        long count = repo.count();
        String id = "B00-001";

        if (count != 0) {
            String generateBookId = repo.generateBookId();
            int tempId = Integer.parseInt(generateBookId.split("-")[1]);
            tempId += 1;
            if (tempId < 10) {
                id = "B00-00" + tempId;
            } else if (tempId < 100) {
                id = "B00-0" + tempId;
            } else if (tempId < 1000) {
                id = "B00-" + tempId;
            }
        } else {
            id = "B00-001";
        }
        return id;
    }
}
