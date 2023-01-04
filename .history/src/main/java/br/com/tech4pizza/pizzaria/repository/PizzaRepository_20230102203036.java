package br.com.tech4pizza.pizzaria.repository;

import org.springframework.data.mongodb.repository.MongoRepository;
import br.com.tech4pizza.pizzaria.shared.Pizza;


public interface PizzaRepository extends MongoRepository<Pizza, String> {
  
}
