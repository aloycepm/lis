package io.lis.spring.repository;


import io.lis.spring.model.Membership;
import org.springframework.data.repository.CrudRepository;

public interface MembershipRepository extends CrudRepository<Membership, Long> {
}
