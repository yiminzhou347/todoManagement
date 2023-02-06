package com.week2.todoManagement.Dao;

import com.week2.todoManagement.Entity.Todo;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface TodoDao extends JpaRepository<Todo,Integer> {
}
