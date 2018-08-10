package com.softnec.liftnec.repository;

import com.softnec.liftnec.model.domain.BaseModel;
import org.springframework.data.repository.CrudRepository;

import java.io.Serializable;

public interface BaseDao <T extends BaseModel> extends CrudRepository<T, Serializable> {
}
