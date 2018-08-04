package com.softnec.liftnec.repository;

import com.softnec.liftnec.model.domain.ExampleModel;
import org.springframework.data.repository.CrudRepository;

public interface ProductRepository extends CrudRepository<ExampleModel, Long> {
}
