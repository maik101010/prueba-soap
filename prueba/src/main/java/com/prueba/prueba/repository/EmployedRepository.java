package com.prueba.prueba.repository;

import com.prueba.prueba.entity.Employed;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

/**
 * Created by michael.garcia on 6/02/2022
 */
@Repository
public interface EmployedRepository extends JpaRepository<Employed, Long> {

}
