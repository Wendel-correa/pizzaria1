package br.com.tech4pizza.pizzaria.repository;

import org.springframework.data.mongodb.repository.MongoRepository;

import br.com.tech4pizza.pizzaria.model.PizzaCompletoDTO;


public interface PizzaRepository extends MongoRepository<PizzaCompletoDTO, String> {
  
}
