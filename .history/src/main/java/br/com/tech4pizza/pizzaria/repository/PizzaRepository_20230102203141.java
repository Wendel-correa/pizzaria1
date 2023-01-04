package br.com.tech4pizza.pizzaria.repository;

import org.springframework.data.mongodb.repository.MongoRepository;



public interface PizzaRepository extends MongoRepository<PizzaCompletoDto, String> {
  
}
