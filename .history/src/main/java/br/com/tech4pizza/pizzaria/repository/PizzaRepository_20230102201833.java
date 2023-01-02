package br.com.tech4pizza.pizzaria.repository;

import org.springframework.data.mongodb.repository.MongoRepository;

import br.com.tech4pizza.pizzaria.shared.PizzaCompletoDto;
import br.com.tech4pizza.pizzaria.shared.PizzaDto;


public interface PizzaRepository extends MongoRepository<PizzaCompletoDto, PizzaDto,  String> {
  
}
