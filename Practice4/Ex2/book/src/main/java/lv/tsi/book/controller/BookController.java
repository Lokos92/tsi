package lv.tsi.book.controller;

import lombok.RequiredArgsConstructor;
import lv.tsi.book.model.Book;
import lv.tsi.book.repository.BookRepository;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequiredArgsConstructor
public class BookController {
    private final BookRepository bookRepository;

    @GetMapping("/getbooks")
    public ResponseEntity<List<Book>> getAllBooks(){
        return ResponseEntity.ok(bookRepository.findAll());
    }

    @GetMapping("/getbook/{id}")
    public ResponseEntity<Book> getAllBookId(@PathVariable Long id){
        return bookRepository.findById(id)
                .map(ResponseEntity::ok)
                .orElse(ResponseEntity.status(HttpStatus.NOT_FOUND).build());
    }

    @PostMapping("/book")
    public ResponseEntity<Book> addBook(@RequestBody Book book){
        var saveBook = bookRepository.save(book);

        return ResponseEntity.status(HttpStatus.CREATED)
                .body(saveBook);
    }

}
