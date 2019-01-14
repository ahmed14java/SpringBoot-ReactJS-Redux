package com.springredux;

import com.springredux.model.Book;
import com.springredux.repository.BookRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import java.util.Date;

@SpringBootApplication
public class SpringreactreduxApplication implements CommandLineRunner{

	@Autowired
	private BookRepository bookRepository;

	public static void main(String[] args) {
		SpringApplication.run(SpringreactreduxApplication.class, args);
	}

	@Override
	public void run(String... args) throws Exception {
//		Book book1 = new Book();
//		book1.setAuthor("Ahmed hassan");
//		book1.setDate(new Date());
//		book1.setDescription("Test description");
//		book1.setTitle("Spring Boot");
//
//
//		Book book2 = new Book();
//		book2.setAuthor("Bit matrix");
//		book2.setDate(new Date());
//		book2.setDescription("Matrix description");
//		book2.setTitle("React and Redux");
//
//		bookRepository.save(book1);
//		bookRepository.save(book2);

	}
}

