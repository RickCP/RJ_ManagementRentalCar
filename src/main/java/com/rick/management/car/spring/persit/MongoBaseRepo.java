package com.rick.management.car.spring.persit;

import java.io.Serializable;

import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.data.repository.NoRepositoryBean;

/**
 *
 * @author lvhuy08t2@gmail.com
 *
 */
@NoRepositoryBean
public interface MongoBaseRepo<T,ID extends Serializable> extends MongoRepository<T, ID> {

}
