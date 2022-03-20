package com.thai.maesquecodamapi.src.controller;

import com.thai.maesquecodamapi.src.entity.MaesQueCodam;
import com.thai.maesquecodamapi.src.repository.MaesQueCodamRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import javax.transaction.Transactional;
import java.util.List;

@RestController
@RequestMapping(value="/api")
public class MaesQueCodamController {

    @Autowired
    private MaesQueCodamRepository repository;

    @GetMapping(value="/maes")
    public List<MaesQueCodam> consultar() {
        return repository.findAll();
    }

}


