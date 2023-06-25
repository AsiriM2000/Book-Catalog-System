package lk.bookcatalog.controller;

import lk.bookcatalog.dto.BookDTO;
import lk.bookcatalog.service.BookService;
import lk.bookcatalog.util.ResponseUtil;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;

/**
 * @author : Asiri Madhusanka
 * @since : 0.1.0
 **/
@RestController
@RequestMapping("/api/v1/book")
@CrossOrigin
public class BookController {

    @Autowired
    BookService service;

    @PostMapping
    public ResponseUtil saveBook(@RequestBody BookDTO bookDTO){
        service.saveBook(bookDTO);
        return new ResponseUtil("200","Book Add Success",null);
    }

    @GetMapping
    public ResponseUtil getAllBook(){
        ArrayList<BookDTO> allBook = service.getAllBook();
        return new ResponseUtil("200","Success",allBook);
    }

    @GetMapping("/generateBookId")
    public ResponseUtil generateBookId(){
        String id = service.generateBookId();
        return new ResponseUtil("200","Success",id);
    }

    @PutMapping
    public  ResponseUtil updateBook(@RequestBody BookDTO bookDTO){
        service.updateBook(bookDTO);
        return new ResponseUtil("200","Update Success",null);
    }

    @DeleteMapping()
    public ResponseUtil deleteBook(String id){
        service.deleteBook(id);
        return new ResponseUtil("200",id+" Delete Successful",null);
    }
}
