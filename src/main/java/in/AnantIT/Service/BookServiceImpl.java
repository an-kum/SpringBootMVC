package in.AnantIT.Service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import in.AnantIT.Entity.Books;
import in.AnantIT.Repo.BookRepo;

@Service
public class BookServiceImpl implements BookService {

	@Autowired
	private BookRepo repo;
	
	@Override
	public List<Books> getAllBooks() {
//		List<Books> all = repo.findAll();
//		return all;
		
		return repo.findAll();
	}

	@Override
	public Boolean saveBook(Books bk) {
		Books save = repo.save(bk);				// getting the generated value for id here
//		if (save.getId() != null) {
//			return true;
//		}
//		return false;
		
		return save.getId() != null ;
	}

	@Override
	public void deleteBook(Integer id) {
		repo.deleteById(id);
	}

}
