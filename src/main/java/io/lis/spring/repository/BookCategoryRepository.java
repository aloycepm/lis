package io.lis.spring.repository;

import io.lis.spring.model.BookCategory;
import org.springframework.data.repository.CrudRepository;

public interface BookCategoryRepository extends CrudRepository<BookCategory, Long> {
}
