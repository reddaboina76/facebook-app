package com.facebook.dao;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.facebook.pojo.User;

@Repository
public interface IRegisterDao extends CrudRepository<User, String> {

}
