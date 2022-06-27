package com.learn.jsp.repo;

import org.springframework.data.jpa.repository.JpaRepository;

import com.learn.jsp.model.Book;

//JpaRepository - Handle the sql query
public interface BookRepo extends JpaRepository<Book, Integer> {

}
