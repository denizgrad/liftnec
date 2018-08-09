package com.softnec.liftnec.repository;

import com.softnec.liftnec.model.domain.Elevator;
import org.springframework.data.repository.CrudRepository;

public interface ProductRepository extends CrudRepository<Elevator, Long> {
}
