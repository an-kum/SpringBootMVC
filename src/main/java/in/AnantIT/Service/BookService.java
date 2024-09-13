package in.AnantIT.Service;


import java.util.List;

import org.springframework.stereotype.Service;

import in.AnantIT.Entity.Books;


public interface BookService {
	public List<Books> getAllBooks();
	
	public Boolean saveBook(Books bk) ;
	
	public void deleteBook(Integer id);
	
}
