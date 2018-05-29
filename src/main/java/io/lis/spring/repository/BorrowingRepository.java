package io.lis.spring.repository;

import io.lis.spring.model.Borrowing;
import org.springframework.data.repository.CrudRepository;

public interface BorrowingRepository extends CrudRepository<Borrowing, Long> {
}
