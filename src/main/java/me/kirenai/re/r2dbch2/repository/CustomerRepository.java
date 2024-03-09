package me.kirenai.re.r2dbch2.repository;

import me.kirenai.re.r2dbch2.entity.Customer;
import org.springframework.data.repository.reactive.ReactiveCrudRepository;

public interface CustomerRepository extends ReactiveCrudRepository<Customer, Long> {
}
