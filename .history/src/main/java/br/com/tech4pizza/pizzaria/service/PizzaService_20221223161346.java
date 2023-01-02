package br.com.tech4pizza.pizzaria.service;

import java.util.List;
import java.util.Optional;
import br.com.tech4pizza.pizzaria.model.Pizza;


public interface PizzaService {
  List<Pizza> obterTodasAsPizzas();
  Optional<Pizza> ObterPizzaPorId(String id);
  void excluirPizzaPorId(String id);
  Pizza cadastrarPizza(Pizza pizza);
  Optional<Pizza> atualizarPetPorId(String id, Pizza pizza);  
}
