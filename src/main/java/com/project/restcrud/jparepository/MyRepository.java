package com.project.restcrud.jparepository;

import org.springframework.data.jpa.repository.JpaRepository;

public interface MyRepository<T> extends JpaRepository<T, Integer> {

}
