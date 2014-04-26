package com.rick.management.car.spring.persit;

import java.io.Serializable;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.repository.NoRepositoryBean;
@NoRepositoryBean
public interface JpaBaseRepo<T,ID extends Serializable> extends JpaRepository<T,ID> {

}
