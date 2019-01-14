package com.springredux.controller;

import com.springredux.model.Book;
import com.springredux.repository.BookRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("/api/books")
public class BookController {

    @Autowired
    private BookRepository bookRepository;

    @GetMapping
    public ResponseEntity<List<Book>> getAllBooks(){
        List<Book> books = bookRepository.findAll();
        return new ResponseEntity<List<Book>>(books , HttpStatus.OK);
    }

    @PostMapping
    public ResponseEntity<Book> creatNewBook(@RequestBody Book book){
        Book bookSaved = bookRepository.save(book);
        return new ResponseEntity<Book>(bookSaved , HttpStatus.OK);
    }

    @GetMapping("/{id}")
    public ResponseEntity<Book> getBook(@PathVariable Long id){
        Optional<Book> book = bookRepository.findById(id);
        if (book.isPresent()){
            return new ResponseEntity<>(book.get() , HttpStatus.OK);
        }
        return new ResponseEntity<>(HttpStatus.NOT_FOUND);
    }

    @PutMapping
    public ResponseEntity<Book> updateBook(@RequestBody Book book){
        Book bookUpdated = bookRepository.save(book);
        return new ResponseEntity<Book>(bookUpdated , HttpStatus.OK);
    }

    @DeleteMapping("/{id}")
    public ResponseEntity<Void> deleteBook(@PathVariable Long id){
        Book book = bookRepository.getOne(id);
        bookRepository.delete(book);
        return new ResponseEntity<Void>(HttpStatus.OK);
    }

}
