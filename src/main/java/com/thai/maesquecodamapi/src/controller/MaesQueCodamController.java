package com.thai.maesquecodamapi.src.controller;

import com.thai.maesquecodamapi.src.MaesQueCodam;
import com.thai.maesquecodamapi.src.repository.MaesQueCodamRepository;
import lombok.AllArgsConstructor;
import lombok.NoArgsConstructor;
import lombok.RequiredArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Component;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@NoArgsConstructor
@AllArgsConstructor
@RequiredArgsConstructor
@Component
public class MaesQueCodamController {

    @Autowired
    private MaesQueCodamRepository repository;

    @GetMapping(path = "/api/maes")
    public List<MaesQueCodam> getAllMaes() {
        return repository.findAll();
    }

}


