package org.example.flutterbackend.controllers;

import org.example.flutterbackend.models.Spending;
import org.example.flutterbackend.repositories.SpendingRepository;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@CrossOrigin
@RestController
@RequestMapping("/api")
public class SpendingController {
    SpendingRepository repo;

    public SpendingController(SpendingRepository repo) {
        this.repo = repo;
    }
    @GetMapping("/spending")
    public List<Spending> getSpendings(){
        return repo.findAll();
    }
    @PostMapping("/spending")
    public Spending saveSpending(@RequestBody Spending spending){
        return repo.saveAndFlush(spending);
    }
}
