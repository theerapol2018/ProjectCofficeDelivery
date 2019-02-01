package com.example.demo.controller;

import com.example.demo.entity.Manu;
import com.example.demo.repository.ManuRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.Collection;
import java.util.stream.Collectors;

@RestController
@CrossOrigin(origins = "http://localhost:4200")
public class ManuController {


    @Autowired
    private ManuRepository manuRepository;

    private boolean isManu(Manu manu) {
        return !manu.getName().equals("no no!");
    }
    @GetMapping("/Manu")
    public Collection<Manu> menu() {
        return manuRepository.findAll().stream()
                .filter(this::isManu)
                .collect(Collectors.toList());
    }

}
