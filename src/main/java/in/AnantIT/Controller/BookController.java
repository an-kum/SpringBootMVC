package in.AnantIT.Controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

import in.AnantIT.Entity.Books;
import in.AnantIT.Service.BookService;

@Controller
public class BookController {
	@Autowired
	private BookService serv;
	
	@GetMapping("/book")
	public ModelAndView getBooks() {
		List<Books> allBooks = serv.getAllBooks();
		
		ModelAndView mav = new ModelAndView();
		mav.addObject("key",allBooks);
		mav.setViewName("BookShow");
		return mav;
	}
	
	@GetMapping("/creation")
	public ModelAndView createNew() {
	    ModelAndView mav = new ModelAndView();
	   
	    mav.addObject("key2", new Books());
	    mav.setViewName("index");
	    return mav;
	    
	}

	@PostMapping("/save")
	public ModelAndView acceptNew(@ModelAttribute("key2") Books bk) {
		ModelAndView mav = new ModelAndView();
		Boolean saveBook = serv.saveBook(bk);
		if (saveBook) {
			mav.addObject("succMsg","Book is Saved Successfully.");
		}else {
			mav.addObject("ErrMsg", "Book can't be saved at this moment");
		}
		mav.setViewName("index");
		return mav;
	}
	
	@GetMapping("/delete")
	public ModelAndView deleteOne(@RequestParam("num") Integer delId) {
		serv.deleteBook(delId);
	
		List<Books> allBooks = serv.getAllBooks();
		
		ModelAndView mav = new ModelAndView();
		mav.addObject("key",allBooks);
		mav.setViewName("BookShow");
		return mav;
	}
	
	public BookController() {
		System.out.println("Book controller :: constructor is called....");
	}
	
}
