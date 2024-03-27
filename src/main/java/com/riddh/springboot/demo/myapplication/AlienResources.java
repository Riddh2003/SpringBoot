package com.riddh.springboot.demo.myapplication;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;
import java.util.List;

@RestController
public class AlienResources {
    @Autowired
    AlienRepository repo;
    @GetMapping("aliens")
     public List<Alien> getAliens(){
         List<Alien> aliens = (List<Alien>) repo.findAll();
         return aliens;
     }
}
