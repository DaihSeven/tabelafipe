package com.api.tabelafipe.repository;


import com.api.tabelafipe.model.InteresseModel;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;


@Repository
public interface InteresseRepository extends JpaRepository<InteresseModel, Long> {
}