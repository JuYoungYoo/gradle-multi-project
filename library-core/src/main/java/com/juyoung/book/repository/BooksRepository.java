package com.juyoung.book.repository;


import com.juyoung.book.domain.Books;
import org.springframework.data.jpa.repository.JpaRepository;

public interface BooksRepository extends JpaRepository<Books, Long>{  // JpaRepository<Entity type, PK type>

    Books findById(long id);
    boolean existsByTitle(String title);

}
