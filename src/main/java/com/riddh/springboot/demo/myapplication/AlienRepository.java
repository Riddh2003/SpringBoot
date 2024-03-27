package com.riddh.springboot.demo.myapplication;

import org.springframework.data.repository.CrudRepository;

public interface AlienRepository extends CrudRepository<Alien,Integer> {

}