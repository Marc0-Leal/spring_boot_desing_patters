package com.example.actividad.spring_boot_desing_patters.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import com.example.actividad.spring_boot_desing_patters.model.Todo;

public interface TodoRepository extends JpaRepository<Todo, Long> {



}




