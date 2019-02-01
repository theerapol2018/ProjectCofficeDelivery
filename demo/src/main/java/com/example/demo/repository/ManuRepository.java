package com.example.demo.repository;

import com.example.demo.entity.Manu;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.rest.core.annotation.*;

import java.util.Optional;


@RepositoryRestResource
public interface ManuRepository extends JpaRepository<Manu, Long> {
    Manu findByManuid(int manuid);


}
