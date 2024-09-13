package in.AnantIT.Repo;

import org.springframework.data.jpa.repository.JpaRepository;

import in.AnantIT.Entity.Books;

public interface BookRepo extends JpaRepository<Books, Integer>{

}
